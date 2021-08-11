package ru.appline.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.И;
import ru.appline.framework.managers.PageManager;

import java.util.HashMap;

public class RegistrationFormPageSteps {

    private final PageManager pageManager = PageManager.getPageManager();


    @И("^Проверяем что открылась страница 'Заполнение формы'$")
    public void checkOpenRegistrationFormPage() {
        pageManager.getRegistrationFormPage().checkOpenRegistrationFormPage();
    }

    @И("^Заполняем поля формы:$")
    public void fillFields(DataTable mapFieldsAndValue) {
        mapFieldsAndValue.asMap(String.class, String.class).forEach((key, value) ->
                pageManager.getRegistrationFormPage().fillField((String) key, (String) value));
    }

    @И("^Кликаем по кнопке 'Продолжить'$")
    public void clickBtnContinue() {
        pageManager.getRegistrationFormPage().clickBtnContinue();
    }


    @И("^Проверяем сообщения под полями формы:$")
    public void checkErrorMessageAtField(DataTable mapFieldsAndValue) {
        mapFieldsAndValue.asMap(String.class, String.class).forEach((key, value) ->
                pageManager.getRegistrationFormPage().checkErrorMessageAtField((String) key, (String) value));
    }

    @И("^Проверяем что присутствует общая ошибка с текстом \"(.+)\" на странице 'Заполнение формы'$")
    public void checkErrorMessageAlert(String errMessage) {
        pageManager.getRegistrationFormPage().checkErrorMessageAlert(errMessage);
    }

}
