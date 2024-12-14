package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LogisticInventoryItemListController {

    @FXML
    private DatePicker deliveryDatePicker;

    @FXML
    private TextArea descriptionTexField;

    @FXML
    private TextField itemNameTextField;

    @FXML
    private ComboBox<String> priorityComboBox;

    @FXML
    private TextField quantityTextField;

    @FXML
    public void initialize() {
        priorityComboBox.getItems().addAll("Emergency", "High", "Medium", "Low");
    }

    @FXML
    void createListOnActionButton(ActionEvent event) {
        if (itemNameTextField.getText().isEmpty() || quantityTextField.getText().isEmpty() || descriptionTexField.getText().isEmpty() || priorityComboBox.getValue() == null || deliveryDatePicker.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Please Fill All Fields");
            alert.setContentText("Please Fill All Fields");
            alert.showAndWait();
            return;
        }

        LocalDate deliveryDate = deliveryDatePicker.getValue();
        LocalDate currentDate = LocalDate.now();

        if (deliveryDate.isBefore(currentDate)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid Date");
            alert.setContentText("Delivery Date can't be before current date");
            alert.showAndWait();
            return;
        }

        int id = MotherOfAllClasses.getLastID(500, "BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\ItemsListSendToPC.txt");
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Item List");
        alert.setHeaderText("Item List Created Successfully");
        alert.setContentText("ID: " + id + "\nItem Name: " + itemNameTextField.getText() + "\nQuantity: " + quantityTextField.getText() + "\nPriority: " + priorityComboBox.getValue() + "\nDelivery Date: " + deliveryDatePicker.getValue() + "\nDescription: " + descriptionTexField.getText());
        alert.showAndWait();    
        
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\ItemsListSendToPC.txt", true));
            writer.write(id + "," + itemNameTextField.getText() + "," + quantityTextField.getText() + "," + priorityComboBox.getValue() + "," + deliveryDatePicker.getValue() + "," + descriptionTexField.getText());
            writer.close();
        } catch (Exception e) {}


        itemNameTextField.clear();
        quantityTextField.clear();
        descriptionTexField.clear();
        priorityComboBox.setValue(null);
        deliveryDatePicker.setValue(null);
    }

    @FXML
    void sendToOnActionButton(ActionEvent event) {
        
    }

}
