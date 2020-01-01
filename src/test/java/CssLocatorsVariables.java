import org.openqa.selenium.By;

import static org.openqa.selenium.By.cssSelector;

public class CssLocatorsVariables {
    static By loginLocator = cssSelector("[data-test-id=login] input");
    static By passwordLocator = cssSelector("[data-test-id=password] input");
    static By logButton = cssSelector("[data-test-id=action-login]");
    static By codeLocator = cssSelector("[data-test-id=code] input");
    static By verifyButton = cssSelector("[data-test-id=action-verify]");
    static By topUpCard1 = cssSelector("[data-test-id='92df3f1c-a033-48e6-8390-206f6b1f56c0'] [data-test-id=action-deposit]");
    static By balanceCard1 = cssSelector("[data-test-id='92df3f1c-a033-48e6-8390-206f6b1f56c0']");
    static By topUpCard2 = cssSelector("[data-test-id='0f3f5c2a-249e-4c3d-8287-09f7a039391d'] [data-test-id=action-deposit]");
    static By balanceCard2 = cssSelector("[data-test-id='0f3f5c2a-249e-4c3d-8287-09f7a039391d']");
    static By dashboardLocator = cssSelector("[data-test-id=dashboard]");
    static By actionDepositLocator = cssSelector("[data-test-id=action-deposit]");
    static By amountLocator = cssSelector("[data-test-id=amount] input");
    static By fromLocator = cssSelector("[data-test-id=from] input");
    static By toLocator = cssSelector("[data-test-id=to] input");
    static By actionTransferLocator = cssSelector("[data-test-id=action-transfer]");

    static String loginName = "vasya";
    static String passwordCode = "qwerty123";
    static String verification = "12345";
    static String cardFirst = "5559 0000 0000 0001";
    static String cardSecond = "5559 0000 0000 0002";
}
