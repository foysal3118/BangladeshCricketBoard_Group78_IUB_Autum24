package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.BufferedReader;
import java.io.FileReader;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LogicticFinanceViewRequestController {

    @FXML
    private TableColumn<ObservableList<String>, String> descriptionTableView;

    @FXML
    private TableColumn<ObservableList<String>, String> requesIdTableColume;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<ObservableList<String>> viewRequestTableView;

    @FXML
    public void initialize() {
        requesIdTableColume.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(0)));
        descriptionTableView.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(1))); 

        viewRequestTableView.setItems(textFileLoader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\RequestStatus.txt"));
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

    @FXML
    void searchOnActionButton(MouseEvent event) {
        String search = searchTextField.getText().toLowerCase();
        if (search.isEmpty()) {
            viewRequestTableView.getItems().clear();
            //getClass().getResource(filePath).getFile()))
            viewRequestTableView.getItems().addAll(textFileLoader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\RequestStatus.txt"));
            return;
        }


//         ObservableList<Inventory> list = FXCollections.observableArrayList();
//         for (Inventory inventory : textFileLoader("src\\main\\resources\\AllTextData\\Inventory.txt")) {
        ObservableList<ObservableList<String>> list = FXCollections.observableArrayList();  //BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\Inventory.txt")
        for (ObservableList<String> inventory : textFileLoader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\Inventory.txt")) {
            if (inventory.get(0).toLowerCase().contains(search) || inventory.get(1).toLowerCase().contains(search) || inventory.get(2).toLowerCase().contains(search) || inventory.get(3).toLowerCase().contains(search)) {
                list.add(inventory);
            }
        }
        viewRequestTableView.getItems().clear();
        viewRequestTableView.getItems().addAll(list);
    }

}
