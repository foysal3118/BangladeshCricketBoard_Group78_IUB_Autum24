package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.ScheduleManger;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;

public class UpdateOptionSheduleManagerDashBoardController
{

    @javafx.fxml.FXML
    private ComboBox FilterComboBox;
    @javafx.fxml.FXML
    private BorderPane UpdateOptionSheduleManagerDashBoardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
        MotherOfAllClasses.borderPaneCenterChange(UpdateOptionSheduleManagerDashBoardBorderPane, "/user_dashboard_designs/ScheduleManagerDashBoard/UpdateSlotForConfirmationViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void OfficialMatchDetailsOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(UpdateOptionSheduleManagerDashBoardBorderPane, "/user_dashboard_designs/ScheduleManagerDashBoard/OfficialMatchDetailsViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void LoadApprovedMatchDetailsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmAllSlotsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateSlotForConfirmationOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(UpdateOptionSheduleManagerDashBoardBorderPane, "/user_dashboard_designs/ScheduleManagerDashBoard/UpdateSlotForConfirmationViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void ConfirmSlotAsMatchDayOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(UpdateOptionSheduleManagerDashBoardBorderPane, "/user_dashboard_designs/ScheduleManagerDashBoard/ConfirmSlotAsMatchDay.fxml");
    }
}