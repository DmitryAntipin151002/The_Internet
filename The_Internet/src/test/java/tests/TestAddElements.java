package tests;

import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;

public class TestAddElements {
    private final AddRemoveElementsPage page = new AddRemoveElementsPage();

    @Test(description = "Тестирование добавления и удаления элемента на странице")
    public void testAddElements() {
        page.openPage()
                .clickAddButton()
                .verifyDeleteButtonVisible()
                .clickDeleteButton()
                .verifyDeleteButtonNotVisible();
    }
}
