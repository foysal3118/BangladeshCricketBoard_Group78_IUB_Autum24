package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.SalesManager;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class SalesManagerInformationDashbordController {

    @FXML
    private BorderPane SalesInformationBorderpan;

    @FXML
    private TextField searchTextField;

    @FXML
    void HistoryOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(SalesInformationBorderpan, "/user_dashboard_designs/SalesManagerDashBoard/SalesInformationHistory.fxml");
    }

    @FXML
    void matchDatesOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(SalesInformationBorderpan, "/user_dashboard_designs/SalesManagerDashBoard/SalesInformationMatchDates.fxml");
    }

    @FXML
    void salesReportOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(SalesInformationBorderpan, "/user_dashboard_designs/SalesManagerDashBoard/SalesInformationSalesReport.fxml");
    }

    @FXML
    void searchOnMouseClick(MouseEvent event) {

    }
}
