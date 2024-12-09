//module bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard {
//    requires javafx.controls;
//    requires javafx.fxml;
//
//
//    opens bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard to javafx.fxml;
//    exports bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard;
//}
module bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard {
    requires javafx.controls;
    requires javafx.fxml;

    // Export specific package containing the controller to javafx.fxml
    opens bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager to javafx.fxml;

    // Optionally, you can open the base package too
    opens bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard to javafx.fxml;
    exports bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard;
}
