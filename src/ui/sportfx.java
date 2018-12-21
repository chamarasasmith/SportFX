/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

/**
 *
 * @author User
 */
public class sportfx extends Application {

    public static Parent root;
    public static Stage st;

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            st = primaryStage;
            root = FXMLLoader.load(getClass().getResource("Login.fxml"));

//             URL reUrl=ui.sportfx.class.getResource("theme1.css");
//            String css=reUrl.toExternalForm();
                Scene scene = new Scene(root,Color.TRANSPARENT);
           // Scene scene = new Scene(root);

            //   scene.getStylesheets().add(css);
            st.initStyle(StageStyle.TRANSPARENT);
            st.setScene(scene);
            //st.setFullScreen(true);

            st.setMaximized(true);
            //  st.setResizable(true);
            st.show();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
