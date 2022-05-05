package io.github.toronto22.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    private static final String USERNAME_INPUT = "#user-name";
    private static final String PASSWORD_INPUT = "#password";
    private static final String LOGIN_BUTTON = "#login-button";

    public void openApplication(){
        open();
    }

    public void Login(String username, String password){
        $(USERNAME_INPUT).type(username);
        $(PASSWORD_INPUT).type(password);
        $(LOGIN_BUTTON).click();
    }
}
