package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class FinanceOfficerDashbordDesignController {

    @FXML
    private BorderPane FinanceOfficerDashbordBorderpane;

    @FXML
    private Button WindowCloseButton;

    @FXML
    private Button WindowMinimizeButton;

    @FXML
    private AnchorPane accountSettingsSideBar;

    @FXML
    private Label accountsettingsLabel;

    @FXML
    private Label financeLabel;

    @FXML
    private AnchorPane financeSideBar;

    @FXML
    private Label homeLabel;

    @FXML
    private AnchorPane homeSideBar;

    @FXML
    private Label informationLabel;

    @FXML
    private AnchorPane informationSideBar;

    @FXML
    private Label investorLabel;

    @FXML
    private AnchorPane investorSideBar;

    @FXML
    private AnchorPane leftSideBar;

    @FXML
    private Label logOutLabel;

    @FXML
    private AnchorPane logOutSideBar;

    @FXML
    private AnchorPane logisticManagerHomeDashbordBorderpane;

    @FXML
    private Label payrollLabel;

    @FXML
    private AnchorPane payrollSideBar;

    @FXML
    private Label userIdTextField;

    @FXML
    private Label userNameTextField;

    public void initialize() {
        MotherOfAllClasses.mouseEnterEffectMinimizeButton(WindowMinimizeButton);
        MotherOfAllClasses.mouseEnterEffectExitButton(WindowCloseButton);
        MotherOfAllClasses.addHoverEffect(accountSettingsSideBar, financeSideBar, homeSideBar, informationSideBar, investorSideBar, logOutSideBar, payrollSideBar);

        collapseSideBar();

        leftSideBar.setOnMouseEntered(event -> {
            expandSideBar();
        });
        leftSideBar.setOnMouseExited(event -> {
            collapseSideBar();
        });
    }

    private void collapseSideBar() {
        MotherOfAllClasses.hideAllLabels(accountsettingsLabel, financeLabel, homeLabel, informationLabel, investorLabel, logOutLabel, payrollLabel);
        MotherOfAllClasses.anchorPaneCollapse(leftSideBar, accountSettingsSideBar, financeSideBar, homeSideBar, informationSideBar, investorSideBar, logOutSideBar, payrollSideBar);
        MotherOfAllClasses.labelCollapse(accountsettingsLabel, financeLabel, homeLabel, informationLabel, investorLabel, logOutLabel, payrollLabel);
    }

    private void expandSideBar() {
        MotherOfAllClasses.showAllLabels(accountsettingsLabel, financeLabel, homeLabel, informationLabel, investorLabel, logOutLabel, payrollLabel);
        MotherOfAllClasses.anchorPaneExpand(leftSideBar, accountSettingsSideBar, financeSideBar, homeSideBar, informationSideBar, investorSideBar, logOutSideBar, payrollSideBar);
        MotherOfAllClasses.labelExpand(accountsettingsLabel, financeLabel, homeLabel, informationLabel, investorLabel, logOutLabel, payrollLabel);
    }

    @FXML
    void accountSettingOnMouseClick(MouseEvent event) {

    }

    @FXML
    void closeOnActionButton(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void financeOnMouseClick(MouseEvent event) {

    }

    @FXML
    void homeOnMouseClick(MouseEvent event) {

    }

    @FXML
    void informationOnMouseClick(MouseEvent event) {

    }

    @FXML
    void investorsOnMouseClick(MouseEvent event) {

    }

    @FXML
    void logOutOnMouseClick(MouseEvent event) {

    }

    @FXML
    void minimizeOnAction(ActionEvent event) {
        MotherOfAllClasses.minimizeButton(event);
    }

    @FXML
    void payrollOnMouseClick(MouseEvent event) {

    }

}
