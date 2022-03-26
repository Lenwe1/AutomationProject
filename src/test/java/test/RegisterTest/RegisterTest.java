package test.RegisterTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    private String newUrl = getBaseUrl()+ "Register.html";

    @Test
    public void completeRegisterForm (){

        driver.get(newUrl);
        Assert.assertTrue(register.checkTitle(), "Title is not displayed");
        register.completeFirstName("Tester");
        register.completeLastName("Wannabe");
        register.setAdress("Str. Testarii nr. 4, ap. 1");
        register.insertEmail("adresa@email.com");
        register.phoneNo("+1234567");
        register.selectGender();
        register.selectHobbies();
        register.setLanguage("Romanian");
        register.setSkills("Java");
        register.selectCountry();
        register.selectCountry2("India");
        register.setDateOfBirth("2022", "february", "7");
        register.fieldPassword("password", "password");
//        register.confirmPassword("password");
        register.setChooseFile();
        register.clickSubmitButton();



    }


}
