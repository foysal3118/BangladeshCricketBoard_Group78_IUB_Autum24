package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.FileReader;

import javafx.collections.FXCollections;
public class LogisticInventoryShowAllItemsController {

    @FXML
    private TableColumn<Inventory, String> addedDateTableColume;

    @FXML
    private TableColumn<Inventory, String> descriptionTableColume;

    @FXML
    private TableColumn<Inventory, String> itemNameTableColume;

    @FXML
    private TableColumn<Inventory, Integer> itemQuantityTableView;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<Inventory> showAllItemsTableView;

    @FXML
    public void initialize() {
        itemNameTableColume.setCellValueFactory(new PropertyValueFactory<Inventory, String>("itemName"));
        itemQuantityTableView.setCellValueFactory(new PropertyValueFactory<Inventory, Integer>("quantity"));
        addedDateTableColume.setCellValueFactory(new PropertyValueFactory<Inventory, String>("addDate"));
        descriptionTableColume.setCellValueFactory(new PropertyValueFactory<Inventory, String>("description"));
        showAllItemsTableView.getItems().addAll(textFileLoader("src\\main\\resources\\AllTextData\\Inventory.txt"));
    }
    public ObservableList<Inventory> textFileLoader(String filePath) {
        ObservableList<Inventory> list = FXCollections.observableArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Inventory inventory = new Inventory(data[0], Integer.parseInt(data[1]), data[2], data[3]);
                list.add(inventory);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @FXML
    void inventoryLoadOnActionButton(ActionEvent event) {
        String search = searchTextField.getText().toLowerCase();
        if (search.isEmpty()) {
            showAllItemsTableView.getItems().clear();
            //getClass().getResource(filePath).getFile()))
            showAllItemsTableView.getItems().addAll(textFileLoader("src\\main\\resources\\AllTextData\\Inventory.txt"));
            return;
        }

        ObservableList<Inventory> list = FXCollections.observableArrayList();
        for (Inventory inventory : textFileLoader("src\\main\\resources\\AllTextData\\Inventory.txt")) {
            if (inventory.getItemName().toLowerCase().contains(search) || inventory.getAddDate().toLowerCase().contains(search) || inventory.getDescription().toLowerCase().contains(search)) {
                list.add(inventory);
            }
        }
        showAllItemsTableView.getItems().clear();
        showAllItemsTableView.getItems().addAll(list);
    }
}
