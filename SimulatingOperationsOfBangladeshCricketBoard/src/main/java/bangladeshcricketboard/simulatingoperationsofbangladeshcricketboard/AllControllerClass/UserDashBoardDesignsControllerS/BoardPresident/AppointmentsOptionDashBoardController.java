package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.BoardPresident;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.AllModelClasses.Appointment;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class AppointmentsOptionDashBoardController
{
    @javafx.fxml.FXML
    private TextField AppointmentIDTextField;
    @javafx.fxml.FXML
    private TableColumn<Appointment,String> AppointmentIDCol;
    @javafx.fxml.FXML
    private TableColumn<Appointment, String> TimeCol;
    @javafx.fxml.FXML
    private TableView<Appointment> AppointmentDetailsTableView;
    @javafx.fxml.FXML
    private TableColumn<Appointment, LocalDate>DateCol;
    @javafx.fxml.FXML
    private TableColumn<Appointment,String> NameCol;

    @javafx.fxml.FXML
    public void initialize() {
        AppointmentDetailsTableView.getItems().clear();
        NameCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
        AppointmentIDCol.setCellValueFactory(new PropertyValueFactory<>("ID"));
        TimeCol.setCellValueFactory(new PropertyValueFactory<>("Time"));
        DateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        AppointmentDetailsTableView.getItems().addAll(textFileLoader("src\\main\\resources\\AllTextData\\ScheduleManager_To_BoardPresident_Appointment.txt"));
    }
    public ObservableList<Appointment> textFileLoader(String filePath) {
        ObservableList<Appointment> list = FXCollections.observableArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Appointment newAppointment = new Appointment(data[0],data[1] , data[2], data[3],data[4],data[5],data[6]);
                list.add(newAppointment);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    @javafx.fxml.FXML
    public void CancelAppointmentButtonOnAction(ActionEvent actionEvent) {
        String Id = AppointmentIDTextField.getText();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\main\\resources\\AllTextData\\ScheduleManager_To_BoardPresident_Appointment.txt"));
            String ReAddLine ="";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                if(!(data[0].equals(Id))) {
                    ReAddLine = ReAddLine +  line + "\n";
                }
            }
            bufferedReader.close();
            clearFileContent("src\\main\\resources\\AllTextData\\ScheduleManager_To_BoardPresident_Appointment.txt");
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\main\\resources\\AllTextData\\ScheduleManager_To_BoardPresident_Appointment.txt", true))) {
                bufferedWriter.write(ReAddLine);
                bufferedWriter.close();
            } catch (IOException e) {}

        } catch (Exception e) {
            e.printStackTrace();
        }
        AppointmentIDTextField.clear();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Item Added");
        alert.setHeaderText("Appointment Declined !");
        alert.showAndWait();
        initialize();
    }

    @javafx.fxml.FXML
    public void ApproveAppointmentButtonOnAction(ActionEvent actionEvent) {
        String Id = AppointmentIDTextField.getText();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\main\\resources\\AllTextData\\ScheduleManager_To_BoardPresident_Appointment.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                if(data[0].equals(Id)){
                    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\main\\resources\\AllTextData\\ApprovedAppointmentDetails.txt", true))) {
                        bufferedWriter.write(line+"\n");
                        bufferedWriter.close();
                    } catch (IOException e) {}
                    break;
                }
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Item Added");
        alert.setHeaderText("Appointment Approved !");
        alert.showAndWait();
        AppointmentIDTextField.clear();
    }
    @javafx.fxml.FXML
    public void LoadApprovedAppointmentsButtonOnAction(ActionEvent actionEvent) {
        AppointmentDetailsTableView.getItems().clear();
        NameCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
        AppointmentIDCol.setCellValueFactory(new PropertyValueFactory<>("ID"));
        TimeCol.setCellValueFactory(new PropertyValueFactory<>("Time"));
        DateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));
        AppointmentDetailsTableView.getItems().addAll(textFileLoader("src\\main\\resources\\AllTextData\\ApprovedAppointmentDetails.txt"));
    }

    @javafx.fxml.FXML
    public void LoadNewAppointmentsButtonOnAction(ActionEvent actionEvent) {
        initialize();
    }
    //Clear ALl data from txt file
    public static void clearFileContent(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("");
        }
    }
}