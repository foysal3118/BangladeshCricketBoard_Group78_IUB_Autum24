package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LogisticManagerFeedbackDashbordController {

    @FXML
    private TableColumn<ObservableList<String>, String> commentTableColume;

    @FXML
    private TextField commentTextField;

    @FXML
    private TableColumn<ObservableList<String>, String> dateTableView;

    @FXML
    private TableView<ObservableList<String>> feedBackTableView;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableColumn<ObservableList<String>, String> userTableColume;

    @FXML
    public void initialize() {
        userTableColume.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(0)));
        commentTableColume.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(1))); 
        dateTableView.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(2)));

        feedBackTableView.setItems(textFileLoader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\Feedback.txt"));
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
    void loadOnActionButton(ActionEvent event) {
        String search = searchTextField.getText().toLowerCase();
        if (search.isEmpty()) {
            feedBackTableView.getItems().clear();
            //getClass().getResource(filePath).getFile()))
            feedBackTableView.getItems().addAll(textFileLoader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\RequestStatus.txt"));
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
        feedBackTableView.getItems().clear();
        feedBackTableView.getItems().addAll(list);
    }

    @FXML
    void sendOnActionButton(MouseEvent event) {
        if (commentTextField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Comment is empty");
            alert.setContentText("Please write a comment to send the feedback");
            alert.showAndWait();
            return;
        }

        LocalDate date = LocalDate.now();
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\Feedback.txt", true));
            writer.write("Logistic Manager," + commentTextField.getText() + "," + date.toString() + "\n");
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        feedBackTableView.setItems(textFileLoader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\Feedback.txt"));
        commentTextField.clear();
    }

}
