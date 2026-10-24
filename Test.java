import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

@SuppressWarnings("deprecation")
public class Test extends Application {
    @Override 
    public void start(Stage primaryStage){
        Button btOK=new Button("ok");
        Scene scene=new Scene(btOK,600,250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
