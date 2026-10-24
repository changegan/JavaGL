import javafx.application.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;

@SuppressWarnings("deprecation")
public class ShowCircleCentered extends Application {
    @Override 
    public void start(Stage primaryStage){
        //Create a pane to hold the circle
        Pane pane=new Pane();

        //create a circle and set its properties
        Circle circle=new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.YELLOWGREEN);
        pane.getChildren().add(circle);

        Scene scene=new Scene(pane,600,350);
        primaryStage.setTitle("ShowCircleCentered");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
