package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Created by svetlana on 19.11.16.
 */
public class JavaFX_n2ide extends Application {
    int readeArv = 7;

    @Override
    public void start(Stage primaryStage) {

        VBox stageLayout = new VBox();
        Scene scene = new Scene(stageLayout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();


        for (int i = 0; i < readeArv; i++) {
            Ellipse elly = new Ellipse(180, 28);
            elly.setFill(Color.AQUA);
            stageLayout.getChildren().add(elly);
        }



    }
}
