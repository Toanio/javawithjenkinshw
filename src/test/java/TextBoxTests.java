import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TextBoxTests {
    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "4000x2000";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void studentRegistrationFormTest() {

        registrationFormPage.openPage()
                .setFirstName()
                .setLastName()
                .setEmail()
                .setGander()
                .setPhoneNumber()
                .upLoadPicture()
                .setCurrentAddress()
                .setDateOfBirth()
                .setSubject()
                .setHobbies()
                .setState()
                .setCity()
                .submitBtnClick()
                .checkTable();
    }
}
