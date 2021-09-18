import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Appinitilizer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.initStyle(StageStyle.TRANSPARENT);

            Parent parent = FXMLLoader.load(getClass().getResource("view/Calculator.fxml"));
            Scene scene = new Scene(parent);
            scene.setFill(Color.TRANSPARENT);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Home Page");
            primaryStage.centerOnScreen();
            primaryStage.setResizable(false);
            primaryStage.show();


    }
}
