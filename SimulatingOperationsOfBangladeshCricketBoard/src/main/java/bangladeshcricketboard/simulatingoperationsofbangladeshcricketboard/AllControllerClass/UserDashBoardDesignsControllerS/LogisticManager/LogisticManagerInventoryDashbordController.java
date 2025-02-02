package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.MotherOfAllClasses;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class LogisticManagerInventoryDashbordController {

    @FXML
    private BorderPane LogisticInventoryBorderpane;

    @FXML
    public void initialize() {
        MotherOfAllClasses.borderPaneCenterChange(LogisticInventoryBorderpane, "/user_dashboard_designs/logistic_manger_dashboard/LogisticInventoryShowAllItems.fxml");
    }

    @FXML
    void inventoryAddItemsOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(LogisticInventoryBorderpane, "/user_dashboard_designs/logistic_manger_dashboard/LogisticInventoryAddItems.fxml");
    }

    @FXML
    void inventoryItemListOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(LogisticInventoryBorderpane, "/user_dashboard_designs/logistic_manger_dashboard/LogisticInventoryItemList.fxml");
    }

    @FXML
    void inventoryShowAllItemsOnMouseClick(MouseEvent event) {
        MotherOfAllClasses.borderPaneCenterChange(LogisticInventoryBorderpane, "/user_dashboard_designs/logistic_manger_dashboard/LogisticInventoryShowAllItems.fxml");
    }
}
