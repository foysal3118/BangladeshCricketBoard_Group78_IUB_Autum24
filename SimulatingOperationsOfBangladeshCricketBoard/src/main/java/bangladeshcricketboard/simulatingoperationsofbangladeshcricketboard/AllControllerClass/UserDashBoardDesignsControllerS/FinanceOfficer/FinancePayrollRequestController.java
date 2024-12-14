package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Observable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FinancePayrollRequestController {

    @FXML
    private TableColumn<ObservableList<String>, String> addedDateTableColume;

    @FXML
    private TableView<ObservableList<String>> payrollRequestTableView;

    @FXML
    private TableColumn<ObservableList<String>, String> requestDetailsTableColume;

    @FXML
    private TableColumn<ObservableList<String>, String> requestIdTableColume;

    @FXML
    private TextField searchTextField;

    @FXML
    private ComboBox<String> selectIdComboBox;

    @FXML
    public void initialize() {
        requestIdTableColume.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(0)));
        requestDetailsTableColume.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(1))); 
        addedDateTableColume.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(3)));

        ObservableList<ObservableList<String>> list = textFileLoader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\RequestStatus.txt");
        payrollRequestTableView.setItems(list);

        ObservableList<String> idList = FXCollections.observableArrayList();
        for (ObservableList<String> row : list) {
            idList.add(row.get(0));
        }
        selectIdComboBox.setItems(idList);
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
    void approveOnActionButton(ActionEvent event) {

    }

    @FXML
    void declineOnActionButton(ActionEvent event) {

    }

    @FXML
    void payrollLoadOnActionButton(ActionEvent event) {

    }

}
