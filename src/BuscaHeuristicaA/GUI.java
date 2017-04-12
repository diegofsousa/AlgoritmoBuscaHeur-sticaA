/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaHeuristicaA;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author diego
 */
public class GUI extends JFrame implements ActionListener{
    JTextField campoNovoVertice;
    JTextField campoNovoVerticeDistancia;
    JButton botaoNovoVertice;
    JPanel listaDeVertices;
    JList lista;
    DefaultListModel modelo;
    String stringAlvo;
    Alvo alvo;

    public GUI(String stringAlvo) {
        this.stringAlvo = stringAlvo;
        
        alvo =  new Alvo(new Vertice(stringAlvo, 0));
        
        JTabbedPane tabs = new JTabbedPane();
        JPanel painelVertices = new JPanel();
        JPanel painelArestas = new JPanel();
        
        /* Elementos visuais do painelVertices */
        JLabel labelNovoVertice = new JLabel("Adicione um novo vértice:");
        labelNovoVertice.setSize(200, 25);
        labelNovoVertice.setLocation(20, 20);
        
        JLabel labelNovoVerticeNome = new JLabel("Nome:");
        labelNovoVerticeNome.setSize(100, 25);
        labelNovoVerticeNome.setLocation(20, 50);
        
        campoNovoVertice = new JTextField();
        campoNovoVertice.setSize(200, 25);
        campoNovoVertice.setLocation(80, 50);
        
        JLabel labelNovoVerticeDistancia = new JLabel("Dist. para "+ stringAlvo +":");
        labelNovoVerticeDistancia.setSize(180, 25);
        labelNovoVerticeDistancia.setLocation(300, 50);
        
        campoNovoVerticeDistancia = new JTextField();
        campoNovoVerticeDistancia.setSize(80, 25);
        campoNovoVerticeDistancia.setLocation(440, 50);
        
        botaoNovoVertice = new JButton("Adicionar vértice");
        botaoNovoVertice.setSize(160, 25);
        botaoNovoVertice.setLocation(550, 50);
        
        /*Elementos visuais da lista de vertices*/
        
        modelo = new DefaultListModel();
        lista = new JList(modelo);
        lista.setSize(700, 200);
        lista.setLocation(50, 65);
        
        
        JScrollPane scrollPane = new JScrollPane();

        //modelo.add(0, "diego fernando");
        
        scrollPane.getViewport().add(lista);

        listaDeVertices = new JPanel();
        listaDeVertices.setLayout(new GridLayout(0, 2));
        listaDeVertices.setSize(1500,200);
        listaDeVertices.setLocation(30, 105);
        listaDeVertices.add(scrollPane);
        
        
        painelVertices.add(labelNovoVertice);
        painelVertices.add(labelNovoVerticeNome);
        painelVertices.add(campoNovoVertice);
        painelVertices.add(labelNovoVerticeDistancia);
        painelVertices.add(campoNovoVerticeDistancia);
        painelVertices.add(botaoNovoVertice);
        painelVertices.add(listaDeVertices);
        painelVertices.setLayout(null);
        
        botaoNovoVertice.addActionListener(this);
        
        
        tabs.addTab("Vértices", painelVertices);
        tabs.addTab("Arestas", painelArestas);
        
        add(tabs);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        setTitle("Busca heurística A*");
        setSize(800,400);
        setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new GUI(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getActionCommand().equals("Adicionar vértice")){
             System.out.println("Adicionando vértice");
             if(validarCamposVertices(campoNovoVertice.getText(), campoNovoVerticeDistancia.getText())){
                 modelo.add(0, "Vértice: "+ campoNovoVertice.getText() + " - Distância para o alvo: " + campoNovoVerticeDistancia.getText());
             }
             
         }
    }
    
    public boolean validarCamposVertices(String nome, String dist){
        if(!nome.equals("") && !dist.equals("")){
            try {
                Double.parseDouble(dist);
                return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "A distância deve ser inteira ou decimal");
            }
        }
        return false;
    }
    
}
