package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.ScheduleManger;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class ScheduleManagerDashBoardDesignController
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
    private AnchorPane ScheduleSideBar;
    @javafx.fxml.FXML
    private Label ScheduleLabel;
    @javafx.fxml.FXML
    private AnchorPane UpdateLabelSideBar;
    @javafx.fxml.FXML
    private Label UpdateLabel;
    @FXML
    private BorderPane ScheduleManagerBorderpane;

    @javafx.fxml.FXML
    public void initialize() {
        MotherOfAllClasses.addHoverEffect(homeSideBar,financeSideBar,accountSettingsSideBar,logOutSideBar,ScheduleSideBar,UpdateLabelSideBar);
        MotherOfAllClasses.mouseEnterEffectMinimizeButton(WindowMinimizeButton);
        MotherOfAllClasses.mouseEnterEffectExitButton(WindowCloseButton);
        collapseSideBar();
        leftSideBar.setOnMouseEntered(event -> expandSideBar());
        leftSideBar.setOnMouseExited(event -> collapseSideBar());
    }
    private void collapseSideBar(){
        MotherOfAllClasses.anchorPaneCollapse(homeSideBar,financeSideBar,accountSettingsSideBar,logOutSideBar,ScheduleSideBar,UpdateLabelSideBar,leftSideBar);
        MotherOfAllClasses.labelCollapse(homeLabel,ScheduleLabel,UpdateLabel,financeLabel,accountsettingsLabel,logOutLabel);
        MotherOfAllClasses.hideAllLabels(homeLabel,ScheduleLabel,UpdateLabel,financeLabel,accountsettingsLabel,logOutLabel);
    }
    private void expandSideBar() {
        MotherOfAllClasses.labelExpand(homeLabel,ScheduleLabel,UpdateLabel,financeLabel,accountsettingsLabel,logOutLabel);
        MotherOfAllClasses.anchorPaneExpand(homeSideBar,financeSideBar,accountSettingsSideBar,logOutSideBar,ScheduleSideBar,UpdateLabelSideBar,leftSideBar);
        MotherOfAllClasses.showAllLabels(homeLabel,ScheduleLabel,UpdateLabel,financeLabel,accountsettingsLabel,logOutLabel);
    }
    @javafx.fxml.FXML
    public void minimizeOnAction(ActionEvent event) {
        MotherOfAllClasses.minimizeButton(event);
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
    public void accountSettingsSideBarOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(ScheduleManagerBorderpane, "/CommonFXMLDesigns/AccountSettings.fxml");
    }

    @javafx.fxml.FXML
    public void financeSideBarOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(ScheduleManagerBorderpane, "/user_dashboard_designs/ScheduleManagerDashBoard/FinanceOptionScheduleManagerDashBoard.fxml");
    }

    @javafx.fxml.FXML
    public void ScheduleSideBarOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(ScheduleManagerBorderpane, "/user_dashboard_designs/ScheduleManagerDashBoard/ScheduleOptionScheduleManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void homeSideBarOnMouseClick(Event event) {
    }

    @javafx.fxml.FXML
    public void UpdateLabelSideBarOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(ScheduleManagerBorderpane, "/user_dashboard_designs/ScheduleManagerDashBoard/UpdateOptionSheduleManagerDashBoard.fxml");
    }
}