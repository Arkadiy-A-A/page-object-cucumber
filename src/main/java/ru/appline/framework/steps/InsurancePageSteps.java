package ru.appline.framework.steps;

import io.cucumber.java.ru.И;
import ru.appline.framework.managers.PageManager;

public class InsurancePageSteps {

    private final PageManager pageManager = PageManager.getPageManager();

    @И("^Проверяем что открылась страница 'Страхование путешественников'$")
    public void checkOpenInsurancePage() {
        pageManager.getInsurancePage().checkOpenInsurancePage();
    }

    @И("^Кликаем по кнопке 'Оформить онлайн' на странице 'Страхование путешественников'$")
    public void checkoutOnline() {
        pageManager.getInsurancePage().checkoutOnline();
    }


}
