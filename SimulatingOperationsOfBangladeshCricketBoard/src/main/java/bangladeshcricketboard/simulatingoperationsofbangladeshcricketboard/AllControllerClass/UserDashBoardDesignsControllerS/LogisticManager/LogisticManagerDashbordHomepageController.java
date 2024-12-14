package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.BufferedReader;
import java.io.FileReader;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class LogisticManagerDashbordHomepageController {

    @FXML
    private BarChart<String, Number> MonthlyBudgetBarChart;

    @FXML
    private TableColumn<?, ?> matchDateColume;

    @FXML
    private TableColumn<?, ?> matchDateMatchColume;

    @FXML
    private TableView<?> matchDateTableView;

    @FXML
    private TableColumn<ObservableList<String>, String> requestIdColume;

    @FXML
    private TableView<ObservableList<String>> requestStatusTableView;

    @FXML
    private TableColumn<ObservableList<String>, String> statuscolume;

    @FXML
    public void initialize() {
        requestIdColume.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(0))); 
        statuscolume.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(2)));

        requestStatusTableView.setItems(textFileLoader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\RequestStatus.txt"));

        MotherOfAllClasses.setBarChart(MonthlyBudgetBarChart, "BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\CostReportChart.txt");
    }

    @FXML
    public void requestIdColume(Event event) {
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
