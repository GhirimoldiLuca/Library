package library.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * JavaFX Library by Ghirimoldi Luca
 */
public class App extends Application implements Constants{

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML(initialPath), 640, 480);
        stage.setScene(scene);
        stage.setTitle(projectTitle);
        //stage.getIcons().add(new Image(iconProjectFolder));
        stage.setResizable(false);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ext));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}