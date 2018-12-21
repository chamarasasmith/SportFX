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
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginController implements Initializable {

    @FXML
    private TextField tfuser;
    
    @FXML
    private PasswordField pfpw;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void setClear(ActionEvent event) {
        
        
        tfuser.clear();
        pfpw.clear();
        
    }

    @FXML
    private void setLogin(ActionEvent event) {
        
        if (tfuser.getText().equalsIgnoreCase("cs")& pfpw.getText().equalsIgnoreCase("123")) {
            
            
            try {
                
               Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Main1.fxml"));
            AnchorPane ap = loader.load();
                Scene scene = new Scene(ap,Color.TRANSPARENT);
                
             stage.setScene(scene);
             stage.setMaximized(true);
          stage.initStyle(StageStyle.TRANSPARENT);
             stage.show();
           sportfx.st.hide();
             
                FadeTransition ft=new FadeTransition(Duration.millis(1000));
                ft.setNode(Main1Controller.anp1);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                
         
        
        
        } catch (IOException ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING,"Try Again",ButtonType.CLOSE);
            alert.showAndWait();
            
        }
        
        
        
    }

    @FXML
    private void setExit(ActionEvent event) {
    System.exit(0);
    }
    
}
