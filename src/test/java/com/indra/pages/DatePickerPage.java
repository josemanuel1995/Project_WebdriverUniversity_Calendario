package com.indra.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
@DefaultUrl("/Datepicker")

public class DatePickerPage extends BasePage{

    public DatePickerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='input-group-addon']")
    private WebElementFacade btnCalendario;

    @FindBy(xpath = "(//th[@class='datepicker-switch' ])[1]")
    private WebElementFacade anioCalendario;

    @FindBy (xpath = "//span[@class='month']")
    private List<WebElementFacade> listMesesCalendario;

    @FindBy(xpath = "(//th[@class='prev'])[2]")
    private  WebElementFacade btnPrevioCalendario;

    @FindBy(xpath = "(//tr//th[@class='datepicker-switch'])[2]")
    private WebElementFacade anioCalendarioactual;

    @FindBy(xpath = "(//th[@class='next'])[2]")
    private WebElementFacade btnNextCalendario;

    @FindBy(xpath = "//div[@class='datepicker-days']")
    private WebElementFacade datePickerDays;

    @FindBy(xpath = "//div[@class='datepicker-days']//tbody//tr//td[@class='day']")
    private List<WebElementFacade> listDias;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElementFacade resultadoBarraFecha;

/************************************************************************************************************************/

    public WebElementFacade getAnioCalendario() {
        return anioCalendario;
    }

    public WebElementFacade getAnioCalendarioactual() {
        return anioCalendarioactual;
    }

    public WebElementFacade getBtnNextCalendario() {
        return btnNextCalendario;
    }

    public WebElementFacade getBotonPrevioCalendario() {
        return btnPrevioCalendario;
    }

    public WebElementFacade getBtnCalendario() {
        return btnCalendario;
    }

    public List<WebElementFacade> getListMesesCalendario() {
        return listMesesCalendario;
    }

    public WebElementFacade getDatePickerDays() {
        return datePickerDays;
    }

    public List<WebElementFacade> getListDias() {
        return listDias;
    }

    public WebElementFacade getResultadoBarraFecha() {
        return resultadoBarraFecha;
    }
}
