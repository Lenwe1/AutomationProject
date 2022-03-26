package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;

import pages.Register.Register;
import pages.homepage.HomePage;

public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public Register register = Register.getInstance();

    @BeforeSuite
    private void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }




}


