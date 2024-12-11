package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.BcbMainApplicationClass;
import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.MouseDragClass;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class CommonUltilityForUser {
    public static void logout(MouseEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/logindsigns/SignIn_&_Up_Designs/LoginViewPage.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            MouseDragClass.setStageAndSetupDrag(stage, root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {}
    }
}
