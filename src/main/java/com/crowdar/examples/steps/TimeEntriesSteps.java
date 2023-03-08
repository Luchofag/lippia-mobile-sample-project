package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.TimeEntryConstants;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.TimeEntriesService;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TimeEntriesSteps extends PageSteps {

    @And("el usuario agrega un time entry con los siguientes datos '(.+)', y '(.+)'")
    public void addTime(int hour, int minute) {
        TimeEntriesService.isViewLoaded();
        TimeEntriesService.addHour(hour);
        TimeEntriesService.addMinute(minute);
    }

    @When("guarda el time entry, vuelve al dashboard")
    public void confirmEntry() {
        TimeEntriesService.confirmEntry();
    }


    @And("el usuario agrega un time entry con la fecha el '(.+)', '(.+)' y '(.+)'")
    public void elUsuarioAgregaUnTimeEntryConLaFechaEnElDiaDelMesDeDiciembreDel(String day, String month, String year) {
        TimeEntriesService.addDate(day, month, year);
    }

    @And("edita la descripcion con la leyenda de {string}")
    public void editaLaDescripcionConLaLeyendaDeTPFINAL(String description) {
        TimeEntriesService.addDescription(description);
    }

    @And("selecciona el proyecto en el que esta trabajando")
    public void seleccionaElProyectoEnElQueEstaTrabajandoEIndicaSiLaEntradaEsRemunerada() {
        TimeEntriesService.lastEntryDetails();
    }

    @io.cucumber.java.en.When("termina de editar el time entry, lo descarta y vuelve al dashboard")
    public void terminaDeEditarElTimeEntryLoDescartaYVuelveAlDashboard() {
        TimeEntriesService.discardChanges();
        MobileActionManager.waitVisibility(HomeConstants.TIME_ENTRIES_TEXT);
    }

    @And("ingresa a la configuracion y cambia al modo oscuro")
    public void ingresaALaConfiguracionYCambiaAlModoOscuro() {
        TimeEntriesService.changeToDarkmode();
    }

    @And("realiza un logout")
    public void realizaUnLogout() {
        TimeEntriesService.logOut();
    }

    @Then("verifica que se haya realizado exitosamente el logout")
    public void verificaQueSeHayaRealizadoExitosamenteElLogout() {
        TimeEntriesService.verifyLogout();
    }
}
