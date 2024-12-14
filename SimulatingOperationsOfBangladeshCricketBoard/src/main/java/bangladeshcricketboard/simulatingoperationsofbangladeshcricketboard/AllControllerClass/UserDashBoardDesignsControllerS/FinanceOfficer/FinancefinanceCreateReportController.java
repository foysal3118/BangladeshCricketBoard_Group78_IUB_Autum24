package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
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
    private ComboBox<String> selectIdComboBox;

    @FXML
    private TextField totalBudgetTextfield;

    @FXML
    public void initialize() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBordPresidentFinanceReport.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                selectIdComboBox.getItems().add(data[0]);
            }
        } catch (Exception e) {
        }
    }

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

        int id = MotherOfAllClasses.getLastID(300, "BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBordPresidentFinanceReport.txt");
    

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Report Created Successfully");
        alert.setContentText("Report ID: " + id + " Project Name: " + projectNameTextField.getText() + "\nProject ID: " + projectIdTextField.getText() + "\nTotal Budget: " + totalBudgetTextfield.getText() + "\nCategory: " + categoryTextField.getText());
        alert.showAndWait();

        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBordPresidentFinanceReport.txt", true));
            writer.write(id + "," + projectNameTextField.getText() + "," + projectIdTextField.getText() + "," + totalBudgetTextfield.getText() + "," +categoryTextField.getText() + "\n");
            writer.close();
        } catch (Exception e) {
        }

        selectIdComboBox.getItems().add(String.valueOf(id));

        projectIdTextField.clear();
        projectNameTextField.clear();
        totalBudgetTextfield.clear();
        categoryTextField.clear();
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
        alert.setHeaderText("Report updated Successfully");
        alert.setContentText("Report ID: " + selectIdComboBox.getValue() + " Project Name: " + projectNameTextField.getText() + "\nProject ID: " + projectIdTextField.getText() + "\nTotal Budget: " + totalBudgetTextfield.getText() + "\nCategory: " + categoryTextField.getText());
        alert.showAndWait();

        List<String> lines = new ArrayList<>(); 
        String newLine = selectIdComboBox.getValue() + "," + projectNameTextField.getText() + "," + projectIdTextField.getText() + "," + totalBudgetTextfield.getText() + "," + categoryTextField.getText(); 
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBordPresidentFinanceReport.txt"))) { 
            String line; 
            while ((line = bufferedReader.readLine()) != null) { 
                if (line.startsWith(selectIdComboBox.getValue())) { 
                    line = newLine; 
                } 
                lines.add(line); 
            } 
        } catch (Exception e) { e.printStackTrace(); 

        } try (BufferedWriter writer = new BufferedWriter(new FileWriter("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBordPresidentFinanceReport.txt"))) { 
            for (String line : lines) { 
                writer.write(line); writer.newLine(); 
            } 
        } catch (Exception e) { 
                e.printStackTrace(); 
            }
        

            projectIdTextField.clear();
            projectNameTextField.clear();
            totalBudgetTextfield.clear();
            categoryTextField.clear();
            selectIdComboBox.setValue(null);
    }

    @FXML
    void sendToOnActionButton(ActionEvent event) {
        
    }

}
