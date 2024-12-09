package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BcbMainApplicationClass extends Application {

    private double xOffSet = 0;
    private double yOffSet = 0;

    @Override
    public void start(Stage stage) throws IOException {

        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);

        FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/user_dashboard_designs/logistic_manger_dashboard/LogisticManagerDashbordViewPage.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        root.setOnMousePressed(event -> {
            xOffSet = event.getSceneX();
            yOffSet = event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffSet);
            stage.setY(event.getScreenY() - yOffSet);
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}