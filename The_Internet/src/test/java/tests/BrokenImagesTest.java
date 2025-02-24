package tests;

import org.testng.annotations.Test;
import pages.BrokenImagesPage;

public class BrokenImagesTest {
   private final BrokenImagesPage page = new BrokenImagesPage();
    @Test(description = "Тестирование изображений на странице")
    public void brokenImages() {
        page.openPage()
                .verifyImagesCount(3)
                .checkForBrokenImages();
    }
}
