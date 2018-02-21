package PasswordValidation;

import com.chapter4.PasswordValidationFile.SignUpper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignUpTest {

    @Test (groups = "unit")
    public void isUniqueLoginTestExisting() throws IOException {
        System.out.println("testing password validation unit...");
        String loginExample = "tymur";
        Assert.assertFalse(isUniqueLoginReceiver(loginExample));
    }

    @Test (groups = "web")

    public void isUniqueLoginTestNotExisting() throws IOException {
        System.out.println("testing password validation web...");
        String loginExample = "shrek";
        Assert.assertTrue(isUniqueLoginReceiver(loginExample));
    }

    private Boolean isUniqueLoginReceiver(String login) throws IOException {
        SignUpper registrator = new SignUpper();
        return registrator.isUniqueLogin(login);
    }
}
