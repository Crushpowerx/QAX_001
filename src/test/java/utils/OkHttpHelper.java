package utils;

import io.qameta.allure.Step;
import logger.CustomLogger;
import okhttp3.*;
import org.testng.Assert;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class OkHttpHelper {

    public OkHttpClient getClientWithAuthorization()
            throws IOException {
        String email = "";
        String password = "";
        String endPoint = "";
        String bodyJson = "{\"user\":{\"email\":\"" + email + "\",\"password\":\"" + password + "\"}}";
        final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        @SuppressWarnings("deprecation") RequestBody body = RequestBody.create(JSON, bodyJson);
        final HashMap<String, List<Cookie>> cookieStore = new HashMap<>();
        OkHttpClient client = new OkHttpClient.Builder()
                .callTimeout(5, TimeUnit.MINUTES)
                .connectTimeout(5, TimeUnit.MINUTES)
                .writeTimeout(5, TimeUnit.MINUTES)
                .readTimeout(5, TimeUnit.MINUTES)
                .cookieJar(new CookieJar() {
                    @Override
                    public void saveFromResponse(@Nonnull HttpUrl httpUrl, @Nonnull List<Cookie> list) {
                        cookieStore.put(httpUrl.host(), list);
                    }

                    @Nonnull
                    @Override
                    public List<Cookie> loadForRequest(@Nonnull HttpUrl httpUrl) {
                        List<Cookie> cookies = cookieStore.get(httpUrl.host());
                        return cookies != null ? cookies : new ArrayList<>();
                    }
                })
                .build();
        Request request = new Request.Builder()
                .url(endPoint)
                .post(body)
                .build();
        client.newCall(request).execute();
        return client;
    }

    public void checkProxy(String country, OkHttpClient client) {
        Request request = new Request.Builder().url("https://api.myip.com/").build();
        try (Response response = client.newCall(request).execute()) {
            String responseBody = Objects.requireNonNull(response.body()).string();
            CustomLogger.logger.info(responseBody);
            String[] responseArray;
            String countryCode;
            responseArray = responseBody.split(":");
            countryCode = responseArray[3].replaceAll("\"", "").replaceAll("}", "");
            if (countryCode.equals(country)) {
                CustomLogger.logger.info("Test geolocation by ip passed: " + countryCode + " equals " + country);
            } else {
                Assert.fail("Test geolocation by ip failed: " + countryCode + " not equals " + country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public OkHttpClient createNewClient() {
        return new OkHttpClient.Builder()
                .callTimeout(1, TimeUnit.MINUTES)
                .connectTimeout(1, TimeUnit.MINUTES)
                .writeTimeout(1, TimeUnit.MINUTES)
                .readTimeout(1, TimeUnit.MINUTES)
                .build();
    }

    public Request prepareRequest(String url, String userAgent) {
        return new Request.Builder()
                .header("user-agent", userAgent)
                .url(url)
                .build();
    }

    @Step
    public int getResponseCode(Request request, OkHttpClient client) throws IOException {
        try (Response response = client.newCall(request).execute()) {
            return response.code();
        }
    }

    @Step
    public boolean isRedirect(Request request, OkHttpClient client) throws IOException {
        try (Response response = client.newCall(request).execute()) {
            return response.isRedirect();
        }
    }

    @Step
    public String getLinkOfRedirect(Request request, OkHttpClient client) throws IOException {
        try (Response response = client.newCall(request).execute()) {
            if (response.priorResponse() != null) {
                return String.valueOf(Objects.requireNonNull(response.priorResponse()).request().url());
            } else {
                Assert.fail("The link of redirect is null");
            }
        }
        return "The link of redirect is null";
    }

    public String getResponseBody(Request request, OkHttpClient client) throws IOException {
        try (Response response = client.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }

    public Response getResponse(Request request, OkHttpClient client) throws IOException {
        return client.newCall(request).execute();
    }

}
