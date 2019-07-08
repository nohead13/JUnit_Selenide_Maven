package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import pages.FirstPage;
import pages.SecondPage;
import pages.ThirdPage;

import static com.codeborne.selenide.Selenide.close;

public class BaseTest {

    public FirstPage firstPage = new FirstPage();
    public SecondPage secondPage = new SecondPage();
    ThirdPage thirdPage = new ThirdPage();

    @BeforeAll
    public static void setUoBeforeBaseTest() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = false;
        Configuration.browserSize = "1600x800";
    }

    @AfterEach
    public void closeBrowser() {
        close();
    }

}
