package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import java.io.BufferedReader;
import java.io.FileReader;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FinanceOfficerHomeController {

    @FXML
    private BarChart<String, Number> annualCostBarChart;

    @FXML
    private TableColumn<ObservableList<String>, String> budgetDetailsTableView;

    @FXML
    private TableView<ObservableList<String>> budgetTableView;

    @FXML
    private TableColumn<?, ?> eventTableColume;

    @FXML
    private TableView<?> eventTableView;

    @FXML
    private TableColumn<ObservableList<String>, String> requestIdTableColume;

    @FXML
    public void initialize() {
        requestIdTableColume.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(0)));
        budgetDetailsTableView.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(1))); 

        budgetTableView.setItems(textFileLoader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\RequestStatus.txt"));
        MotherOfAllClasses.setBarChart(annualCostBarChart, "BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\CostReportChart.txt");
    }

    public ObservableList<ObservableList<String>> textFileLoader(String filePath) {
        ObservableList<ObservableList<String>> list = FXCollections.observableArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                ObservableList<String> row = FXCollections.observableArrayList(data);
                list.add(row);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
