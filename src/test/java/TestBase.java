import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import properties.CredentialsConfig;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
    @BeforeAll
    static void setUp() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = System.getProperty("base_url"); //"https://demoqa.com"
        Configuration.browserSize = System.getProperty("browser_size"); //"4000x2000";
        Configuration.remote = "https://"+ config.login() + ":" + config.password() + "@" + System.getProperty("server_selenoid");

        DesiredCapabilities capabilities = new DesiredCapabilities(); // набор ключей и значений
        capabilities.setCapability("enableVNC", true); // трнаслировать видео - тру
        capabilities.setCapability("enableVideo", true); // делать видео - тру
        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void addAttachments(){
        Attach.screenshotAs("Итоговый скрин");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();  // добавила видео
        closeWebDriver();
    }

}
