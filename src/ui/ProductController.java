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
import javafx.animation.FadeTransitionBuilder;
import javafx.animation.ParallelTransition;
import javafx.animation.ParallelTransitionBuilder;
import javafx.animation.RotateTransitionBuilder;
import javafx.animation.ScaleTransitionBuilder;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ProductController implements Initializable {

    @FXML
    private AnchorPane ap2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void setAddPro(MouseEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("AddProduct.fxml"));
            AnchorPane ap = loader.load();
            ap2.setTopAnchor(ap, 0.0);
            ap2.setBottomAnchor(ap, 0.0);
            ap2.setLeftAnchor(ap, 0.0);
            ap2.setRightAnchor(ap, 0.0);
            ap2.getChildren().clear();
            ap2.getChildren().add(ap);
           
           
            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(1000),ap);
//        translateTransition.setFromX(20);
//        translateTransition.setToX(380);
//        

            translateTransition.setFromX(1000);
            translateTransition.setToX(0);
            

                
//        translateTransition = TranslateTransitionBuilder.create()
//                .duration(Duration.millis(1000))
//                .node(ap)
//                .fromX(1000)
//                .toX(0)
//                
//                .build();

        translateTransition.play();
        
        
        } catch (IOException ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
