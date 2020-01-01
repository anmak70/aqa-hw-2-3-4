import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ActionDeposit {

    public ActionDeposit() {
//        $(CssLocatorsVariables.dashboardLocator).find("h1").should(Condition.visible, Condition.text("Ваши карты"));
        $(CssLocatorsVariables.dashboardLocator).waitUntil(Condition.visible, 15000);
    }

    public AmountPage topUpCard(By UpCard) {
        SelenideElement topUpCard = $(UpCard);
        topUpCard.click();
        return new AmountPage();
    }
}
