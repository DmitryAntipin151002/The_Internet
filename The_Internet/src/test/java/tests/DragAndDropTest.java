package tests;

import org.testng.annotations.Test;
import pages.DragAndDropPage;

import static org.testng.Assert.assertEquals;

public class DragAndDropTest {
    private final DragAndDropPage page = new DragAndDropPage();

    @Test(description = "Тестирование перетаскивания элементов")
    public void testDragAndDrop() {
        page.openPage()
                .dragAtoB();
        assertEquals(page.getBoxAText(), "B", "Текст в Box A не соответствует ожидаемому!");
        assertEquals(page.getBoxBText(), "A", "Текст в Box B не соответствует ожидаемому!");
        page.dragBtoA();
        assertEquals(page.getBoxAText(), "A", "Текст в Box A  соответствует ожидаемому!");
        assertEquals(page.getBoxBText(), "B", "Текст в Box B  соответствует ожидаемому!");

    }
}
