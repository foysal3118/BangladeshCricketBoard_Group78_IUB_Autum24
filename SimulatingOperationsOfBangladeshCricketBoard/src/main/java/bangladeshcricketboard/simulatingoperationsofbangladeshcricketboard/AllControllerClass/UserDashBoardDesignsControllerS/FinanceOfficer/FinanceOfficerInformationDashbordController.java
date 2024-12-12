package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class FinanceOfficerInformationDashbordController {

    @FXML
    private BorderPane financeInformationBorderpane;

    @FXML
    void costreportOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(financeInformationBorderpane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinanceInformationCostReport.fxml");
    }

    @FXML
    void eventCostOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(financeInformationBorderpane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinanceInformationEventCost.fxml");
    }

    @FXML
    void inventoryLoadOnActionButton(ActionEvent event) {

    }

    @FXML
    void salesReportOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(financeInformationBorderpane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinanceInformationSalesReport.fxml");
    }
}
