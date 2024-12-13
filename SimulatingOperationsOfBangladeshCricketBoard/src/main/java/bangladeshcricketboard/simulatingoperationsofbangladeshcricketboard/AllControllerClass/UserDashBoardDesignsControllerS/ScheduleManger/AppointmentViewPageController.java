package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.ScheduleManger;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class AppointmentViewPageController
{
    @javafx.fxml.FXML
    private ComboBox DateFilterComboBox;
    @javafx.fxml.FXML
    private TextField AppointmentIDTextField;
    private BorderPane ScheduleOptionDashBoardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LoadAllAppointmentDetailsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CancelAppointmentButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RequestForAppointmentButtonOnAction(ActionEvent actionEvent) {
        MotherOfAllClasses.borderPaneCenterChange(ScheduleOptionDashBoardBorderPane,"/user_dashboard_designs/ScheduleManagerDashBoard/NewAppointmentViewPage.fxml");
    }
}