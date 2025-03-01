import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class FanGroup extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        Fan fan3 = new Fan();

        Button startButton = new Button("Start All Fans");
        Button stopButton = new Button("Stop All Fans");
        Button reverseButton = new Button("Reverse All Fans");

        startButton.setOnAction(e -> {
            fan1.play();
            fan2.play();
            fan3.play();
        });

        stopButton.setOnAction(e -> {
            fan1.pause();
            fan2.pause();
            fan3.pause();
        });

        reverseButton.setOnAction(e -> {
            fan1.reverse();
            fan2.reverse();
            fan3.reverse();
        });

        HBox fanBox = new HBox(fan1, fan2, fan3);
        HBox buttonBox = new HBox(startButton, stopButton, reverseButton);

        HBox root = new HBox(fanBox, buttonBox);

        Scene scene = new Scene(root, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fan Group");
        primaryStage.show();
    }
}
