/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

/**
 *
 * @author User
 */
public class SupplierTb {

    final private StringProperty tcsid;

    final private StringProperty tcfn;

    final private StringProperty tcln;

    final private StringProperty tcst;

    final private StringProperty tccity;

    final private StringProperty tctel;

    final private StringProperty tcjd;

    public SupplierTb(String tcsid, String tcfn, String tcln, String tcst, String tccity, String tctel, String tcjd) {
        this.tcsid = new SimpleStringProperty(tcsid);
        this.tcfn = new SimpleStringProperty(tcfn);
        this.tcln = new SimpleStringProperty(tcln);
        this.tcst = new SimpleStringProperty(tcst);
        this.tccity = new SimpleStringProperty(tccity);
        this.tctel = new SimpleStringProperty(tctel);
        this.tcjd = new SimpleStringProperty(tcjd);
    }

    public String getTcsid() {
        return tcsid.get();
    }

    public String getTcfn() {
        return tcfn.get();
    }

    public String getTcln() {
        return tcln.get();
    }

    public String getTcst() {
        return tcst.get();
    }

    public String getTccity() {
        return tccity.get();
    }

    public String getTctel() {
        return tctel.get();
    }

    public String getTcjd() {
        return tcjd.get();
    }

    
    
}
