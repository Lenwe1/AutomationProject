package test.RegisterTest;

import org.testng.annotations.Test;
import test.BaseTest;

public class RegisterTest extends BaseTest {

    @Test
    public void completeRegisterForm (){
        register.skipSignInButton();
        register.completeFirstName("Tester");
        register.completeLastName("Wannabe");
        register.insertEmail("adresa@email.com");
        register.phoneNo("+1234567");
        register.selectGender();
        register.selectHobbies();









    }


}
