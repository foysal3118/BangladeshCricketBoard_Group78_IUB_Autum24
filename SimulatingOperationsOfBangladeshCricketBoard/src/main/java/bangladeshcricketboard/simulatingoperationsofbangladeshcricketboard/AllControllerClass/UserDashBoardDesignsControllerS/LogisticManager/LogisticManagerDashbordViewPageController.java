package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.IOException;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.BcbMainApplicationClass;
import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LogisticManagerDashbordViewPageController {
    
    @FXML
    private BorderPane LogisticManagerDashbordBorderpane;

    @FXML
    private AnchorPane accountSettingsSideBar;

    @FXML
    private Label accountsettingsLabel;

    @FXML
    private Label feedbackLabel;

    @FXML
    private AnchorPane feedbackSideBar;

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
    private Label inventoryLabel;

    @FXML
    private AnchorPane inventorySideBar;

    @FXML
    private AnchorPane leftSideBar;

    @FXML
    private Label logOutLabel;

    @FXML
    private AnchorPane logOutSideBar;

    @FXML
    private TextField searchTextField;

    @FXML
    private Label userIdTextField;

    @FXML
    private Label userNameTextField;

    @FXML
    private Button WindowMinimizeButton;

    @FXML
    private Button WindowCloseButton;

    @FXML
    public void initialize() {
        MotherOfAllClasses.addHoverEffect(homeSideBar, informationSideBar, inventorySideBar, financeSideBar, feedbackSideBar, accountSettingsSideBar, logOutSideBar);
        MotherOfAllClasses.mouseEnterEffectMinimizeButton(WindowMinimizeButton);
        MotherOfAllClasses.mouseEnterEffectExitButton(WindowCloseButton);

        collapseSideBar();

        leftSideBar.setOnMouseEntered(event -> expandSideBar());
        leftSideBar.setOnMouseExited(event -> collapseSideBar());
    }

    private void collapseSideBar(){
        MotherOfAllClasses.anchorPaneCollapse(homeSideBar, leftSideBar, informationSideBar, inventorySideBar, financeSideBar, feedbackSideBar, accountSettingsSideBar, logOutSideBar);
        MotherOfAllClasses.labelCollapse(homeLabel, informationLabel, inventoryLabel, financeLabel, feedbackLabel, accountsettingsLabel, logOutLabel);
        MotherOfAllClasses.hideAllLabels(homeLabel, informationLabel, inventoryLabel, financeLabel, feedbackLabel, accountsettingsLabel, logOutLabel);
    }

    private void expandSideBar() {
        MotherOfAllClasses.labelExpand(homeLabel, informationLabel, inventoryLabel, financeLabel, feedbackLabel, accountsettingsLabel, logOutLabel);
        MotherOfAllClasses.anchorPaneExpand(homeSideBar, informationSideBar, inventorySideBar, financeSideBar, feedbackSideBar, accountSettingsSideBar, logOutSideBar);
        MotherOfAllClasses.showAllLabels(homeLabel, informationLabel, inventoryLabel, financeLabel, feedbackLabel, accountsettingsLabel, logOutLabel);
    }

    @FXML
    void accountSettingOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticManagerSettingsDashbord.fxml"));
            LogisticManagerDashbordBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void feedbackOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticManagerFeedbackDashbord.fxml"));
            LogisticManagerDashbordBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void financeOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticManagerFinanceDashbord.fxml"));
            LogisticManagerDashbordBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void homeOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticManagerDashbordHomepage.fxml"));
            LogisticManagerDashbordBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void informationOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticManagerInformationDashbord.fxml"));
            LogisticManagerDashbordBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void inventoryOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticManagerInventoryDashbord.fxml"));
            LogisticManagerDashbordBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void logOutOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.logout(event);
    }

    @FXML
    void searchOnMouseClick(MouseEvent event) {

    }

    @FXML
    void minimizeOnAction(ActionEvent event) {
        MotherOfAllClasses.minimizeButton(event);
    }

    @FXML
    void closeOnActionButton(ActionEvent event) {
        System.exit(0);
    }

}