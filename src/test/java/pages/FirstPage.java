package pages;

import com.codeborne.selenide.SelenideElement;
import util.Environment;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstPage extends BasePage {

    Environment env = new Environment();
    String url = env.getUrl();

    private SelenideElement pageTopic = $("hi");

    public void openPage() {
        open(url);
    }

    public void checkTopic() {
        pageTopic.should(appear).shouldHave(text("Welcome topic text"));
    }

}
