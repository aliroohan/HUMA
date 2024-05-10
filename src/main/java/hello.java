import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) throws IOException{
        Stage stage1=new Stage();
        stage.setTitle("HUMA BOT");
        Group root =new Group();
        Image image =new Image("download.jpg");
        Scene scene =new Scene(root, Color.rgb(89,79,67));
        stage.getIcons().addAll(image);
        stage.setScene(scene);
        stage.show();



    }


}