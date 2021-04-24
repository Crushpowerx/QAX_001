package tests.other_examples.enum_example;

import data.users.Users;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import static global.Global.globalRandomLetters;

public class EnumExample {

    @Test
    public void test1() {
        globalRandomLetters = RandomStringUtils.randomAlphabetic(5).toLowerCase();
        String email = "autotest." + globalRandomLetters + "@gmail.com";
        System.out.println(email);
        System.out.println(Users.USER_1.getPassword());
        System.out.println(Users.USER_1.getFirstName() + globalRandomLetters);
        System.out.println(Users.USER_1.getLastName() + globalRandomLetters);
    }

}
