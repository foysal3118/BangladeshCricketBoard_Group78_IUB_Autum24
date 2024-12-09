package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.IOException;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.BcbMainApplicationClass;
import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.LoginViewPageController;
import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.MouseDragClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
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

    private boolean isExpanded = false;
    private String DefaultStyle = "-fx-background-color:  #004D40;";
    private String HoverStyle = "-fx-background-color:  #546E7A;";

    @FXML
    public void initialize() {
        addHoverEffect(homeSideBar);
        addHoverEffect(informationSideBar);
        addHoverEffect(inventorySideBar);
        addHoverEffect(financeSideBar);
        addHoverEffect(feedbackSideBar);
        addHoverEffect(accountSettingsSideBar);
        addHoverEffect(logOutSideBar);

        addHoverEffectWindowMinimizeButton(WindowMinimizeButton);
        addHoverEffectWindowCloseButton(WindowCloseButton);

        configureLeftSideBar();

        leftSideBar.setOnMouseEntered(event -> expandSideBar());
        leftSideBar.setOnMouseExited(event -> collapseSideBar());
    }

    private void addHoverEffect(AnchorPane option) {
        option.setOnMouseEntered(event ->{
            option.setStyle(HoverStyle);
            option.setCursor(Cursor.HAND);
        });
        option.setOnMouseExited(event -> option.setStyle(DefaultStyle));
    }
    private void addHoverEffectWindowMinimizeButton(Button option) {
        option.setOnMouseEntered(event ->{
            option.setStyle("-fx-background-color: #B0BEC5;");
            option.setCursor(Cursor.HAND);
        });
        option.setOnMouseExited(event ->{
            option.setTextFill(Color.web("#000000"));
            option.setStyle("-fx-background-color: #ffffff;");
        });
    }

    private void addHoverEffectWindowCloseButton(Button option) {
        option.setOnMouseEntered(event ->{
            option.setStyle("-fx-background-color: #f21212;");
            option.setCursor(Cursor.HAND);
            option.setTextFill(Color.web("#ffffff"));
        });
        option.setOnMouseExited(event ->{
            option.setTextFill(Color.web("#f21212"));
            option.setStyle("-fx-background-color: #ffffff;");
        });
    }

    private void configureLeftSideBar(){
        homeSideBar.setPrefWidth(5);
        leftSideBar.setPrefWidth(5);
        homeLabel.setPrefWidth(5);
        informationSideBar.setPrefWidth(5);
        informationLabel.setPrefWidth(5);
        inventorySideBar.setPrefWidth(5);
        inventoryLabel.setPrefWidth(5);
        financeSideBar.setPrefWidth(5);
        financeLabel.setPrefWidth(5);
        feedbackSideBar.setPrefWidth(5);
        feedbackLabel.setPrefWidth(5);
        accountSettingsSideBar.setPrefWidth(5);
        accountsettingsLabel.setPrefWidth(5);
        logOutSideBar.setPrefWidth(5);
        logOutLabel.setPrefWidth(5);

        hideAllLabels();
    }

    private void expandSideBar() {
        if (!isExpanded) {
            leftSideBar.setPrefWidth(165);
            homeSideBar.setPrefWidth(165);
            homeLabel.setPrefWidth(165);
            informationSideBar.setPrefWidth(165);
            informationLabel.setPrefWidth(165);
            inventorySideBar.setPrefWidth(165);
            inventoryLabel.setPrefWidth(165);
            financeSideBar.setPrefWidth(165);
            financeLabel.setPrefWidth(165);
            feedbackSideBar.setPrefWidth(165);
            feedbackLabel.setPrefWidth(165);
            accountSettingsSideBar.setPrefWidth(165);
            accountsettingsLabel.setPrefWidth(165);
            logOutSideBar.setPrefWidth(165);
            logOutLabel.setPrefWidth(165);
            isExpanded = true;

            showAllLabels();
        }
    }

    private void collapseSideBar() {
        if (isExpanded) {
            homeSideBar.setPrefWidth(5);
            leftSideBar.setPrefWidth(5);
            homeLabel.setPrefWidth(5);
            informationSideBar.setPrefWidth(5);
            informationLabel.setPrefWidth(5);
            inventorySideBar.setPrefWidth(5);
            inventoryLabel.setPrefWidth(5);
            financeSideBar.setPrefWidth(5);
            financeLabel.setPrefWidth(5);
            feedbackSideBar.setPrefWidth(5);
            feedbackLabel.setPrefWidth(5);
            accountSettingsSideBar.setPrefWidth(5);
            accountsettingsLabel.setPrefWidth(5);
            logOutSideBar.setPrefWidth(5);
            logOutLabel.setPrefWidth(5);
            isExpanded = false;

            hideAllLabels();
        }

    }

    private void hideAllLabels() {
        homeLabel.setVisible(false);
        informationLabel.setVisible(false);
        inventoryLabel.setVisible(false);
        financeLabel.setVisible(false);
        feedbackLabel.setVisible(false);
        accountsettingsLabel.setVisible(false);
        logOutLabel.setVisible(false);
    }

    private void showAllLabels() {
        homeLabel.setVisible(true);
        informationLabel.setVisible(true);
        inventoryLabel.setVisible(true);
        financeLabel.setVisible(true);
        feedbackLabel.setVisible(true);
        accountsettingsLabel.setVisible(true);
        logOutLabel.setVisible(true);
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
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/logindsigns/SignIn_&_Up_Designs/LoginViewPage.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            MouseDragClass.setStageAndSetupDrag(stage, root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {}
    }

    @FXML
    void searchOnMouseClick(MouseEvent event) {

    }

    @FXML
    void minimizeOnAction(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    void closeOnActionButton(ActionEvent event) {
        System.exit(0);
    }

}