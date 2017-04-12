/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaHeuristicaA;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author diego
 */
public class GUI extends JFrame implements ActionListener{
    JTextField campoNovoVertice;
    JTextField campoNovoVerticeDistancia, campoNovaArestaDist;
    JButton botaoNovoVertice;
    JPanel listaDeVertices, listaDeArestas;
    JList lista, listaAresta;
    DefaultListModel modelo, modeloAresta;
    String stringAlvo;
    Alvo alvo;
    ArrayList<Vertice> vertices = new ArrayList<>();
    JComboBox listaVesticesHome, listaVesticesAway;

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
        
        /* Elementos visuais de painelArestas */
        JLabel labelNovaAresta = new JLabel("Adicione uma nova aresta:");
        labelNovaAresta.setSize(200, 25);
        labelNovaAresta.setLocation(20, 20);
        
        JLabel labelNovoArestaHome = new JLabel("Partida:");
        labelNovoArestaHome.setSize(100, 25);
        labelNovoArestaHome.setLocation(20, 50);
        
        listaVesticesHome = new JComboBox();
        listaVesticesHome.setSize(100, 25);
        listaVesticesHome.setLocation(90, 50);
        
        //campoNovoVertice = new JTextField();
        //campoNovoVertice.setSize(200, 25);
        //campoNovoVertice.setLocation(80, 50);
        
        JLabel labelNovoArestaAway = new JLabel("Chegada:");
        labelNovoArestaAway.setSize(100, 25);
        labelNovoArestaAway.setLocation(220, 50);
        
        listaVesticesAway = new JComboBox();
        listaVesticesAway.setSize(100, 25);
        listaVesticesAway.setLocation(300, 50);
        
        //campoNovoVerticeDistancia = new JTextField();
        //campoNovoVerticeDistancia.setSize(80, 25);
        //campoNovoVerticeDistancia.setLocation(440, 50);
        
        JLabel labelNovaArestaDist = new JLabel("Dist.:");
        labelNovaArestaDist.setSize(100, 25);
        labelNovaArestaDist.setLocation(430, 50);
        
        campoNovaArestaDist = new JTextField();
        campoNovaArestaDist.setSize(80, 25);
        campoNovaArestaDist.setLocation(500, 50);
        
        JButton botaoNovaAresta = new JButton("Adicionar aresta");
        botaoNovaAresta.setSize(160, 25);
        botaoNovaAresta.setLocation(600, 50);
        
        modeloAresta = new DefaultListModel();
        listaAresta = new JList(modeloAresta);
        listaAresta.setSize(700, 200);
        listaAresta.setLocation(50, 65);
        
        
        JScrollPane scrollPaneAresta = new JScrollPane();

        //modelo.add(0, "diego fernando");
        
        
        
        scrollPaneAresta.getViewport().add(listaAresta);

        listaDeArestas = new JPanel();
        listaDeArestas.setLayout(new GridLayout(0, 2));
        listaDeArestas.setSize(1500,200);
        listaDeArestas.setLocation(30, 105);
        listaDeArestas.add(scrollPaneAresta);
        
        painelArestas.add(labelNovaAresta);
        painelArestas.add(labelNovoArestaHome);
        painelArestas.add(botaoNovaAresta);
        painelArestas.add(labelNovoArestaAway);
        painelArestas.add(listaDeArestas);
        painelArestas.add(listaVesticesHome);
        painelArestas.add(listaVesticesAway);
        painelArestas.add(labelNovaArestaDist);
        painelArestas.add(campoNovaArestaDist);
        painelArestas.setLayout(null);
        
        
        
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
                 vertices.add(new Vertice(campoNovoVertice.getText(), Double.parseDouble(campoNovoVerticeDistancia.getText())));
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
