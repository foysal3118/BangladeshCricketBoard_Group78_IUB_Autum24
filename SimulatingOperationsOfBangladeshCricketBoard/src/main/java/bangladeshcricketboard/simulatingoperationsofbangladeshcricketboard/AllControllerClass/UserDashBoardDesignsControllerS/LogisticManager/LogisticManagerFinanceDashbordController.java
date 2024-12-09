package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.IOException;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.BcbMainApplicationClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class LogisticManagerFinanceDashbordController {

    @FXML
    private BorderPane LogisticFinanceBorderpan;

    @FXML
    void budgetRequestOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticFinanceBudgetRequest.fxml"));
            LogisticFinanceBorderpan.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void chooseFileOnActionButton(ActionEvent event) {

    }

    @FXML
    void costReportOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticFinanceCostReport.fxml"));
            LogisticFinanceBorderpan.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void requestStatusOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticFinanceRequestStatus.fxml"));
            LogisticFinanceBorderpan.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void sendRequestOnActionButton(ActionEvent event) {

    }

    @FXML
    void updateBudgetOnActionButton(ActionEvent event) {

    }

    @FXML
    void viewRequestsOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticFinanceViewRequests.fxml"));
            LogisticFinanceBorderpan.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

}
