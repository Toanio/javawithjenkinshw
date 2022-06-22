import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {

    TestData testData = new TestData();

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationFormPage setFirstName() {
        $("#firstName").setValue(testData.firstName);
        return this;
    }

    public RegistrationFormPage setLastName() {
        $("#lastName").setValue(testData.lastName);
        return this;
    }

    public RegistrationFormPage setEmail() {
        $("#userEmail").setValue(testData.email);
        return this;
    }

    public RegistrationFormPage setGander() {
        $("#genterWrapper").$(byText(testData.gender)).click();
        return this;
    }

    public RegistrationFormPage setPhoneNumber() {
        $("#userNumber").setValue(testData.phoneNumber);
        return this;
    }

    public RegistrationFormPage upLoadPicture() {
        $("#uploadPicture").uploadFromClasspath(testData.image);
        return this;
    }

    public RegistrationFormPage setCurrentAddress() {
        $("#currentAddress").setValue(testData.currentAddress);
        return this;
    }

    public RegistrationFormPage setDateOfBirth() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(testData.month);
        $(".react-datepicker__year-select").selectOptionByValue(testData.year);
        $(byText(testData.day)).click();
        return this;
    }

    public RegistrationFormPage setSubject() {
        $("#subjectsInput").setValue(testData.subject).pressEnter();
        return this;
    }

    public RegistrationFormPage setHobbies() {
        $("#hobbiesWrapper").$(byText(testData.hobbies)).click();
        return this;
    }

    public RegistrationFormPage setState() {
        $("#state").click();
        $(byText(testData.state)).click();
        return this;
    }

    public RegistrationFormPage setCity() {
        $("#city").click();
        $(byText(testData.city)).click();
        return this;
    }

    public RegistrationFormPage submitBtnClick() {
        $("#submit").click();
        return this;
    }

    public RegistrationFormPage checkTable() {
        $(".table").shouldHave(text(testData.firstName),
                text(testData.lastName),
                text(testData.email),
                text(testData.phoneNumber),
                text(testData.hobbies),
                text(testData.subject),
                text(testData.image),
                text(testData.currentAddress),
                text(testData.state),
                text(testData.city));
        return this;
    }
}
