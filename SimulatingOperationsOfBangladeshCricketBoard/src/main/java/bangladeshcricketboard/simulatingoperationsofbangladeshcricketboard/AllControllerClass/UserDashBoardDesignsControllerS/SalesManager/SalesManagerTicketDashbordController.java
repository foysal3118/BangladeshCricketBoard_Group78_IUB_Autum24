package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.SalesManager;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class SalesManagerTicketDashbordController {

    @FXML
    private BorderPane salesTicketBorderpan;

    @FXML
    void refundOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(salesTicketBorderpan, "/user_dashboard_designs/SalesManagerDashBoard/SalesTicketRefund.fxml");
    }

    @FXML
    void sellTicketOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(salesTicketBorderpan, "/user_dashboard_designs/SalesManagerDashBoard/SalesSellTicket.fxml");
    }

    @FXML
    void sendRequestOnActionButton(ActionEvent event) {

    }

    @FXML
    void soldHistoryOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(salesTicketBorderpan, "/user_dashboard_designs/SalesManagerDashBoard/SalesSoldHistory.fxml");
    }

}
