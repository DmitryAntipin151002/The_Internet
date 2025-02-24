package pages;



import com.codeborne.selenide.ElementsCollection;
import config.Config;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class BrokenImagesPage {
    private final String url = Config.getProperty("url.brokenImages");
    private final ElementsCollection images = $$("div.example img");

    public BrokenImagesPage openPage() {
        open(url);
        return this;
    }

    public BrokenImagesPage verifyImagesCount(int expectedSize) {
        images.shouldHave(size(expectedSize));
        return this;
    }

    public BrokenImagesPage checkForBrokenImages() {
        images.forEach(img -> {
            img.shouldBe(visible);
            String naturalWidth = img.attr("naturalWidth");
            if ("0".equals(naturalWidth)) {
                System.out.println("⚠️ Изображение сломано: " + img.attr("src"));
            }
        });
        return this;
    }
}

