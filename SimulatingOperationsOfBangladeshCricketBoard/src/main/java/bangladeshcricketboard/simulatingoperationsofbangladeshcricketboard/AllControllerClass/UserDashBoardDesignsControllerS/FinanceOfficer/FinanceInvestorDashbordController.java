package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class FinanceInvestorDashbordController {

    @FXML
    private BorderPane financeInvestorDashbordBorderPane;

    @FXML
    public void initialize() {
        MotherOfAllClasses.borderPaneCenterChange(financeInvestorDashbordBorderPane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinanceInvestorsAddSponsers.fxml");
    }

    @FXML
    void addSponserOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(financeInvestorDashbordBorderPane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinanceInvestorsAddSponsers.fxml");
    }

    @FXML
    void viewDetailsOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(financeInvestorDashbordBorderPane, "/user_dashboard_designs/FinanceOfficerDashBoard/FinanceInvestorsViewDetails.fxml");
    }

}
