/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Categoria;
import Model.Talla;
import Model.TallaM;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class TallaController {

    private DefaultComboBoxModel modelCombox = new DefaultComboBoxModel();
    private TallaM tallaModel;

    public void llenarTallas(JComboBox combo) {

        List<Talla> listTalla = new ArrayList<>();
        tallaModel= new TallaM();
        listTalla = tallaModel.listaTallas();

        combo.setModel(modelCombox);
        try {

            for (Talla t : listTalla) {

                modelCombox.addElement(t);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);

        }

    }

}
