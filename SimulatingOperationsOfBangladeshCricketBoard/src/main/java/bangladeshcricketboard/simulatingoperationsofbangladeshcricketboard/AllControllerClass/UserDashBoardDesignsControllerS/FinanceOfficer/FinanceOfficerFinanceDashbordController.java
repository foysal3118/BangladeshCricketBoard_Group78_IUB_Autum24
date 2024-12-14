package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class FinanceOfficerFinanceDashbordController {

    @FXML
    private BorderPane FinancefinanceBorderpane;

    @FXML
    public void initialize() {
        MotherOfAllClasses.borderPaneCenterChange(FinancefinanceBorderpane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinancefinanceBudgetRequest.fxml");
    }

    @FXML
    void budgetRequestOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(FinancefinanceBorderpane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinancefinanceBudgetRequest.fxml");
    }

    @FXML
    void createReportOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(FinancefinanceBorderpane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinancefinanceCreateReport.fxml");
    }

    @FXML
    void revenueGraphOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(FinancefinanceBorderpane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinancefinanceRavenueGraph.fxml");
    }
}
