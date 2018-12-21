/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.ScaleTransition;
import javafx.animation.ScaleTransitionBuilder;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Path;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Main2Controller implements Initializable {

    @FXML
    private ImageView ivsup;
    @FXML
    private ImageView ivemp;
    @FXML
    private ImageView ivpro;
    @FXML
    private ImageView ivinvo;
    @FXML
    private ImageView ivgrn;
    @FXML
    private ImageView ivpay;
    @FXML
    private ImageView ivatt;
    @FXML
    private ImageView ivsett;
    private ScaleTransition scaleTransition;
    @FXML
    private AnchorPane ap1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void setHome(MouseEvent event) {

        System.out.println(ivsup.getLayoutX());
        System.out.println(ivsup.getLayoutY());
        
        double i=0.5;

        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(i), ivsup);
        //translateTransition.setFromX(20);
        tt1.setToX(-280);
        tt1.setToY(-180);
        
        TranslateTransition tt2 = new TranslateTransition(Duration.seconds(i), ivemp);
        //translateTransition.setFromX(20);
        tt2.setToX(-270);
        tt2.setToY(-280);
        
        TranslateTransition tt3 = new TranslateTransition(Duration.seconds(i), ivpro);
        //translateTransition.setFromX(20);
        tt3.setToX(-260);
        tt3.setToY(-180);
        
        TranslateTransition tt4 = new TranslateTransition(Duration.seconds(i), ivinvo);
        //translateTransition.setFromX(20);
        tt4.setToX(-250);
        tt4.setToY(-280);
        
        TranslateTransition tt5 = new TranslateTransition(Duration.seconds(i), ivgrn);
        //translateTransition.setFromX(20);
        tt5.setToX(165);
        tt5.setToY(-280);
        
        TranslateTransition tt6 = new TranslateTransition(Duration.seconds(i), ivpay);
        //translateTransition.setFromX(20);
        tt6.setToX(175);
        tt6.setToY(-180);
        
        TranslateTransition tt7 = new TranslateTransition(Duration.seconds(i), ivatt);
        //translateTransition.setFromX(20);
        tt7.setToX(185);
        tt7.setToY(-280);
        
        TranslateTransition tt8 = new TranslateTransition(Duration.seconds(i), ivsett);
        //translateTransition.setFromX(20);
        tt8.setToX(195);
        tt8.setToY(-180);
        

        tt1.play();
        tt2.play();
        tt3.play();
        tt4.play();
        tt5.play();
        tt6.play();
        tt7.play();
        tt8.play();

//        PathTransition pathTransition = PathTransitionBuilder.create()
//                .duration(Duration.seconds(4))
//                .path(path1)
//                .node(ivsup)
//                //.orientation(OrientationType.ORTHOGONAL_TO_TANGENT)
//                 
//                .build();
//        pathTransition.play();
    }

    @FXML
    private void setHome2(ActionEvent event) {
    
        double i=0.5;
        
        
        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(i), ivsup);
        //translateTransition.setFromX(20);
        tt1.setToX(0);
        tt1.setToY(0);
        
        TranslateTransition tt2 = new TranslateTransition(Duration.seconds(i), ivemp);
        //translateTransition.setFromX(20);
        tt2.setToX(0);
        tt2.setToY(0);
        
        TranslateTransition tt3 = new TranslateTransition(Duration.seconds(i), ivpro);
        //translateTransition.setFromX(20);
        tt3.setToX(0);
        tt3.setToY(0);
        
        TranslateTransition tt4 = new TranslateTransition(Duration.seconds(i), ivinvo);
        //translateTransition.setFromX(20);
        tt4.setToX(0);
        tt4.setToY(0);
        
        TranslateTransition tt5 = new TranslateTransition(Duration.seconds(i), ivgrn);
        //translateTransition.setFromX(20);
        tt5.setToX(0);
        tt5.setToY(0);
        
        TranslateTransition tt6 = new TranslateTransition(Duration.seconds(i), ivpay);
        //translateTransition.setFromX(20);
        tt6.setToX(0);
        tt6.setToY(0);
        
        TranslateTransition tt7 = new TranslateTransition(Duration.seconds(i), ivatt);
        //translateTransition.setFromX(20);
        tt7.setToX(0);
        tt7.setToY(0);
        
        TranslateTransition tt8 = new TranslateTransition(Duration.seconds(i), ivsett);
        //translateTransition.setFromX(20);
        tt8.setToX(0);
        tt8.setToY(0);
        

        tt1.play();
        tt2.play();
        tt3.play();
        tt4.play();
        tt5.play();
        tt6.play();
        tt7.play();
        tt8.play();

    }

    @FXML
    private void setSup(MouseEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Supplier.fxml"));
            AnchorPane ap = loader.load();
            ap1.setTopAnchor(ap, 0.0);
            ap1.setBottomAnchor(ap, 0.0);
            ap1.setLeftAnchor(ap, 0.0);
            ap1.setRightAnchor(ap, 0.0);
            ap1.getChildren().clear();
            ap1.getChildren().add(ap);

            
  
            
            
            scaleTransition = ScaleTransitionBuilder.create()
                    .node(ap)
                    .duration(Duration.seconds(1))
                    .fromX(0)
                    .fromY(0)
                    .toX(1)
                    .toY(1)
                    .build();

            scaleTransition.play();

        } catch (Exception ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
