package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.constants.TimeEntryConstants;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.TimeEntriesService;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;

public class TimeEntriesSteps extends PageSteps {

    @And("el usuario agrega un time entry con los siguientes datos {int}, y {int}")
    public void addTime(int hour, int minute) {
        TimeEntriesService.isViewLoaded();
        TimeEntriesService.addHour(hour);
        TimeEntriesService.addMinute(minute);
    }

    @When("guarda el time entry, vuelve al dashboard")
    public void confirmEntry() {
        TimeEntriesService.confirmEntry();
    }


    @And("el usuario agrega un time entry con la fecha el 22 de diciembre")
    public void elUsuarioAgregaUnTimeEntryConLaFechaEnElDiaDelMesDeDiciembreDel() {
        TimeEntriesService.addDate();
    }
}
