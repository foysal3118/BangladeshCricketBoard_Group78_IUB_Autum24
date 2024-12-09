package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.IOException;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.BcbMainApplicationClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class LogisticManagerInformationDashbordController {

    @FXML
    private BorderPane logisticInformationBorderpane;

    @FXML
    private TextField searchTextField;

    @FXML
    void historyOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticInformationHistory.fxml"));
            logisticInformationBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void manageVenueOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticInformationManageVanue.fxml"));
            logisticInformationBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void matchDatesOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticInformationMatchDates.fxml"));
            logisticInformationBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void searchOnMouseClick(MouseEvent event) {

    }

    @FXML
    void transportationDetailsOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticInformationTransportationDetails.fxml"));
            logisticInformationBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

}
