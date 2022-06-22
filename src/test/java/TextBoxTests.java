import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase{

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
