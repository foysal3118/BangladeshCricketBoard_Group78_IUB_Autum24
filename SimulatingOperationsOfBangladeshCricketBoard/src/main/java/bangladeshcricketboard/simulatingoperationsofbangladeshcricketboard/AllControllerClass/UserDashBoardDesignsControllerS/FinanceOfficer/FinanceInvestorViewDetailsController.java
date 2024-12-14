package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import java.io.BufferedReader;
import java.io.FileReader;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinanceInvestorViewDetailsController {

    @FXML
    private ComboBox<String> filterComboBox;

    @FXML
    private TableColumn<SponserDetails, String> sponserAmmountTableColume;

    @FXML
    private TableColumn<SponserDetails, String> sponserIdTableColume;

    @FXML
    private TableColumn<SponserDetails, String> sponserJoinDateTableColume;

    @FXML
    private TableColumn<SponserDetails, String> sponserNameTableColume;

    @FXML
    private TableView<SponserDetails> sponserTableView;

    @FXML
    public void initialize() {
        sponserIdTableColume.setCellValueFactory(new PropertyValueFactory<SponserDetails, String>("Id"));
        sponserNameTableColume.setCellValueFactory(new PropertyValueFactory<SponserDetails, String>("Name"));
        sponserAmmountTableColume.setCellValueFactory(new PropertyValueFactory<SponserDetails, String>("Ammount"));
        sponserJoinDateTableColume.setCellValueFactory(new PropertyValueFactory<SponserDetails, String>("StartingDate"));

        sponserTableView.getItems().addAll(textFileLoader("BangladeshCricketBoard_Group78_IUB_Autumn24\\SimulatingOperationsOfBangladeshCricketBoard\\src\\main\\resources\\AllTextData\\SendToBPSponserDetails.txt"));
    }

    public ObservableList<SponserDetails> textFileLoader(String filePath) {
        ObservableList<SponserDetails> list = FXCollections.observableArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                SponserDetails sponserDetails = new SponserDetails(data[0], data[1], data[3], data[4]);
                list.add(sponserDetails);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @FXML
    void loadFilterOnActionButton(ActionEvent event) {

    }

}
