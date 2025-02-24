package tests;

import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTest {
    private final CheckboxPage page = new CheckboxPage();

    @Test(description = "Тестирование чекбоксов")
    public void testCheckbox() {
        page.openPage()
                .verifyCheckbox1NotChecked()
                .verifyCheckbox2Checked()
                .toggleCheckbox1()
                .toggleCheckbox2()
                .verifyCheckbox1Checked()
                .verifyCheckbox2NotChecked();
    }
}
