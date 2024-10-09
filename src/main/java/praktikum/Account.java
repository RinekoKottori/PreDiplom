package praktikum;

import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step ("Is name correct to be printed on card")
    @DisplayName("Is name correct to print on a bank card")
    public boolean checkNameToEmboss() {
        return name.length() >= 3 && name.length() < 19
                && !name.startsWith(" ")
                && !name.endsWith(" ");
    }
}
