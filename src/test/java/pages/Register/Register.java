package pages.Register;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class Register extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(Register.class);
    public static Register instance;

    private By title = By.xpath("//div[h1='Automation Demo Site ']");
    //    private By skipSignInButton = By.id("btn2");
    private By FirstName = By.xpath("//input[@ng-model='FirstName']");
    private By LastName = By.xpath("//input[@ng-model='LastName']");
    private By adress = By.xpath("//textarea[@ng-model='Adress']");
    private By insertEmail = By.xpath("//input[@ng-model='EmailAdress']");
    private By phoneNo = By.xpath("//input[@ng-model='Phone']");
    private By selectGender = By.xpath("//input[@value='Male']");
    private By selectHobbies1 = By.xpath("//input[@value='Movies']");
    private By selectHobbies2 = By.xpath("//input[@value='Hockey']");
    private By chooseFileBtn = By.id("imagesrc");
    private By submitButton = By.id("submitbtn");


// Droplist

    private By languages = By.id("msdd");
    String selectLanguage = "//a[contains(text(), %s)]";

// Skills

    String selectSkills = "Skills";

    private By selectCountry = By.id("countries");
//    private By selectCountry2 = By.xpath("//span[@role='combobox']");

    private By selectCountry2 = By.xpath("//span[@role='combobox']");
    private By enterCountry2 = By.xpath("//input[@role='textbox']");
//    String Country2 = "//a[contains(title(), %s)]";

    String selectYear = "yearbox";
    String selectMonth = "//select[ng-model='monthbox']";
    String selectDay = "daybox";

    private By setPassword = By.id("firstpassword");
    private By setPassword2 = By.id("secondpassword");


    private Register() {

    }

    public boolean checkTitle() {
        LOG.info("Check if Title is displayed");
        return driver.findElement(title).isDisplayed();
    }

    public static Register getInstance() {
        if (instance == null) {
            instance = new Register();
        }
        return instance;
    }

    public void completeFirstName(String Fname) {
        LOG.info("Complete First Name");
        driver.findElement(FirstName).sendKeys(Fname);
    }

    public void completeLastName(String Lname) {
        LOG.info("Complete Last Name");
        driver.findElement(LastName).sendKeys(Lname);
    }

    //Formularul Adresa intampina dificultati sau gresesc eu
    public void setAdress(String enterAdress) {
        LOG.info("Insert Adress");
        driver.findElement(adress).sendKeys(enterAdress);
    }


    public void insertEmail(String email) {
        LOG.info("Insert Email");
        driver.findElement(insertEmail).sendKeys(email);
    }


    public void phoneNo(String phone) {
        LOG.info("Insert Phone Number");
        driver.findElement(phoneNo).sendKeys(phone);
    }

    public void selectGender() {
        LOG.info("Select Gender");
        driver.findElement(selectGender).click();
    }

    public void selectHobbies() {
        LOG.info("Select Hobbies");
        driver.findElement(selectHobbies1).click();
        driver.findElement(selectHobbies2).click();
    }

    public void setLanguage(String language) {
        driver.findElement(languages).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language))).click();
    }

    public void setSkills(String skill) {
        Select newSkill = new Select(driver.findElement(By.id(selectSkills)));
        newSkill.selectByValue(skill);
    }

    public void selectCountry() {
        LOG.info("Select Country");
        driver.findElement(selectCountry).click();
    }

    public void selectCountry2(String country) {
        LOG.info("Select Country");
        driver.findElement(selectCountry2).click();
        driver.findElement(enterCountry2).sendKeys(country);
//        driver.findElement(By.xpath(String.format(Country2, country))).click();
    }

//    public void setYear(String year) {
//        Select newSkill = new Select(driver.findElement(By.id(selectYear)));
//        newSkill.selectByValue(year);
//    }
//    public void setMonth(String month) {
//        Select newSkill = new Select(driver.findElement(By.id(selectMonth)));
//        newSkill.selectByValue(month);
//    }
//
//    public void setDay(String day) {
//        Select newSkill = new Select(driver.findElement(By.id(selectDay)));
//        newSkill.selectByValue(day);
//    }

    public void setDateOfBirth(String year, String month, String day) {
        LOG.info("Set Date Of Birth");
        Select newYear = new Select(driver.findElement(By.id(selectYear)));
        newYear.selectByValue(year);

        Select newMonth = new Select(driver.findElement(By.xpath(selectMonth)));
        newMonth.selectByValue(month);

        Select newDay = new Select(driver.findElement(By.id(selectDay)));
        newYear.selectByValue(year);
    }


    public void fieldPassword(String pass, String confirmpass) {
        LOG.info("Check Password field");
        driver.findElement(setPassword).sendKeys(pass);
        driver.findElement(setPassword2).sendKeys(confirmpass);
    }

    public void setChooseFile(){
        LOG.info("Upload a File");
        WebElement fileChoose = driver.findElement(chooseFileBtn);
        fileChoose.sendKeys("C://Img//download.png");

    }

    public void clickSubmitButton() {
        LOG.info("Click the Submit Button");
        driver.findElement(submitButton).click();
    }

    public void scrollToElement() {
        WebElement element = driver.findElement(submitButton);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();


    }

}

//    public void confirmPassword(String password){
//        LOG.info("Confirm Password field");
//        driver.findElement(setPassword2).sendKeys(password);
//    }


//        public void selectSkills() {
//        LOG.info("Select Skills");
//        driver.findElement(skills).click();
//        skills.selectByVisibleText("Java");

//        skills.findElement( ).click();
//    }
//    public static void main(String[] args) {
//        Select skills = new Select(driver.findElement(By.id("//*[@id='Skills']")));
//        skills.selectByVisibleText("Java");
//
//    }


//}


