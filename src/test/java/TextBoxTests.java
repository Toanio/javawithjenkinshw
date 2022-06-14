import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TextBoxTests {
    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = false;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void studentRegistrationFormTest() {
        RegistrationFormPage registrationFormPage = new RegistrationFormPage();
        registrationFormPage.openPage();
        registrationFormPage.setFirstName();
        registrationFormPage.setLastName();
        registrationFormPage.setEmail();
        registrationFormPage.setGander();
        registrationFormPage.setPhoneNumber();
        registrationFormPage.upLoadPicture();
        registrationFormPage.setCurrentAddress();
        registrationFormPage.setDateOfBirth();
        registrationFormPage.setSubject();
        registrationFormPage.setHobbies();
        registrationFormPage.setState();
        registrationFormPage.setCity();
        registrationFormPage.submitBtnClick();
        registrationFormPage.checkTable();
    }
}
