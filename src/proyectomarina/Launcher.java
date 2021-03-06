/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomarina;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import proyectomarina.model.MarineAccessor;

/**
 *
 * @author Alejandro
 */
public class Launcher extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        // Carga el archivo .NMEA
        MarineAccessor.getInstance().addSentenceReader(getClass().getResourceAsStream("/lib/data/Jul_20_2017_1871339_0183.NMEA"));
        //Carga la ventana principal
        Parent root = FXMLLoader.load(getClass().getResource("/proyectomarina/view/PrincipalView.fxml"));
        
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setTitle("Datos estación marina");
        stage.setOnCloseRequest(evt -> System.exit(0));
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
