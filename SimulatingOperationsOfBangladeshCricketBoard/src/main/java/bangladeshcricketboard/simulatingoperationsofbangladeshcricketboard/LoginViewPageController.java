package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard;

import java.io.IOException;
import java.util.HashMap;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginViewPageController {

    @FXML
    private PasswordField LogInUserIDPasswordField;

    @FXML
    private TextField LogInUserIDTextField;
    @FXML
    private Button WindowMinimizeButton;
    @FXML
    private Button WindowCloseButton;

    private HashMap<Integer, String> logistic = new HashMap<>();
    private HashMap<Integer, String> finance = new HashMap<>();
    private HashMap<Integer, String> president = new HashMap<>();
    private HashMap<Integer, String> schedule = new HashMap<>();
    private HashMap<Integer, String> sales = new HashMap<>();
    private HashMap<Integer, String> Team = new HashMap<>();

    @FXML
    public void initialize() {
        logistic.put(2320590, "Shihab-Sani");
        finance.put(2320591, "Shihab-Sani");
        president.put(2321142, "Foysal3118");
        schedule.put(2321143, "Foysal3118");
        sales.put(2320481, "Israt");
        Team.put(2320482, "Israt");

        MotherOfAllClasses.mouseEnterEffectMinimizeButton(WindowMinimizeButton);
        MotherOfAllClasses.mouseEnterEffectExitButton(WindowCloseButton);
    }

    @FXML
    void LogInForgotPasswordButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/logindsigns/ForgetPasswordSceneDesigns/ForgetPasswordPage_1.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            MotherOfAllClasses.setStageAndSetupDrag(stage, root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {}
    }

    @FXML
    void LogInNewSignUpButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/logindsigns/SignIn_&_Up_Designs/SignUpViewPage.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            MotherOfAllClasses.setStageAndSetupDrag(stage, root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {}
    }

    @FXML
    void LogInSignInButtonOnAction(ActionEvent event) {
        try { 
            int userId = Integer.parseInt(LogInUserIDTextField.getText());
            String password = LogInUserIDPasswordField.getText(); 
            
            if (logistic.get(userId) != null && logistic.get(userId).equals(password)) { 
                MotherOfAllClasses.sceneSwithcer(event, "/user_dashboard_designs/logistic_manger_dashboard/LogisticManagerDashbordViewPage.fxml"); 
            } else if (finance.get(userId) != null && finance.get(userId).equals(password)) { 
                MotherOfAllClasses.sceneSwithcer(event, "/user_dashboard_designs/FinanceOfficerDashBoard/FinanceOfficerDashbordDesign.fxml"); 
            } else if (president.get(userId) != null && president.get(userId).equals(password)) { 
                MotherOfAllClasses.sceneSwithcer(event, "/user_dashboard_designs/BoardPresidentDashBoard/BoardPresidentDashBoardDesigns.fxml"); 
            } else if (schedule.get(userId) != null && schedule.get(userId).equals(password)) { 
                MotherOfAllClasses.sceneSwithcer(event, "/user_dashboard_designs/ScheduleManagerDashBoard/ScheduleManagerDashBoardDesign.fxml"); 
            } else if (sales.get(userId) != null && sales.get(userId).equals(password)) { 
                MotherOfAllClasses.sceneSwithcer(event, "/user_dashboard_designs/SalesManagerDashBoard/SalesManagerDashBoardDesign.fxml"); 
            } else if (Team.get(userId) != null && Team.get(userId).equals(password)) { 
                MotherOfAllClasses.sceneSwithcer(event, "/user_dashboard_designs/TeamManagerDashBoard/TeamManagerDashBoardDesign.fxml"); 
            } else { 
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Input");
                alert.setHeaderText("Invalid User ID or Password");
                alert.setContentText("Please enter a valid User ID and Password.");
                alert.showAndWait(); 
            } 
        } catch (Exception e) {}
    }

    @FXML
    void LoginPageCloseButtonOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    public void minimizeOnAction(ActionEvent actionEvent) {
        MotherOfAllClasses.minimizeButton(actionEvent);
    }
}
