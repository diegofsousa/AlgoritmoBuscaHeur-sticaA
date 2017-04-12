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
    JButton botaoNovoVertice, botaoLimparVertices, botaoLimparArestas, botaoPesquisar;
    JPanel listaDeVertices, listaDeArestas, listaDeResultado;
    JList lista, listaAresta, listaResultado;
    DefaultListModel modelo, modeloAresta, modeloResultado;
    String stringAlvo;
    Alvo alvo;
    ArrayList<Vertice> vertices = new ArrayList<>();
    ArrayList<Aresta> arestas = new ArrayList<>();
    JComboBox listaVesticesHome, listaVesticesAway, listaVerticePartida;
    DefaultComboBoxModel listaVHome = new DefaultComboBoxModel();
    DefaultComboBoxModel listaVAway = new DefaultComboBoxModel();
    DefaultComboBoxModel listaVPartida = new DefaultComboBoxModel();
    
    public GUI(String stringAlvo) {
        this.stringAlvo = stringAlvo;
        
        alvo =  new Alvo(new Vertice(stringAlvo, 0));
        vertices.add(alvo.getAlvo());
        //atualizaComboBox();
        
        JTabbedPane tabs = new JTabbedPane();
        JPanel painelVertices = new JPanel();
        JPanel painelArestas = new JPanel();
        JPanel painelBusca = new JPanel();
        
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
        lista.setSize(700, 195);
        lista.setLocation(50, 65);
        
        
        JScrollPane scrollPane = new JScrollPane();

        //modelo.add(0, "diego fernando");
        scrollPane.getViewport().add(lista);
        
        listaDeVertices = new JPanel();
        listaDeVertices.setLayout(new GridLayout(0, 2));
        listaDeVertices.setSize(1500,200);
        listaDeVertices.setLocation(30, 105);
        listaDeVertices.add(scrollPane);
        
        botaoLimparVertices = new JButton("Limpar vertices");
        botaoLimparVertices.setSize(160, 25);
        botaoLimparVertices.setLocation(300, 307);
        
        painelVertices.add(labelNovoVertice);
        painelVertices.add(labelNovoVerticeNome);
        painelVertices.add(campoNovoVertice);
        painelVertices.add(labelNovoVerticeDistancia);
        painelVertices.add(campoNovoVerticeDistancia);
        painelVertices.add(botaoNovoVertice);
        painelVertices.add(listaDeVertices);
        painelVertices.add(botaoLimparVertices);
        painelVertices.setLayout(null);
        
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
        
        
        JLabel labelNovoArestaAway = new JLabel("Chegada:");
        labelNovoArestaAway.setSize(100, 25);
        labelNovoArestaAway.setLocation(220, 50);
        
        listaVesticesAway = new JComboBox();
        listaVesticesAway.setSize(100, 25);
        listaVesticesAway.setLocation(300, 50);

        
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
        
        botaoLimparArestas = new JButton("Limpar arestas");
        botaoLimparArestas.setSize(160, 25);
        botaoLimparArestas.setLocation(300, 307);
        
        painelArestas.add(labelNovaAresta);
        painelArestas.add(labelNovoArestaHome);
        painelArestas.add(botaoNovaAresta);
        painelArestas.add(labelNovoArestaAway);
        painelArestas.add(listaDeArestas);
        painelArestas.add(listaVesticesHome);
        painelArestas.add(listaVesticesAway);
        painelArestas.add(labelNovaArestaDist);
        painelArestas.add(campoNovaArestaDist);
        painelArestas.add(botaoLimparArestas);
        painelArestas.setLayout(null);
           
        /* Elementos visuais de painelBusca */
        JLabel labelBusca = new JLabel("De onde você quer partir para chegar a "+stringAlvo+":");
        labelBusca.setSize(370, 25);
        labelBusca.setLocation(20, 20);
        
        listaVerticePartida = new JComboBox();
        listaVerticePartida.setSize(180, 25);
        listaVerticePartida.setLocation(350, 20);
        
        botaoPesquisar = new JButton("Vá pelo caminho ótimo!");
        botaoPesquisar.setSize(190, 25);
        botaoPesquisar.setLocation(540, 20);
        
        modeloResultado = new DefaultListModel();
        listaResultado = new JList(modeloResultado);
        listaResultado.setSize(700, 200);
        listaResultado.setLocation(50, 65);
        
        
        JScrollPane scrollPaneResultado = new JScrollPane();

        //modelo.add(0, "diego fernando");
        
        
        
        scrollPaneResultado.getViewport().add(listaResultado);

        listaDeResultado = new JPanel();
        listaDeResultado.setLayout(new GridLayout(0, 2));
        listaDeResultado.setSize(1500,250);
        listaDeResultado.setLocation(30, 85);
        listaDeResultado.add(scrollPaneResultado);
        
        painelBusca.add(labelBusca);
        painelBusca.add(listaVerticePartida);
        painelBusca.add(botaoPesquisar);
        painelBusca.add(listaDeResultado);
        painelBusca.setLayout(null);

        
        botaoNovoVertice.addActionListener(this);
        botaoNovaAresta.addActionListener(this);
        botaoLimparVertices.addActionListener(this);
        botaoLimparArestas.addActionListener(this);
        
        
        tabs.addTab("Vértices", painelVertices);
        tabs.addTab("Arestas", painelArestas);
        tabs.addTab("Buscar melhor caminho A*", painelBusca);
        
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
                 atualizaComboBox();
             } 
         }else if(e.getActionCommand().equals("Adicionar aresta")){
             try {
                 if(!campoNovaArestaDist.getText().equals("")){
                     try {
                         if(listaVesticesHome.getSelectedIndex() == listaVesticesAway.getSelectedIndex()){
                             JOptionPane.showMessageDialog(null, "Não se pode haver arestas para si mesmo");
                         }else if(vertices.get(listaVesticesHome.getSelectedIndex()).verifica_vizinhanca(vertices.get(listaVesticesAway.getSelectedIndex()) ,arestas)){
                             JOptionPane.showMessageDialog(null, "Já existe esta aresta");
                         }else{
                             Double distancia = Double.parseDouble(campoNovaArestaDist.getText());
                            System.out.println("Adicionando aresta");
                            //Vertice sel = (Vertice) listaVesticesHome.getSelectedItem();
                            System.out.println(vertices.get(listaVesticesHome.getSelectedIndex()).getCidade());
                            System.out.println(vertices.get(listaVesticesAway.getSelectedIndex()).getCidade());
                            arestas.add(new Aresta(vertices.get(listaVesticesHome.getSelectedIndex()), vertices.get(listaVesticesAway.getSelectedIndex()), distancia));
                            modeloAresta.add(0, vertices.get(listaVesticesHome.getSelectedIndex()).getCidade() + " até "+ vertices.get(listaVesticesAway.getSelectedIndex()).getCidade() + " - Distância: " + distancia);
                         }                        
                     } catch (Exception i) {
                         System.out.println(i);
                         JOptionPane.showMessageDialog(null, "Insira informações válidas");
                     }
                 }
                
             } catch (ArrayIndexOutOfBoundsException a) {
                 JOptionPane.showMessageDialog(null, "Insira informações válidas");
             }
             
         }else if(e.getActionCommand().equals("Limpar vertices")){
             arestas.clear();
             vertices.clear();
             listaVAway.removeAllElements();
             listaVHome.removeAllElements();
             modelo.removeAllElements();
             modeloAresta.removeAllElements();
         }else if(e.getActionCommand().equals("Limpar arestas")){
             arestas.clear();
             modeloAresta.removeAllElements();
         }
    }
    
    public void atualizaComboBox(){
        
        listaVAway.removeAllElements();
        listaVHome.removeAllElements();
        listaVPartida.removeAllElements();
        for (int i = 0; i < vertices.size(); i++) {
            listaVHome.insertElementAt(vertices.get(i).getCidade(), i);
            listaVAway.insertElementAt(vertices.get(i).getCidade(), i);
            listaVPartida.insertElementAt(vertices.get(i).getCidade(), i);
        }
        listaVerticePartida.setModel(listaVPartida);
        listaVesticesHome.setModel(listaVHome);
        listaVesticesAway.setModel(listaVAway);
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
