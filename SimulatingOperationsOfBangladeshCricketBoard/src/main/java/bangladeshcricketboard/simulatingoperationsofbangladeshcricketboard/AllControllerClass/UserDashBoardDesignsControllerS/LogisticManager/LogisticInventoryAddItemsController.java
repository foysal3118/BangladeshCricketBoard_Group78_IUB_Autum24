package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LogisticInventoryAddItemsController {

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TextField itemNameTextField;

    @FXML
    private TextField quantityTextField;

    public static ObservableList<Inventory> inventoryList = FXCollections.observableArrayList();

    @FXML
    void addItemOnActionButton(ActionEvent event) {

        if (itemNameTextField.getText().isEmpty() || quantityTextField.getText().isEmpty() || descriptionTextArea.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Please Fill All Fields");
            alert.setContentText("Please Fill All Fields");
            alert.showAndWait();
            return;
        }

        String itemName = itemNameTextField.getText();
        int quantity = Integer.parseInt(quantityTextField.getText());
        String addDate = LocalDate.now().toString(); // Automatically generates the current date
        String description = descriptionTextArea.getText();

        Inventory inventory = new Inventory(itemName, quantity, addDate, description);
        inventoryList.add(inventory);
        descriptionTextArea.clear();
        itemNameTextField.clear();
        quantityTextField.clear();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Item Added");
        alert.setHeaderText("Item Added Successfully");
        alert.setContentText("Item Name: " + inventory.getItemName() + "\nQuantity: " + inventory.getQuantity() + "\nAdded Date: " + inventory.getAddDate() + "\nDescription: " + inventory.getDescription());
        alert.showAndWait();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inventory.txt", true))) {
            bufferedWriter.write(inventory.getItemName() + "," + inventory.getQuantity() + "," + inventory.getAddDate() + "," + inventory.getDescription() + "\n");
        } catch (IOException e) {}
    }
}
