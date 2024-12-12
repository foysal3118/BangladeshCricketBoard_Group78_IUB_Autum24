package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.SalesManager;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class SalesManagerMerchendiseDashbordController {

    @FXML
    private BorderPane salesMerchendiseBorderpan;

    @FXML
    void refundOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(salesMerchendiseBorderpan, "/user_dashboard_designs/SalesManagerDashBoard/SalesMerchendiseRefund.fxml");
    }

    @FXML
    void sellMerchendiseOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(salesMerchendiseBorderpan, "/user_dashboard_designs/SalesManagerDashBoard/SalesMerchendiseSellMerchendise.fxml");
    }

    @FXML
    void sendRequestOnActionButton(ActionEvent event) {

    }

    @FXML
    void soldHistoryOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(salesMerchendiseBorderpan, "/user_dashboard_designs/SalesManagerDashBoard/SalesMerchendiseSoldHistory.fxml");
    }

}
