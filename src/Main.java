import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.Button;

import javax.xml.soap.Text;


public class Main extends Application {


    Stage window;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("My Title");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

//Name label
        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel, 0, 0);

// Name input
        TextField nameInput = new TextField("Luke");
        GridPane.setConstraints(nameInput, 1, 0);

//Password Label
        Label passLabel = new Label ("Password");
        GridPane.setConstraints(passLabel, 0, 1);

//Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);
//Button
        Button loginButton = new Button ("Log in");
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid, 300 ,200);
        window.setScene(scene);
        window.show();
        }
    }

