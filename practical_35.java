import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class GradeBarChart extends Application {

    // Max height for 100%
    private static final double MAX_HEIGHT = 200;

    @Override
    public void start(Stage stage) {

        // Create bars
        VBox projectsBar = createBar("Projects — 20%", 20, Color.RED);
        VBox quizzesBar = createBar("Quizzes — 10%", 10, Color.BLUE);
        VBox midtermBar = createBar("Midterm — 30%", 30, Color.GREEN);
        VBox finalBar = createBar("Final — 40%", 40, Color.ORANGE);

        // Arrange bars horizontally
        HBox hbox = new HBox(30);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.getChildren().addAll(projectsBar, quizzesBar, midtermBar, finalBar);

        Scene scene = new Scene(hbox, 500, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    // Method to create a single bar with label
    private VBox createBar(String labelText, double percentage, Color color) {

        // Calculate height proportional to percentage
        double height = (percentage / 100) * MAX_HEIGHT;

        Rectangle bar = new Rectangle(50, height);
        bar.setFill(color);

        Label label = new Label(labelText);

        VBox vbox = new VBox(5);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.getChildren().addAll(bar, label);

        return vbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
