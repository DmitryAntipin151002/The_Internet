package tests;

import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;


public class BrokenImagesTest {
    @Test(description = "Тестирование изображений")
    public void testBrokenImages(){
        open("https://the-internet.herokuapp.com/broken_images");
        ElementsCollection images = $$("div.example img");
        images.shouldHave(size(3)); // используем size в condition

        // Проверяем, есть ли сломанные изображения
        images.forEach(img -> {
            img.shouldBe(visible);
            String naturalWidth = img.attr("naturalWidth");
            if ("0".equals(naturalWidth)) {
                System.out.println("Изображение сломано: " + img.attr("src"));
            }
        });

    }
}
