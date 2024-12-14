package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.ScheduleManger;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.AllModelClasses.Appointment;
import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NewAppointmentViewPageController
{
    @javafx.fxml.FXML
    private TextField ApoointmentNametextField;
    @javafx.fxml.FXML
    private TextField ApoointmentContactNumberTextfield;
    @javafx.fxml.FXML
    private TextField ApoointmentDesignationtextField;
    @javafx.fxml.FXML
    private TextArea ApoointmentDescriptionTextArea;
    @javafx.fxml.FXML
    private TextField ApoointmentTimeTextField;
    @javafx.fxml.FXML
    private DatePicker ApoointmentDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }
    //String name, String contactNumber, String designation, LocalDate date, String time, String discription
    @javafx.fxml.FXML
    public void RequestForAppointmentButtonOnAction(ActionEvent actionEvent) {
        String newId = Integer.toString(MotherOfAllClasses.getLastID(100,"src\\main\\resources\\AllTextData\\ScheduleManager_To_BoardPresident_Appointment.txt"));
        Appointment newAppointment = new Appointment(
                newId,
                ApoointmentNametextField.getText(),
                ApoointmentContactNumberTextfield.getText(),
                ApoointmentDescriptionTextArea.getText(),
                ApoointmentDatePicker.getValue().toString(),
                ApoointmentTimeTextField.getText(),
                ApoointmentDesignationtextField.getText()
                );
        ApoointmentNametextField.clear();
        ApoointmentContactNumberTextfield.clear();
        ApoointmentDesignationtextField.clear();
        ApoointmentDescriptionTextArea.clear();
        ApoointmentTimeTextField.clear();
        ApoointmentDatePicker.setValue(null);


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Created New Appointment");
        alert.setHeaderText("Appointment Created Successfully !");
        alert.showAndWait();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\main\\resources\\AllTextData\\ScheduleManager_To_BoardPresident_Appointment.txt", true))) {
            bufferedWriter.write(newAppointment.toString()+"\n");
            bufferedWriter.close();
        } catch (IOException e) {}
    }
}