package View;

import Controller.CreditController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Enzo on 15-07-2017.
 */
public class FormCredit {
    public JPanel panel1;
    private JTextField tF_montoCredito;
    private JTextField tF_name;
    private JTextField tF_id;
    private JButton btn_Agregar;


    public FormCredit() {
        btn_Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreditController.addCredit(Integer.parseInt(tF_id.getText()),Integer.parseInt(tF_montoCredito.getText()));
            }
        });
    }
}
