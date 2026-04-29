import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage stage) {

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        // UI Components
        Label rollLabel = new Label("Roll No:");
        TextField rollField = new TextField();

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        // Add to grid
        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);

        // Button Action
        submitBtn.setOnAction(e -> {
            try {
                // Validation
                int rollNo = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());
                String name = nameField.getText();
                String email = emailField.getText();

                if (name.isEmpty()) {
                    throw new Exception("Name cannot be empty");
                }

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email format");
                }

                // Success Alert
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

                // Save to file using FileChooser
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Data");
                fileChooser.getExtensionFilters().add(
                        new FileChooser.ExtensionFilter("Text Files", "*.txt")
                );

                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                        bw.write(rollNo + ", " + name + ", " + age + ", " + email);
                        bw.newLine();
                    }
                }

            } catch (NumberFormatException ex) {
                showError("Roll No and Age must be valid integers");
            } catch (Exception ex) {
                showError(ex.getMessage());
            }
        });

        Scene scene = new Scene(grid, 350, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    // Method to show error alert
    private void showError(String message) {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle("Error");
        error.setHeaderText("Validation Failed");
        error.setContentText(message);
        error.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
