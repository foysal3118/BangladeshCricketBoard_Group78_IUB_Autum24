package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Random;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class LogisticInformationManageVanueController {

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private Label fileLabel;

    @FXML
    private Button chooseFile;

    private File SelectedFile;

    @FXML
    void choosefile(ActionEvent event) {
        SelectedFile = MotherOfAllClasses.fileChooser(event, chooseFile);
        if (SelectedFile != null) {
            fileLabel.setText(SelectedFile.getName());
        }
    }

    @FXML
    void sendToOnActionButton(ActionEvent event) {
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

            LocalDate date = LocalDate.now();
            Path dest = Path.of("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData", "VanueManageToSM" + ".txt");
            Path dest1 = Path.of("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData", "ManageVanue" + ".txt");

            //int id = MotherOfAllClasses.getLastID(0, "BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\BudgetRequestID.txt");

            BufferedWriter writer = new BufferedWriter(new FileWriter(dest.toFile(), true));
            BufferedWriter writer1 = new BufferedWriter(new FileWriter(dest1.toFile(), true));
            writer1.write(requestId + "," + description + "," + date.toString() + "\n");
            writer.write(requestId + "," + description + "," + content.toString() + "\n");
            writer1.close();
            writer.close();
            SelectedFile = null;

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Request Sent");
            alert.setHeaderText("Request has been sent");
            alert.setContentText("Your request has been sent successfully. Your request id is " + requestId);
            alert.showAndWait();

        } catch (Exception e) {}
    }

}
