package ru.appline.framework.steps;

import io.cucumber.java.ru.И;
import ru.appline.framework.managers.PageManager;

public class SelectInsuranceServicePageSteps {

    private final PageManager pageManager = PageManager.getPageManager();

    @И("^Проверяем что открылась страница 'Выбора тарифа страхования и доп услуг'$")
    public void checkOpenSelectInsuranceServicePage() {
        pageManager.getSelectInsuranceServicePage().checkOpenSelectInsuranceServicePage();
    }

    @И("^Выбираем тариф 'минимальный'$")
    public void selectTariffMin() {
        pageManager.getSelectInsuranceServicePage().selectTariffMin();
    }

    @И("^Кликаем по кнопке 'Оформить' на странице 'Выбора тарифа страхования и доп услуг'$")
    public void checkoutInsuranceOnline() {
        pageManager.getSelectInsuranceServicePage().checkoutInsuranceOnline();
    }

}
