package main;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by svetlana on 18.11.16.
 */
public class Pommitamine_JavaFX extends Application{
    GridPane laud;
    int lauaPikkusLaevades = 9;
    int laevaPikkusPx = 50;

    @Override
    public void start(Stage primaryStage) throws Exception {
        seadistaLava();
        sisestaLaevad();
        reageeriKlikile();
    }

    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();
            String tyyp = ruut.getId();

            if (tyyp.equals("meri")) {
                ruut.setFill(Color.AQUA);
            } else if (tyyp.equals("laev")) {
                ruut.setFill(Color.RED);
                ruut.setId("p6hjas");
            }

            if (!laevasidOnAlles()) {
                //gameOver();

            }
        });
    }

    private boolean laevasidOnAlles() {
        for (Node  ruut : laud.getChildren()) {

        }
        return false;
    }

    private void sisestaLaevad() {
        for (int i = 0; i < lauaPikkusLaevades; i++) {
            for (int j = 0; j < lauaPikkusLaevades; j++) {
                Rectangle ruut = new Rectangle(laevaPikkusPx, laevaPikkusPx);
                int rand = (int) (Math.random() * 1.3);
                if (rand == 1){
                    ruut.setId("laev");
                } else {
                    ruut.setId("meri");
                }
                laud.add(ruut, i, j);
                ruut.setFill(Color.BLUE);
            }
        }
    }

    private void seadistaLava() {
        laud = new GridPane();
        Scene scene = new Scene(laud, lauaPikkusLaevades * laevaPikkusPx,
                lauaPikkusLaevades * laevaPikkusPx);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
