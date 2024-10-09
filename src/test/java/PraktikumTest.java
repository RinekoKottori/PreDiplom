import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import praktikum.Account;

import static org.junit.Assert.assertEquals;

public class PraktikumTest {
    private static String name;

    @Test
    @DisplayName("Check user name")
    public void main() {
        Account nameCheckMinLength = new Account("Ти");
        Account nameCheckMaxLength = new Account("Тимоти Шаламбаладуйка");
        Account nameCheckFirstChar = new Account(" Тимоти Шаламе");
        Account nameCheckLastChar = new Account("Тимоти Шаламе ");
        Account corrcetName = new Account("Тимоти Шаламе");

        boolean result1 = nameCheckMinLength.checkNameToEmboss();
        assertEquals("Too short name, try again", false, result1);

        boolean result2 = nameCheckMaxLength.checkNameToEmboss();
        assertEquals("Too long name, try again", false, result2);

        boolean result3 = nameCheckFirstChar.checkNameToEmboss();
        assertEquals("Name starts with space, try again", false, result3);

        boolean result4 = nameCheckLastChar.checkNameToEmboss();
        assertEquals("Name ends with space, try again", false, result4);

        boolean result5 = corrcetName.checkNameToEmboss();
        assertEquals("Correct name, but test failed", true, result5);
    }
}