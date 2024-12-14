package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FinanceOfficerHomeController {

    @FXML
    private BarChart<?, ?> annualCostBarChart;

    @FXML
    private TableColumn<?, ?> budgetDetailsTableView;

    @FXML
    private TableView<?> budgetTableView;

    @FXML
    private TableColumn<?, ?> eventTableColume;

    @FXML
    private TableView<?> eventTableView;

    @FXML
    private TableColumn<?, ?> requestIdTableColume;

    @FXML
    void viewmoreBudgetreqOnActionButton(ActionEvent event) {

    }

    @FXML
    void viewmoreEventsreqOnActionButton(ActionEvent event) {

    }

}
