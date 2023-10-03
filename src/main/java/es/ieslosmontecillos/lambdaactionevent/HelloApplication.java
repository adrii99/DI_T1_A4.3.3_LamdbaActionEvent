package es.ieslosmontecillos.lambdaactionevent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

    //Label
    Label lbInteres = new Label("Annual Interest Rate");
    Label lbNuAños = new Label("Annual Interest Rate");
    Label lbCantidad = new Label("Annual Interest Rate");
    Label lbCantMes = new Label("Annual Interest Rate");
    Label lbTotal = new Label("Annual Interest Rate");

    //TextField
    TextField   tf1 = new TextField();
    TextField   tf2 = new TextField();
    TextField   tf3 = new TextField();
    TextField   tf4 = new TextField();
    TextField   tf5 = new TextField();

    //GridPane


    Scene scene = new Scene();



    }

    public static void main(String[] args) {
        launch();
    }
}