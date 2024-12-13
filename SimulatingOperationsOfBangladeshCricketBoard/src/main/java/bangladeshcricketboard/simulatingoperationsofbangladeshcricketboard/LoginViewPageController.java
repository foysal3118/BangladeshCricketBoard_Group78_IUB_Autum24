package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard;

import java.io.IOException;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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

    @FXML
    public void initialize() {
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
