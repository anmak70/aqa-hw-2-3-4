import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestTransferMoneyBetweenMyCards {

    @Test
    void shouldTransferMoneyBetweenMyCards() {
        open("http://localhost:9999");
        LoginPage loginPage = new LoginPage();
        DataHelper.AuthInfo authInfo = DataHelper.getAuthInfo(CssLocatorsVariables.loginName, CssLocatorsVariables.passwordCode);
        VerificationPage verificationPage = loginPage.validLogin(authInfo);
        DataHelper.VerificationCode verificationCode = DataHelper.getVerificationCode(CssLocatorsVariables.verification);
        ActionDeposit actionDeposit = verificationPage.validVerity(verificationCode);
        AmountPage amountPage = actionDeposit.topUpCard(CssLocatorsVariables.topUpCard1);
        actionDeposit = amountPage.afterAmount(CssLocatorsVariables.cardSecond, "**** **** **** 0001",
                "3000");
        $(CssLocatorsVariables.balanceCard1).should(Condition.text("13000"), Condition.visible);
        $(CssLocatorsVariables.balanceCard2).should(Condition.text("7000"), Condition.visible);
        amountPage = actionDeposit.topUpCard(CssLocatorsVariables.topUpCard2);
        actionDeposit = amountPage.afterAmount(CssLocatorsVariables.cardFirst, "**** **** **** 0002",
                "3000");
        $(CssLocatorsVariables.balanceCard1).should(Condition.text("10000"), Condition.visible);
        $(CssLocatorsVariables.balanceCard2).should(Condition.text("10000"), Condition.visible);
    }

    @Test
    void shouldTransferMoneyBetweenMyCardsMinusBalance() {
        open("http://localhost:9999");
        LoginPage loginPage = new LoginPage();
        DataHelper.AuthInfo authInfo = DataHelper.getAuthInfo(CssLocatorsVariables.loginName, CssLocatorsVariables.passwordCode);
        VerificationPage verificationPage = loginPage.validLogin(authInfo);
        DataHelper.VerificationCode verificationCode = DataHelper.getVerificationCode(CssLocatorsVariables.verification);
        ActionDeposit actionDeposit = verificationPage.validVerity(verificationCode);
        AmountPage amountPage = actionDeposit.topUpCard(CssLocatorsVariables.topUpCard1);
        actionDeposit = amountPage.afterAmount(CssLocatorsVariables.cardSecond, "**** **** **** 0001",
                "12000");
        $(CssLocatorsVariables.balanceCard1).should(Condition.text("10000"), Condition.visible);
        $(CssLocatorsVariables.balanceCard2).should(Condition.text("10000"), Condition.visible);
    }

}
