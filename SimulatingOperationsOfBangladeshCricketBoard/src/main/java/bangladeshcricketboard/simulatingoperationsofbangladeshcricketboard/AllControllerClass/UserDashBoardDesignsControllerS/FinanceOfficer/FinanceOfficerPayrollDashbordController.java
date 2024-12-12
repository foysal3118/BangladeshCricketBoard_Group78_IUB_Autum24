package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class FinanceOfficerPayrollDashbordController {

    @FXML
    private BorderPane financePayrollBorderpane;

    @FXML
    void payrollHistoryOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(financePayrollBorderpane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinancePayrollHistoryDashbord.fxml");
    }

    @FXML
    void payrollLoadOnActionButton(ActionEvent event) {
        
    }

    @FXML
    void payrollRequestOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(financePayrollBorderpane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinancePayrollRequest.fxml");
    }

    @FXML
    public void declineOnActionButton(ActionEvent actionEvent) {
    }

    @FXML
    public void approveOnActionButton(ActionEvent actionEvent) {
    }
}
