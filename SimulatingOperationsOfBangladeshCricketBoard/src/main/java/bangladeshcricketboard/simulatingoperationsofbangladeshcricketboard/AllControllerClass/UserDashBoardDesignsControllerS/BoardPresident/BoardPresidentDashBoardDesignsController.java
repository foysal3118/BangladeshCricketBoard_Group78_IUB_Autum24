package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.BoardPresident;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class BoardPresidentDashBoardDesignsController
{
    @javafx.fxml.FXML
    private Button WindowMinimizeButton;
    @javafx.fxml.FXML
    private AnchorPane homeSideBar;
    @javafx.fxml.FXML
    private Label accountsettingsLabel;
    @javafx.fxml.FXML
    private Label financeLabel;
    @javafx.fxml.FXML
    private Label logOutLabel;
    @javafx.fxml.FXML
    private Label userNameTextField;
    @javafx.fxml.FXML
    private Label userIdTextField;
    @javafx.fxml.FXML
    private AnchorPane financeSideBar;
    @javafx.fxml.FXML
    private AnchorPane leftSideBar;
    @javafx.fxml.FXML
    private AnchorPane accountSettingsSideBar;
    @javafx.fxml.FXML
    private Button WindowCloseButton;
    @javafx.fxml.FXML
    private Label homeLabel;
    @javafx.fxml.FXML
    private AnchorPane logOutSideBar;
    @javafx.fxml.FXML
    private AnchorPane AppointmentsSideBar;
    @javafx.fxml.FXML
    private Label AppointmentsLabel;
    @javafx.fxml.FXML
    private Label MatchInfoLabel;
    @javafx.fxml.FXML
    private AnchorPane MatchInfoSideBar;
    @javafx.fxml.FXML
    private BorderPane BoardPresidentDashBoardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
        MotherOfAllClasses.mouseEnterEffectMinimizeButton(WindowMinimizeButton);
        MotherOfAllClasses.mouseEnterEffectExitButton(WindowCloseButton);
        MotherOfAllClasses.addHoverEffect(accountSettingsSideBar, financeSideBar, homeSideBar, AppointmentsSideBar, MatchInfoSideBar, logOutSideBar);

        collapseSideBar();
        leftSideBar.setOnMouseEntered(event -> {
            expandSideBar();
        });
        leftSideBar.setOnMouseExited(event -> {
            collapseSideBar();
        });
    }
    private void collapseSideBar() {
        MotherOfAllClasses.hideAllLabels(accountsettingsLabel, financeLabel, homeLabel, AppointmentsLabel, MatchInfoLabel, logOutLabel);
        MotherOfAllClasses.anchorPaneCollapse(accountSettingsSideBar, financeSideBar, homeSideBar, AppointmentsSideBar, MatchInfoSideBar, logOutSideBar,leftSideBar);
        MotherOfAllClasses.labelCollapse(accountsettingsLabel, financeLabel, homeLabel, AppointmentsLabel, MatchInfoLabel, logOutLabel);
    }

    private void expandSideBar() {
        MotherOfAllClasses.showAllLabels(accountsettingsLabel, financeLabel, homeLabel, AppointmentsLabel, MatchInfoLabel, logOutLabel);
        MotherOfAllClasses.anchorPaneExpand(accountSettingsSideBar, financeSideBar, homeSideBar, AppointmentsSideBar, MatchInfoSideBar, logOutSideBar,leftSideBar);
        MotherOfAllClasses.labelExpand(accountsettingsLabel, financeLabel, homeLabel, AppointmentsLabel, MatchInfoLabel, logOutLabel);
    }

    @javafx.fxml.FXML
    public void minimizeOnAction(ActionEvent actionEvent) {
        MotherOfAllClasses.minimizeButton(actionEvent);
    }

    @javafx.fxml.FXML
    public void homeOnMouseClick(Event event) {
    }

    @javafx.fxml.FXML
    public void closeOnActionButton(ActionEvent actionEvent) {
        System.exit(0);
    }

    @javafx.fxml.FXML
    public void logOutOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.logout(event);
    }

    @javafx.fxml.FXML
    public void accountSettingOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(BoardPresidentDashBoardBorderPane, "/CommonFXMLDesigns/AccountSettings.fxml");
    }

    @javafx.fxml.FXML
    public void AppointmentsSideBarOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(BoardPresidentDashBoardBorderPane, "/user_dashboard_designs/BoardPresidentDashBoard/AppointmentsOptionDashBoard.fxml");
    }

    @javafx.fxml.FXML
    public void MatchInfoSideBarOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(BoardPresidentDashBoardBorderPane, "/user_dashboard_designs/BoardPresidentDashBoard/MatchInfoOptionDashBoard.fxml");

    }
    @javafx.fxml.FXML
    public void financeSideBarOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(BoardPresidentDashBoardBorderPane, "/user_dashboard_designs/BoardPresidentDashBoard/FinanceOptionDashBoard.fxml");
    }
}