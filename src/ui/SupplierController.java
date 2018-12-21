/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SupplierController implements Initializable {

    @FXML
    private ToggleGroup a1;
    @FXML
    private TableView<SupplierTb> table1;
    @FXML
    private TableColumn<SupplierTb, String> tcsid;
    @FXML
    private TableColumn<SupplierTb, String> tcfn;
    @FXML
    private TableColumn<SupplierTb, String> tcln;
    @FXML
    private TableColumn<SupplierTb, String> tcst;
    @FXML
    private TableColumn<SupplierTb, String> tccity;
    @FXML
    private TableColumn<SupplierTb, String> tctel;
    @FXML
    private TableColumn<SupplierTb, String> tcjd;
    
    ObservableList<SupplierTb> supplier;
    @FXML
    private TextField tfsid;
    @FXML
    private TextField tffn;
    @FXML
    private TextField tfln;
    @FXML
    private TextField tfst;
    @FXML
    private TextField tfcity;
    @FXML
    private DatePicker dpjd;
    @FXML
    private TextField tftel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void setSave(ActionEvent event) {
        
       
        
        supplier= FXCollections.observableArrayList(
                new SupplierTb(tfsid.getText(), tffn.getText(), tfln.getText(), tfst.getText(), tfcity.getText(), tftel.getText(), dpjd.getValue().toString())
             
        );

        tcsid.setCellValueFactory(new PropertyValueFactory<>("tcsid"));
        tcfn.setCellValueFactory(new PropertyValueFactory<>("tcfn"));
        tcln.setCellValueFactory(new PropertyValueFactory<>("tcln"));
        tcst.setCellValueFactory(new PropertyValueFactory<>("tcst"));
        tccity.setCellValueFactory(new PropertyValueFactory<>("tccity"));
        tctel.setCellValueFactory(new PropertyValueFactory<>("tctel"));
        tcjd.setCellValueFactory(new PropertyValueFactory<>("tcjd"));
        table1.getItems().setAll(supplier);
        
        
    }
    
}
