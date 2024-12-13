package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LogisticInformationMatchDatesController {

    @FXML
    private TableColumn<?, ?> dateTableColume;

    @FXML
    private ComboBox<?> filterComboBox;

    @FXML
    private TableColumn<?, ?> locationTableColume;

    @FXML
    private TableColumn<?, ?> matchMatchesTableColume;

    @FXML
    private TableView<?> matchTableView;

    @FXML
    private TextField searchTextField;

    @FXML
    void searchOnMouseClick(MouseEvent event) {

    }
}
