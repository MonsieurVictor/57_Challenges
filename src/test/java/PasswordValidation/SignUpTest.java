package PasswordValidation;

import com.chapter4.PasswordValidationFile.SignUpper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignUpTest {

    @Test
    public void isUniqueLoginTestExisting() throws IOException {
        String loginExample = "tymur";
        Assert.assertFalse(isUniqueLoginReceiver(loginExample));
    }

    @Test
    public void isUniqueLoginTestNotExisting() throws IOException {
        String loginExample = "shrek";
        Assert.assertTrue(isUniqueLoginReceiver(loginExample));
    }

    private Boolean isUniqueLoginReceiver(String login) throws IOException {
        SignUpper registrator = new SignUpper();
        return registrator.isUniqueLogin(login);
    }
}
