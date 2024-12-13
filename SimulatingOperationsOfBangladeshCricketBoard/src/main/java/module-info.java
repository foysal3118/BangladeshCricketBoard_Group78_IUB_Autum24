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
    requires javafx.graphics;

    // Export specific package containing the controller to javafx.fxml
    opens bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.LogisticManager to javafx.fxml;
    opens bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer to javafx.fxml;
    opens bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.SalesManager to javafx.fxml;
    opens bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.ScheduleManger to javafx.fxml;
    opens bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.BoardPresident to javafx.fxml;
    // Optionally, you can open the base package too
    opens bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard to javafx.fxml;
    exports bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard;
}
