import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
//    private SelenideElement loginField = $("[data-test-id=login] input");
    private SelenideElement loginField = $(CssLocatorsVariables.loginLocator);
    private SelenideElement passwordField = $(CssLocatorsVariables.passwordLocator);
    private SelenideElement loginButton = $(CssLocatorsVariables.logButton);

    public VerificationPage validLogin(DataHelper.AuthInfo authInfo) {
         loginField.setValue(authInfo.getLogin());
         passwordField.setValue(authInfo.getPassword());
         loginButton.click();
         return new VerificationPage();
    }
}
