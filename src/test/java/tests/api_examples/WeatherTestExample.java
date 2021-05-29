package tests.api_examples;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.OkHttpHelper;

import java.io.IOException;
import java.util.Objects;

public class WeatherTestExample {
    OkHttpHelper okHttpHelper = new OkHttpHelper();

    @Test
    public void checkWeather() throws IOException, ParseException {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) " +
                "Chrome/90.0.4430.212 Safari/537.36";
        String access_key = "02def512c053032e523452b568c00290";
        String query = "New York";
        String endPoint = "http://api.weatherstack.com/current?access_key=" + access_key + "&query=" + query;
        OkHttpClient client = okHttpHelper.createNewClient();
        Request request = okHttpHelper.prepareRequest(endPoint, userAgent);
        Response response = okHttpHelper.getResponse(request, client);
        int responseCode = response.code();
        String responseBody = Objects.requireNonNull(response.body()).string();
        System.out.println(responseCode);
        System.out.println(responseBody);
        JSONParser parser = new JSONParser();
        JSONObject responseJsonObject = (JSONObject) parser.parse(responseBody);
        JSONObject requestJsonObject = (JSONObject) responseJsonObject.get("request");
        String queryJsonObject = String.valueOf(requestJsonObject.get("query"));
        if (queryJsonObject.equals("New York, United States of America")) {
            System.out.println(queryJsonObject);
        } else {
            Assert.fail("Query not equals 'New York, United States of America'");
        }
        JSONObject currentJsonObject = (JSONObject) responseJsonObject.get("current");
        JSONArray weatherDescriptionsJSONArray = (JSONArray) currentJsonObject.get("weather_descriptions");
        System.out.println(weatherDescriptionsJSONArray.get(0));
    }


}
