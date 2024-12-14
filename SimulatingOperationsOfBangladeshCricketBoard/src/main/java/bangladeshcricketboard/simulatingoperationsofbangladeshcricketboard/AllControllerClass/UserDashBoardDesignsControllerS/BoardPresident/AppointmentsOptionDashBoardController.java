package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.BoardPresident;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.AllModelClasses.Appointment;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
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
    }

    @javafx.fxml.FXML
    public void ApproveAppointmentButtonOnAction(ActionEvent actionEvent) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\main\\resources\\AllTextData\\ApprovedAppointmentDetails.txt", true))) {

            //bufferedWriter.write(.toString()+"\n");
            bufferedWriter.close();
        } catch (IOException e) {}

    }

    @javafx.fxml.FXML
    public void LoadApprovedAppointmentsButtonOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void LoadNewAppointmentsButtonOnAction(ActionEvent actionEvent) {
        initialize();
    }
}