package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.BoardPresident;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class MatchInfoOptionDashBoardController
{
    @javafx.fxml.FXML
    private BorderPane MatchInfoOptionDashBoardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
        MotherOfAllClasses.borderPaneCenterChange(MatchInfoOptionDashBoardBorderPane,"/user_dashboard_designs/BoardPresidentDashBoard/FinalTeamDetailsViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void ReschedulingRequestOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(MatchInfoOptionDashBoardBorderPane,"/user_dashboard_designs/BoardPresidentDashBoard/ReschedulingRequestViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void FinalTeamDetailsOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(MatchInfoOptionDashBoardBorderPane,"/user_dashboard_designs/BoardPresidentDashBoard/FinalTeamDetailsViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void MatchSchedulesOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(MatchInfoOptionDashBoardBorderPane,"/user_dashboard_designs/BoardPresidentDashBoard/MatchSchedulesViewPage.fxml");
    }
}