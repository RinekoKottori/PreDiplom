package praktikum;

import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;

public class AccountTest {

    private final String name;

    public AccountTest(String name) {
        this.name = name;
    }

    @Step ("Method that check name to bank card")
    @DisplayName("Is name correct to print on a bank card")
    public boolean checkNameToEmboss() {
        return name.length() >= 3 && name.length() < 19
                && !name.startsWith(" ")
                && !name.endsWith(" ");
    }
}
