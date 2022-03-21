package pages.Register;


import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class Register extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(Register.class);
    public static Register instance;

    private By skipSignInButton = By.id("btn2");
    private By FirstName = By.xpath("//input[@ng-model='FirstName']");
    private By LastName = By.xpath("//input[@ng-model='LastName']");
    private By insertEmail = By.xpath("//input[@ng-model='EmailAdress']");
    private By phoneNo = By.xpath("//input[@ng-model='Phone']");
    private By selectGender = By.xpath("//input[@value='Male']");
    private By selectHobbies1 = By.xpath("//input[@value='Movies']");
    private By selectHobbies2 = By.xpath("//input[@value='Hockey']");
//    private By skills = By.id("//*[@id='Skills']");
//Select skills = new Select(driver.findElement(By.id("//*[@id='Skills']")));


    private Register() {

    }

    public static Register getInstance() {
        if (instance == null) {
            instance = new Register();
        }
        return instance;
    }

    public void skipSignInButton() {
        LOG.info("Click skip sign in button");
        driver.findElement(skipSignInButton).click();

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


}



