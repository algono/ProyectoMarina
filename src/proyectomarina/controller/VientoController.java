/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomarina.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import proyectomarina.model.MarineAccessor;

/**
 * FXML Controller class
 *
 * @author aleja
 */
public class VientoController implements Initializable {
    @FXML
    private Label awa;
    @FXML
    private Label twd;
    @FXML
    private Label tws;
    @FXML
    private Label aws;
    

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        awa.textProperty().bind(Bindings.concat(
            MarineAccessor.getInstance().AWAProperty(), "º"
        ));
        aws.textProperty().bind(Bindings.concat(
            MarineAccessor.getInstance().AWSProperty(), "Kn"
        ));
        twd.textProperty().bind(Bindings.concat(
            MarineAccessor.getInstance().TWDProperty(), "º"
        ));
        tws.textProperty().bind(Bindings.concat(
            MarineAccessor.getInstance().TWSProperty(), "Kn"
        ));
    }    
    
}
