package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestAuth {
    @Test(description = "Тестирование авторизации")
    public void testAuth(){
        open("https://the-internet.herokuapp.com/basic_auth");





    }

}
