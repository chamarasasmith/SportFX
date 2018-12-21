/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.ScaleTransitionBuilder;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Main1Controller implements Initializable {

    @FXML
    private ImageView iview;
    @FXML
    private ImageView lbsettings;
    @FXML
    private ImageView lbsup;
    @FXML
    private ImageView lbemp;
    @FXML
    private ImageView lbproduct;
    @FXML
    private ImageView lbinvoice;
    @FXML
    private ImageView lbpayroll;
    @FXML
    private ImageView lbattend;

    ScaleTransition scaleTransition;
    @FXML
    private AnchorPane ap1;
    @FXML
    private ImageView lbgrn;
    @FXML
    private Label tsup;
    @FXML
    private Label temp;
    @FXML
    private Label tpro;
    @FXML
    private Label tinvo;
    @FXML
    private Label tgrn;
    @FXML
    private Label tatt;
    @FXML
    private Label tseti;
    @FXML
    private AnchorPane an1;
    static AnchorPane anp1;
    @FXML
    private Label tpay;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        AddProductController.app1 = ap1;
        anp1 = an1;

    }

    @FXML
    private void setClose(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void setCloseIconEx(MouseEvent event) {

        try {
            File file = new File("src/Image2/1c1.png");
            String localUrl = file.toURI().toURL().toString();
            // don't load in the background
            Image localImage = new Image(localUrl);

            iview.setImage(localImage);
        } catch (Exception ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void setCloseIconEn(MouseEvent event) {

        try {
            File file = new File("src/Image2/1c2.png");
            String localUrl = file.toURI().toURL().toString();
            // don't load in the background
            Image localImage = new Image(localUrl);

            iview.setImage(localImage);
        } catch (Exception ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void setMiniIconEx(MouseEvent event) {

        try {
            File file = new File("src/Image2/1c1.png");
            String localUrl = file.toURI().toURL().toString();
            // don't load in the background
            Image localImage = new Image(localUrl);

            iview.setImage(localImage);
        } catch (Exception ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void setMiniIconEn(MouseEvent event) {

        try {
            File file = new File("src/Image2/1c3.png");
            String localUrl = file.toURI().toURL().toString();
            // don't load in the background
            Image localImage = new Image(localUrl);

            iview.setImage(localImage);
        } catch (Exception ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void setSettingEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbsettings)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tseti);
        fadeTransition.setToValue(0);

        fadeTransition.play();

    }

    @FXML
    private void setSettingEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbsettings)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tseti);
        fadeTransition.setToValue(1);

        fadeTransition.play();

    }

    @FXML
    private void setSupEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbsup)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tsup);
        fadeTransition.setToValue(1);

        fadeTransition.play();

    }

    @FXML
    private void setSupEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbsup)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tsup);
        fadeTransition.setToValue(0);

        fadeTransition.play();

    }

    @FXML
    private void setEmpEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbemp)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(temp);
        fadeTransition.setToValue(1);

        fadeTransition.play();

    }

    @FXML
    private void setEmpEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbemp)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(temp);
        fadeTransition.setToValue(0);

        fadeTransition.play();

    }

    @FXML
    private void setProEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbproduct)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tpro);
        fadeTransition.setToValue(1);

        fadeTransition.play();

    }

    @FXML
    private void setProEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbproduct)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tpro);
        fadeTransition.setToValue(0);

        fadeTransition.play();
    }

    @FXML
    private void setInvEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbinvoice)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tinvo);
        fadeTransition.setToValue(1);

        fadeTransition.play();

    }

    @FXML
    private void setInvEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbinvoice)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tinvo);
        fadeTransition.setToValue(0);

        fadeTransition.play();

    }

    @FXML
    private void setPayEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbpayroll)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tpay);
        fadeTransition.setToValue(1);

        fadeTransition.play();
    }

    @FXML
    private void setPayEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbpayroll)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tpay);
        fadeTransition.setToValue(0);

        fadeTransition.play();
    }

    @FXML
    private void setAttendEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbattend)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tatt);
        fadeTransition.setToValue(1);

        fadeTransition.play();
    }

    @FXML
    private void setAttendEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbattend)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tatt);
        fadeTransition.setToValue(0);

        fadeTransition.play();
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

    @FXML
    private void setEmp(MouseEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Employee.fxml"));
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

        } catch (IOException ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void setPro(MouseEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Product.fxml"));
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

        } catch (IOException ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void setMini(MouseEvent event) {

        sportfx.st.setIconified(true);

    }

    @FXML
    private void setInv(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Invoice.fxml"));
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

        } catch (IOException ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void setGrnEx(MouseEvent event) {

        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbgrn)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tgrn);
        fadeTransition.setToValue(1);

        fadeTransition.play();

    }

    @FXML
    private void setGrnEn(MouseEvent event) {

        scaleTransition = ScaleTransitionBuilder.create()
                .node(lbgrn)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(tgrn);
        fadeTransition.setToValue(0);

        fadeTransition.play();
    }

    @FXML
    private void setGrn(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("GRN.fxml"));
            AnchorPane ap = loader.load();
            ap1.setTopAnchor(ap, 0.0);
            ap1.setBottomAnchor(ap, 0.0);
            ap1.setLeftAnchor(ap, 0.0);
            ap1.setRightAnchor(ap, 0.0);
            ap1.getChildren().clear();
            ap1.getChildren().add(ap);

            scaleTransition = ScaleTransitionBuilder.create()
                    .node(ap)
                    .duration(Duration.millis(500))
                    .fromX(0)
                    .fromY(0)
                    .toX(1)
                    .toY(1)
                    .build();

            scaleTransition.play();

        } catch (IOException ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void setAttend(MouseEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Attendence.fxml"));
            AnchorPane ap = loader.load();
            ap1.setTopAnchor(ap, 0.0);
            ap1.setBottomAnchor(ap, 0.0);
            ap1.setLeftAnchor(ap, 0.0);
            ap1.setRightAnchor(ap, 0.0);
            ap1.getChildren().clear();
            ap1.getChildren().add(ap);

            scaleTransition = ScaleTransitionBuilder.create()
                    .node(ap)
                    .duration(Duration.millis(500))
                    .fromX(0)
                    .fromY(0)
                    .toX(1)
                    .toY(1)
                    .build();

            scaleTransition.play();

        } catch (IOException ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void setPay(MouseEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Payroll.fxml"));
            AnchorPane ap = loader.load();
            ap1.setTopAnchor(ap, 0.0);
            ap1.setBottomAnchor(ap, 0.0);
            ap1.setLeftAnchor(ap, 0.0);
            ap1.setRightAnchor(ap, 0.0);
            ap1.getChildren().clear();
            ap1.getChildren().add(ap);

            scaleTransition = ScaleTransitionBuilder.create()
                    .node(ap)
                    .duration(Duration.millis(500))
                    .fromX(0)
                    .fromY(0)
                    .toX(1)
                    .toY(1)
                    .build();

            scaleTransition.play();

        } catch (IOException ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void setSetting(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Settings.fxml"));
            AnchorPane ap = loader.load();
            ap1.setTopAnchor(ap, 0.0);
            ap1.setBottomAnchor(ap, 0.0);
            ap1.setLeftAnchor(ap, 0.0);
            ap1.setRightAnchor(ap, 0.0);
            ap1.getChildren().clear();
            ap1.getChildren().add(ap);

            scaleTransition = ScaleTransitionBuilder.create()
                    .node(ap)
                    .duration(Duration.millis(500))
                    .fromX(0)
                    .fromY(0)
                    .toX(1)
                    .toY(1)
                    .build();

            scaleTransition.play();

        } catch (IOException ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
