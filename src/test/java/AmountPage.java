import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class AmountPage {
    private SelenideElement amount = $(CssLocatorsVariables.amountLocator);
    private SelenideElement from = $(CssLocatorsVariables.fromLocator);
    private SelenideElement to = $(CssLocatorsVariables.toLocator);
    private SelenideElement transferButton = $(CssLocatorsVariables.actionTransferLocator);

    public AmountPage() {
        $(CssLocatorsVariables.dashboardLocator).waitUntil(Condition.visible, 15000);

//        $(CssLocatorsVariables.dashboardLocator).shouldHave(Condition.exactText("Пополнение карты"));
    }

    public ActionDeposit afterAmount(String numberCardWhereFrom, String numberCardWhere, String amountRefill) {
        amount.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        amount.setValue(amountRefill);
        from.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        from.setValue(numberCardWhereFrom);
        to.shouldHave(Condition.visible, Condition.value(numberCardWhere));
        transferButton.click();
        return new ActionDeposit();
    }


}
