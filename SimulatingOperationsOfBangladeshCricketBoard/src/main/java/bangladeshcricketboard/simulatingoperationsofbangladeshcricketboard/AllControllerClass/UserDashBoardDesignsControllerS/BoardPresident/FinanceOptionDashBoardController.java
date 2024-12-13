package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.BoardPresident;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class FinanceOptionDashBoardController
{
    @javafx.fxml.FXML
    private BorderPane FinanceOptionDashBoardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
        MotherOfAllClasses.borderPaneCenterChange(FinanceOptionDashBoardBorderPane,"/user_dashboard_designs/BoardPresidentDashBoard/AnnualCostReportViewPage.fxml");
    }
    @javafx.fxml.FXML
    public void AnnualSalesReportOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(FinanceOptionDashBoardBorderPane,"/user_dashboard_designs/BoardPresidentDashBoard/AnnualSalesReportViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void AnnualCostReportOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(FinanceOptionDashBoardBorderPane,"/user_dashboard_designs/BoardPresidentDashBoard/AnnualCostReportViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void PendingSponsorshipDetailsOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(FinanceOptionDashBoardBorderPane,"/user_dashboard_designs/BoardPresidentDashBoard/SponsorshipDetailsViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void AnnualBudgetOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(FinanceOptionDashBoardBorderPane,"/user_dashboard_designs/BoardPresidentDashBoard/AnnualBudgetViewPage.fxml");
    }

    @javafx.fxml.FXML
    public void OfficialSponsersOnMouseClick(Event event) {
        MotherOfAllClasses.borderPaneCenterChange(FinanceOptionDashBoardBorderPane,"/user_dashboard_designs/BoardPresidentDashBoard/OfficialSponserDetailsViewPage.fxml");
    }
}