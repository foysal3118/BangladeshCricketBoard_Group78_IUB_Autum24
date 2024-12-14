package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.Random;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class LogisticFinanceCostReportController {

    @FXML
    private Button chosefileID;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private Label filenameLabel;

    @FXML
    private BarChart<String, Number> pieChart;

    private File SelectedFile;

    @FXML
    public void initialize() {
        MotherOfAllClasses.setBarChart(pieChart, "BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\CostReportChart.txt");
    }

    @FXML
    void SendToOnActionButton(ActionEvent event) {
        if (SelectedFile == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("No File Selected");
            alert.setContentText("Please select a file to send the request");
            alert.showAndWait();
            return;
        } 

        if (descriptionTextArea.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Description is empty");
            alert.setContentText("Please write a description for the request");
            alert.showAndWait();
            return;
        }

        String description = descriptionTextArea.getText();
        Random random = new Random();
        int requestId = random.nextInt(1000);

        try {
            StringBuilder content = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(SelectedFile));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
            reader.close();

            Random random1 = new Random();
            int cost = random1.nextInt(1000);
            Path dest = Path.of("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData", "CostReportToFC" + ".txt");
            Path dest1 = Path.of("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData", "CostReportChart" + ".txt");

            int id = MotherOfAllClasses.getLastID(600, "BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\BudgetRequestID.txt");

            BufferedWriter writer = new BufferedWriter(new FileWriter(dest.toFile(), true));
            BufferedWriter writer1 = new BufferedWriter(new FileWriter(dest1.toFile(), true));
            writer1.write(id + "," + description + "," + cost + "\n");
            writer.write(requestId + "," + description + "," + content.toString());
            writer1.close();
            writer.close();
            SelectedFile = null;

            initialize();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Request Sent");
            alert.setHeaderText("Request has been sent");
            alert.setContentText("Your request has been sent successfully. Your request id is " + requestId);
            alert.showAndWait();

        } catch (Exception e) {}
    }

    @FXML
    void chooseFileOnActionButton(ActionEvent event) {
        SelectedFile = MotherOfAllClasses.fileChooser(event, chosefileID);
        if (SelectedFile != null) {
            filenameLabel.setText(SelectedFile.getName());
        }
    }
}
