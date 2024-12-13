package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class LogisticInformationHistory {

    @FXML
    private TableColumn<?, ?> dateTableView;

    @FXML
    private TableColumn<?, ?> descriptionTableView;

    @FXML
    private ComboBox<?> filterComboBox;

    @FXML
    private TableView<?> historyTableView;

    @FXML
    private TableColumn<?, ?> idTableView;

    @FXML
    void loadOnActionButton(ActionEvent event) {

    }
}
