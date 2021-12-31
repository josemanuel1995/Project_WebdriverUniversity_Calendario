package com.indra.actions;

import com.indra.models.DatePickerModels;
import com.indra.pages.DatePickerPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://webdriveruniversity.com/")

public class DatePickerActions extends DatePickerPage {

    public DatePickerActions(WebDriver driver) {
        super(driver);
    }

    public void selectFechaCalendario(DatePickerModels datePickerModels){
        selectAnioCalendario(datePickerModels);
        selectMesyDiaCalendario(datePickerModels);
    }

    public void clicEnCalendario(){
        getBtnCalendario().click();

    }

    public void selectMesyDiaCalendario(DatePickerModels DatePickerModels){
        String selectmes = DatePickerModels.getMes();
        String selectdia = DatePickerModels.getDia();
        System.out.println(getListMesesCalendario().size());

        for(int i = 0; i<=getListMesesCalendario().size(); i ++){
            String mesCalendario = getListMesesCalendario().get(i).getText();
            if(mesCalendario.equals(selectmes)){
                getListMesesCalendario().get(i).click();
                break;
            }
        }
        getDatePickerDays().waitUntilPresent();
        for(WebElementFacade dia : getListDias()){
            if(selectdia.equals(dia.getText())){
                dia.click();
                break;
            }
        }
    }

    public void selectAnioCalendario(DatePickerModels datePickerModels){
        getAnioCalendario().click();
        String selectanio = datePickerModels.getAnio();
        String anioCalendario = getAnioCalendarioactual().getText();

        for(int i=0; i<250;i++){
            getBtnNextCalendario().waitUntilVisible();
            getBotonPrevioCalendario().waitUntilPresent();
            anioCalendario=getAnioCalendarioactual().getText();
            int selectAnioNuevo = Integer.parseInt(selectanio);
            int anioCalendarioNuevo = Integer.parseInt(anioCalendario);

            if(selectAnioNuevo<anioCalendarioNuevo){
                getBotonPrevioCalendario().click();
            }
            else if (selectAnioNuevo>anioCalendarioNuevo){
                getBtnNextCalendario().click();
            }
            if(selectAnioNuevo==anioCalendarioNuevo){
                break;
            }
        }
    }
}



















