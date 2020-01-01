import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private SelenideElement codeField = $(CssLocatorsVariables.codeLocator);
    private SelenideElement verifyButton = $(CssLocatorsVariables.verifyButton);

 //   public VerificationPage() {
//        codeField.shouldBe(Condition.visible);
//    }
    public VerificationPage() {
        codeField.waitUntil(Condition.visible, 15000);
    }

    public ActionDeposit validVerity(DataHelper.VerificationCode verificationCode) {
        codeField.setValue(verificationCode.getCode());
        verifyButton.click();
        return new ActionDeposit();
    }
}
