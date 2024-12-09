package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager;

import java.io.IOException;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.BcbMainApplicationClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class LogisticManagerInventoryDashbordController {

    @FXML
    private BorderPane LogisticInventoryBorderpane;

    @FXML
    private TextField searchTextField;

    @FXML
    void inventoryAddItemsOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticInventoryAddItems.fxml"));
            LogisticInventoryBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void inventoryItemListOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticInventoryItemList.fxml"));
            LogisticInventoryBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @FXML
    void inventoryLoadOnActionButton(ActionEvent event) {

    }

    @FXML
    void inventoryShowAllItemsOnMouseClick(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticInventoryShowAllItems.fxml"));
            LogisticInventoryBorderpane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

}
