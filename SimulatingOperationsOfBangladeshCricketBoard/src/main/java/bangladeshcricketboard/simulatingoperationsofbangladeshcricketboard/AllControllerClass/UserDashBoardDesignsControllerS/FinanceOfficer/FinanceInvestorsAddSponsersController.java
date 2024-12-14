package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class FinanceInvestorsAddSponsersController
{
    @javafx.fxml.FXML
    private TextField ammountTextField;
    @javafx.fxml.FXML
    private ComboBox selectIdComboBox;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private DatePicker startingDatePicker;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField companyTextField;

    private int id;
    private SponserDetails sponserDetails;
    
    @javafx.fxml.FXML
    public void initialize() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBPSponserDetails.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                selectIdComboBox.getItems().add(data[0]);
            }
        } catch (Exception e) {
        }
    }

    @javafx.fxml.FXML
    public void sendToOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveOnActionButton(ActionEvent actionEvent) {
        if (nameTextField.getText().isEmpty() || companyTextField.getText().isEmpty() || ammountTextField.getText().isEmpty() || startingDatePicker.getValue() == null || endDatePicker.getValue() == null) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Please fill all the fields");
            alert.showAndWait();
            return;
        }

        id = MotherOfAllClasses.getLastID(400, "BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBPSponserDetails.txt");
        sponserDetails = new SponserDetails(nameTextField.getText(), companyTextField.getText(), ammountTextField.getText(), startingDatePicker.getValue().toString(), endDatePicker.getValue().toString(), String.valueOf(id));

        LocalDate startingDate = startingDatePicker.getValue();
        LocalDate endDate = endDatePicker.getValue();
        LocalDate currentDate = LocalDate.now();
        if (startingDate.isBefore(currentDate) || endDate.isBefore(currentDate)) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Please select valid dates");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Sponser details added successfully");
        alert.setContentText("Sponser details added successfully");
        alert.setContentText( "ID: " + id + "\n" + "Name: " + nameTextField.getText() + "\n" + "Company: " + companyTextField.getText() + "\n" + "Ammount: " + ammountTextField.getText() + "\n" + "Starting Date: " + startingDatePicker.getValue().toString() + "\n" + "End Date: " + endDatePicker.getValue().toString());
        alert.showAndWait();
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBPSponserDetails.txt", true));
            writer.write(id + "," + sponserDetails.getName() + "," + sponserDetails.getCompany() + "," + sponserDetails.getAmmount() + "," + sponserDetails.getStartingDate() + "," + sponserDetails.getEndDate() + "\n");
            writer.close();
        } catch (Exception e) {
        }

        selectIdComboBox.getItems().add(String.valueOf(id));

        nameTextField.clear();
        companyTextField.clear();
        ammountTextField.clear();
        startingDatePicker.setValue(null);
        endDatePicker.setValue(null);
    }

    @javafx.fxml.FXML
    public void updateOnActionButton(ActionEvent actionEvent) {
        if (selectIdComboBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Please Select ID");
            alert.setContentText("Please Select ID");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Report updated Successfully");
        alert.setContentText("Report ID: " + selectIdComboBox.getValue() + " Project Name: " + nameTextField.getText() + "\nProject ID: " + companyTextField.getText() + "\nTotal Budget: " + ammountTextField.getText() + "\nCategory: " + startingDatePicker.getValue().toString() + "\nCategory: " + endDatePicker.getValue().toString());
        alert.showAndWait();

        List<String> lines = new ArrayList<>(); 
        String newLine = selectIdComboBox.getValue() + "," + sponserDetails.getName() + "," + sponserDetails.getCompany() + "," + sponserDetails.getAmmount() + "," + sponserDetails.getStartingDate() + "," + sponserDetails.getEndDate(); 
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBPSponserDetails.txt"))) { 
            String line; 
            while ((line = bufferedReader.readLine()) != null) { 
                if (line.startsWith((String) selectIdComboBox.getValue())) { 
                    line = newLine; 
                } 
                lines.add(line); 
            } 
        } catch (Exception e) { e.printStackTrace();

        } try (BufferedWriter writer = new BufferedWriter(new FileWriter("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBPSponserDetails.txt"))) { 
            for (String line : lines) { 
                writer.write(line); writer.newLine(); 
            } 
        } catch (Exception e) { 
            e.printStackTrace(); 
        }

    }
}