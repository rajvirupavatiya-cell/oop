import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;

import java.util.Random;

public class RandomTextDisplay extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox vbox = new VBox(15); // spacing between texts
        vbox.setAlignment(Pos.CENTER); // center horizontally

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);

            // Set font: Times New Roman, Bold + Italic, size 22
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

            // Random color
            Color randomColor = Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
            text.setFill(randomColor);

            // Random opacity between 0.3 and 1.0
            double opacity = 0.3 + (0.7 * rand.nextDouble());
            text.setOpacity(opacity);

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setTitle("Random Styled Texts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
