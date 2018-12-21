/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.ScaleTransitionBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AddProductController implements Initializable {

    
    public static AnchorPane app1;
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void setProBack(ActionEvent event) {
        
        try {
            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Product.fxml"));
            AnchorPane ap = loader.load();
            app1.setTopAnchor(ap, 0.0);
            app1.setBottomAnchor(ap, 0.0);
            app1.setLeftAnchor(ap, 0.0);
            app1.setRightAnchor(ap, 0.0);
           app1.getChildren().clear();
           app1.getChildren().add(ap);
      
            FadeTransition ft=new FadeTransition(Duration.millis(1000));
            ft.setNode(ap);
            ft.setFromValue(0);
            ft.setToValue(1);
           ft.play();
            

        } catch (Exception ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
