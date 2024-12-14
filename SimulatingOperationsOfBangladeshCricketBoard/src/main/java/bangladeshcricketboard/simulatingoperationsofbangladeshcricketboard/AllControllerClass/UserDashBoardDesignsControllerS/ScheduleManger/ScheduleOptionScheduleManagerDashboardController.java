package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.ScheduleManger;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.Event;
import javafx.scene.layout.BorderPane;

public class ScheduleOptionScheduleManagerDashboardController
{
    @javafx.fxml.FXML
    private BorderPane ScheduleOptionDashBoardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
        MotherOfAllClasses.borderPaneCenterChange(ScheduleOptionDashBoardBorderPane, "/user_dashboard_designs/ScheduleManagerDashBoard/BookASlotViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void BookASlotOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(ScheduleOptionDashBoardBorderPane, "/user_dashboard_designs/ScheduleManagerDashBoard/BookASlotViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void ScheduledMatchListOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(ScheduleOptionDashBoardBorderPane, "/user_dashboard_designs/ScheduleManagerDashBoard/ScheduledMatchListViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void AppointmentOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(ScheduleOptionDashBoardBorderPane, "/user_dashboard_designs/ScheduleManagerDashBoard/AppointmentViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void CreateNewAppointmentOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(ScheduleOptionDashBoardBorderPane,"/user_dashboard_designs/ScheduleManagerDashBoard/NewAppointmentViewPage.fxml");
    }
}