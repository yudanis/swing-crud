/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingcrud.controler;

import javax.swing.JDialog;
import javax.swing.JPanel;
import swingcrud.model.MyCrudModel;
import swingcrud.view.PanelTable;

/**
 *
 * @author ytr
 */
public class MyCrudControler {

    MyCrudModel model;

    public MyCrudControler() {
        model = new MyCrudModel();

    }

    public JPanel GetCrudPanel() {
        PanelTable table = new PanelTable();
        table.setData(model.GetData());
        return table;
    }

}
