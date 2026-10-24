import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Font;

@SuppressWarnings("deprecation")
public class FontDemo extends Application {
    @Override // Override the start method int the Application class
    public void start(Stage primaryStage){
        // Create a pane to hold the circle
        Pane pane=new StackPane();

        //Create a circle and set its properties
        Circle circle=new Circle();
        circle.setRadius(60);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(0.5, 0.5, 0.8, 0.3));
        pane.getChildren().add(circle);

        //Create a label and set its properties
        Label label=new Label("JavaFX");
        label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
        pane.getChildren().add(label);

        //Create a scene and place it int the stage
        Scene scene=new Scene(pane,600,350);
        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Test FontDemo
    public static void main(String[] args){
        Application.launch(args);
    }
}