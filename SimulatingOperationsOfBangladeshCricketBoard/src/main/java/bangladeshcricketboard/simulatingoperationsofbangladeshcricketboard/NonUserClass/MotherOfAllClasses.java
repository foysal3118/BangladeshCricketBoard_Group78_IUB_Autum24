package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass;

import java.io.IOException;

import bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.BcbMainApplicationClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MotherOfAllClasses {

    private static double xOffSet = 0;
    private static double yOffSet = 0;

    public static void logout(MouseEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(BcbMainApplicationClass.class.getResource("/logindsigns/SignIn_&_Up_Designs/LoginViewPage.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            setStageAndSetupDrag(stage, root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {}
    }

    public static void anchorPaneExpand(AnchorPane ... anchorPanes){
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setPrefWidth(165);
        }
    }

    public static void labelExpand(Label ... labels){
        for (Label label : labels) {
            label.setPrefWidth(165);
        }
    }

    public static void anchorPaneCollapse(AnchorPane ... anchorPanes){
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setPrefWidth(5);
        }
    }

    public static void labelCollapse(Label ... labels){
        for (Label label : labels) {
            label.setPrefWidth(5);
        }
    }

    public static void hideAllLabels(Label ... labels){
        for (Label label : labels) {
            label.setVisible(false);
        }
    }

    public static void showAllLabels(Label ... labels){
        for (Label label : labels) {
            label.setVisible(true);
        }
    }

    public static void mouseEnterEffectExitButton(Button ... buttons){
        for (Button button : buttons) {
            button.setOnMouseEntered(event -> {
                button.setStyle("-fx-background-color: #f21212;");
                button.setCursor(Cursor.HAND);
                button.setTextFill(Color.web("#ffffff"));
            });

            button.setOnMouseExited(event -> {
                button.setTextFill(Color.web("#f21212"));
                button.setStyle("-fx-background-color: #ffffff;");
            });
        }
    }

    public static void mouseEnterEffectMinimizeButton(Button ... buttons){
        for (Button button : buttons) {
            button.setOnMouseEntered(event -> {
                button.setStyle("-fx-background-color: #B0BEC5;");
                button.setCursor(Cursor.HAND);
            });

            button.setOnMouseExited(event -> {
                button.setTextFill(Color.web("#000000"));
                button.setStyle("-fx-background-color: #ffffff;");
            });
        } 
    }

    public static void addHoverEffect(AnchorPane ... anchorPanes) {
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setOnMouseEntered(event -> {
                anchorPane.setStyle("-fx-background-color:  #546E7A;");
                anchorPane.setCursor(Cursor.HAND);
            });

            anchorPane.setOnMouseExited(event -> {
                anchorPane.setStyle("-fx-background-color:  #004D40;");
            });
        }
    }

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

    public static void minimizeButton(ActionEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }
}
