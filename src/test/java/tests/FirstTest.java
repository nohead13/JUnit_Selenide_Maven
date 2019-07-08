package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTest extends BaseTest{

    @Test
    @DisplayName("Customer open page and check something")
    void testFirstPart() {
        firstPage.openPage();
        firstPage.checkTopic();
        //firstPart.checkSomething();
    }

}
