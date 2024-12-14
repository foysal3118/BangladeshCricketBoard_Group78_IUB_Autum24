package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FinancefinanceCreateReportController {

    @FXML
    private TextField categoryTextField;

    @FXML
    private TextField projectIdTextField;

    @FXML
    private TextField projectNameTextField;

    @FXML
    private ComboBox<?> selectIdComboBox;

    @FXML
    private TextField totalBudgetTextfield;

    @FXML
    void createOnActionButton(ActionEvent event) {

        if (projectNameTextField.getText().isEmpty() || projectIdTextField.getText().isEmpty() || totalBudgetTextfield.getText().isEmpty() || categoryTextField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR); 
            alert.setTitle("Error");
            alert.setHeaderText("Please Fill All Fields");
            alert.setContentText("Please Fill All Fields");
            alert.showAndWait();
            return;
        }

        Random rand = new Random();
        int id = rand.nextInt(1000);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Report Created Successfully");
        alert.setContentText("Report ID: "+ id + "Project Name: " + projectNameTextField.getText() + "\nProject ID: " + projectIdTextField.getText() + "\nTotal Budget: " + totalBudgetTextfield.getText() + "\nCategory: " + categoryTextField.getText());
        alert.showAndWait();


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBordPresidentFinanceReport.txt", true));
            writer.write(id + "," + projectNameTextField.getText() + "," + projectIdTextField.getText() + "," + totalBudgetTextfield.getText() + "," +categoryTextField.getText() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }

    @FXML
    void saveOnActionButton(ActionEvent event) {
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
        alert.setHeaderText("Report Saved Successfully");
        alert.setContentText("Report ID: " + selectIdComboBox.getValue());
        alert.showAndWait();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBordPresidentFinanceReport.txt"));
            String line;
            
        } catch (Exception e) {
        }
    }

    @FXML
    void sendToOnActionButton(ActionEvent event) {

    }

}
