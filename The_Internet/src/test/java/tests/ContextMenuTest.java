package tests;

import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest {
    private final ContextMenuPage page = new ContextMenuPage();

    @Test(description = "Тестирование контекстного меню")
    public void testContextMenuAlert() {
        page.openPage()
                .rightClickOnContextBox();

        // Проверяем текст alert'а
        String alertText = page.getAlertText();
        assertEquals(alertText, "You selected a context menu", "Текст alert не совпадает!");

        page.acceptAlert();
    }
}
