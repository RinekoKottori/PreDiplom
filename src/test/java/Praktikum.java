import praktikum.AccountTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class Praktikum {
    private static String name;

    public static void main(String[] args) {
        AccountTest nameCheckMinLength = new AccountTest("Ти");
        AccountTest nameCheckMaxLength = new AccountTest("Тимоти Шаламбаладуйка");
        AccountTest nameCheckFirstChar = new AccountTest(" Тимоти Шаламе");
        AccountTest nameCheckLastChar = new AccountTest("Тимоти Шаламе ");
        AccountTest corrcetName = new AccountTest("Тимоти Шаламе");


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