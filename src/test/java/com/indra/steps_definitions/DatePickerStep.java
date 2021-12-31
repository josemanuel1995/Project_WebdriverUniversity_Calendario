package com.indra.steps_definitions;

import com.indra.actions.DatePickerActions;
import com.indra.models.DatePickerModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DatePickerStep {
        @Managed
        WebDriver driver;

        DatePickerActions datePickerActions = new DatePickerActions(driver);

        @Given("^el usuario esta en la pagina de inicio$")
        public void elusuarioestaenlapaginadeinicio() {
            datePickerActions.open();
        }

        @When("^el sistema despliega el panel calendario$")
        public void elsistemadespliegaelpanelcalendario() {
            datePickerActions.clicEnCalendario();
        }

        @When("^el sistema ingresa la fecha en el calendario$")
        public void elsistemaingresalafechaenelcalendario(List<DatePickerModels> datePickerModels) {
            datePickerActions.selectFechaCalendario(datePickerModels.get(0));
        }

        @Then("^el sistema deberia poder ver los datos ingresados en el calendario$")
        public void elsistemadeberiapoderverlosdatosingresadosenelcalendario() {
        }
    }
