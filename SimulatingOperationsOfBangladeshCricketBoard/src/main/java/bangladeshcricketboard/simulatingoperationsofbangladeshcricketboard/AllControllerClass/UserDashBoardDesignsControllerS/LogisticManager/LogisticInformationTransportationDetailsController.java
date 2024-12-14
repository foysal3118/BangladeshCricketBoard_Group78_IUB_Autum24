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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class LogisticInformationTransportationDetailsController {

    @FXML
    private RadioButton acRadio;

    @FXML
    private TextField coachNoTextfield;

    @FXML
    private DatePicker departureDatePicker;

    @FXML
    private TextField departureTimeTextfield;

    @FXML
    private TextField locationTextField;

    @FXML
    private RadioButton nonAcRadio;

    @FXML
    private ComboBox<?> selectIdComboBox;

    @FXML
    private TextField stadiumTextfield;

    @FXML
    private ToggleGroup radio;

    @FXML
    void saveOnActionButton(ActionEvent event) {
        if (coachNoTextfield.getText().isEmpty() || departureTimeTextfield.getText().isEmpty() || locationTextField.getText().isEmpty() || stadiumTextfield.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Please Fill All Fields");
            alert.setContentText("Please Fill All Fields");
            alert.showAndWait();
            return;
        }

        LocalDate departureDate = departureDatePicker.getValue();
        LocalDate currentDate = LocalDate.now();

        if (departureDate.isBefore(currentDate)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid Date");
            alert.setContentText("Departure Date can't be before current date");
            alert.showAndWait();
            return;
        }

        if (acRadio.isSelected() == false && nonAcRadio.isSelected() == false) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Please Select Coach Type");
            alert.setContentText("Please Select Coach Type");
            alert.showAndWait();
            return;
        }
        
        String coachType = ((RadioButton) radio.getSelectedToggle()).getText();
        int id = MotherOfAllClasses.getLastID(900, "BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\TransportationDetailsSendToTM.txt");
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Transportation Details");
        alert.setHeaderText("Transportation Details Saved Successfully");
        alert.setContentText("ID: " + id + "\nCoach No: " + coachNoTextfield.getText() + "\nCoach Type: " + coachType + "\nDeparture Date: " + departureDatePicker.getValue() + "\nDeparture Time: " + departureTimeTextfield.getText() + "\nLocation: " + locationTextField.getText() + "\nStadium: " + stadiumTextfield.getText());
        alert.showAndWait();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\TransportationDetailsSendToTM.txt", true));
            writer.write(id + "," + coachNoTextfield.getText() + "," + coachType + "," + departureDatePicker.getValue() + "," + departureTimeTextfield.getText() + "," + locationTextField.getText() + "," + stadiumTextfield.getText());
            writer.close();
        } catch (Exception e) {
        }
    }

    @FXML
    void sendToOnActionButton(ActionEvent event) {

    }
}
