package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LogisticManagerFeedbackDashbordController {

    @FXML
    private TableColumn<?, ?> commentTableColume;

    @FXML
    private TextField commentTextField;

    @FXML
    private TableColumn<?, ?> dateTableView;

    @FXML
    private TableView<?> feedBackTableView;

    @FXML
    private ComboBox<?> filterComboBox;

    @FXML
    private TableColumn<?, ?> userTableColume;

    @FXML
    void loadOnActionButton(ActionEvent event) {

    }

    @FXML
    void sendOnActionButton(MouseEvent event) {

    }
}
