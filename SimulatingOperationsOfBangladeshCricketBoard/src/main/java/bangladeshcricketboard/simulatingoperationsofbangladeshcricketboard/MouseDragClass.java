package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class MouseDragClass {
    private static double xOffSet = 0;
    private static double yOffSet = 0;
            
    public static void setStageAndSetupDrag(Stage stage, Parent root) {
        
        root.setOnMousePressed(event -> {
        xOffSet = event.getSceneX();
        yOffSet = event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffSet);
            stage.setY(event.getScreenY() - yOffSet);
        });
    }
}
