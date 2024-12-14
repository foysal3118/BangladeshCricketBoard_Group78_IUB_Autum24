package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.Event;
import javafx.scene.layout.BorderPane;

public class FinanceOfficerPayrollDashbordController
{
    @javafx.fxml.FXML
    private BorderPane financePayrollBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
        MotherOfAllClasses.borderPaneCenterChange(financePayrollBorderPane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinancePayrollRequest.fxml");
    }

    @javafx.fxml.FXML
    public void payrollHistoryOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(financePayrollBorderPane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinancePayrollHistoryDashbord.fxml");
    }

    @javafx.fxml.FXML
    public void payrollRequestOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(financePayrollBorderPane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinancePayrollRequest.fxml");
    }
}