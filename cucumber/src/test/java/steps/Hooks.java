package steps;

import com.codeborne.selenide.Selenide;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void openUrl() {
        open("https://grinfer.com/home");
    }

}
