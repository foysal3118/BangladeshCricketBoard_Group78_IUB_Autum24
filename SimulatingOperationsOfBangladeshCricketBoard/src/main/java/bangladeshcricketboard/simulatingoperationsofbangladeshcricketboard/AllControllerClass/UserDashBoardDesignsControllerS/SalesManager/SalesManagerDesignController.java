package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.SalesManager;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class SalesManagerDesignController {

    @FXML
    private Button WindowCloseButton;

    @FXML
    private Button WindowMinimizeButton;

    @FXML
    private AnchorPane informationSideBar;

    @FXML
    private BorderPane slaesManagerBorderPane;

    @FXML
    private Label userIdTextField;

    @FXML
    private Label userNameTextField;

    @FXML
    void accountSettingOnMouseClick(MouseEvent event) {

    }

    @FXML
    void closeOnActionButton(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void homeOnMouseClick(MouseEvent event) {

    }

    @FXML
    void informationOnMouseClick(MouseEvent event) {

    }

    @FXML
    void logOutOnMouseClick(MouseEvent event) {

    }

    @FXML
    void merchantdiseOnMouseClick(MouseEvent event) {

    }

    @FXML
    void minimizeOnAction(ActionEvent event) {
        MotherOfAllClasses.minimizeButton(event);
    }

    @FXML
    void ticketOnMouseClick(MouseEvent event) {

    }

}
