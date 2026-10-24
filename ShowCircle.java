import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

@SuppressWarnings("deprecation")
public class ShowCircle extends Application {
    @Override 
    public void start(Stage primaryStage){
        Circle circle=new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.YELLOWGREEN);
        circle.setFill(Color.YELLOWGREEN);

        Pane pane=new Pane();
        pane.getChildren().add(circle);
        
        //Button btOK=new Button("OK");
        StackPane pane2=new StackPane();
        pane2.getChildren().add(new Button("ok"));

       
        Scene scene=new Scene(pane,600,250);
        primaryStage.setTitle("ShowCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
