import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;
        
        open("https://duckduckgo.com/");
        $("#searchbox_input").setValue("amazon").pressEnter();
        $("[data-testid=result]").shouldHave(text("https://selenide.org"));
    }
}
    
