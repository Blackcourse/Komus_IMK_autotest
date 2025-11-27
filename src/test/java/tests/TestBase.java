package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.AttachForAllure;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;


public class TestBase {

    @BeforeAll

    static void setupEnviroment() {
        Configuration.baseUrl = "https://www.komus.ru";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 10000;
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "127.0");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.remote = System.getProperty("remote");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }


    @BeforeEach
    void addSelenideLogger() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        AttachForAllure.screenshotAs("Last screenshot");
        AttachForAllure.pageSource("1");
        AttachForAllure.browserConsoleLogs();
        AttachForAllure.addVideo();
    }





}
