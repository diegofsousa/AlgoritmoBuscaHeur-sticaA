/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaHeuristicaA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author diego
 */
public class RequisicaoDoAlvo extends JFrame implements ActionListener{
    JTextField campoNomeAlvo;

    public RequisicaoDoAlvo() {
        
        JLabel labelNomeAlvo = new JLabel("Informe o nome do alvo:");
        labelNomeAlvo.setSize(170, 25);
        labelNomeAlvo.setLocation(20, 20);
        add(labelNomeAlvo);
        
        campoNomeAlvo = new JTextField();
        campoNomeAlvo.setSize(150, 25);
        campoNomeAlvo.setLocation(200, 20);
        add(campoNomeAlvo);
        
        JButton entrar = new JButton("Entrar");
        entrar.setSize(100, 25);
        entrar.setLocation(360, 20);
        add(entrar);
        
        entrar.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Início");
        setSize(550, 80);
        setLocation(450, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("com.sun.java.swing.plaf.gtk.GTKLookAndFeel".equals(info.getClassName())) {   
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RequisicaoDoAlvo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(RequisicaoDoAlvo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(RequisicaoDoAlvo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(RequisicaoDoAlvo.class.getName()).log(Level.SEVERE, null, ex);
                }
               break;
             } 
        }
        new RequisicaoDoAlvo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!campoNomeAlvo.getText().equals("")){
            new GUI(campoNomeAlvo.getText());
            dispose();
        }
    }
    
}
