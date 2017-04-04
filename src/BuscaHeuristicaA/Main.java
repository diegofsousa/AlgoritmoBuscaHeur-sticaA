/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaHeuristicaA;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        Alvo floriano =  new Alvo(new Vertice("Floriano", 0));
        
        Vertice oeiras = new Vertice("Oeiras", 300);        
        Vertice gaturiano = new Vertice("Gaturiano", 400);
        Vertice picos = new Vertice("Picos", 500);
        
        Aresta a1 = new Aresta(picos, oeiras, 100);
        Aresta a2 = new Aresta(picos, gaturiano, 30);
        Aresta a3 = new Aresta(oeiras, floriano.getAlvo(), 70);
        Aresta a4 = new Aresta(gaturiano, floriano.getAlvo(), 200);
        
        ArrayList<Aresta> arestas = new ArrayList<>();
        arestas.add(a1);
        arestas.add(a2);
        arestas.add(a3);
        arestas.add(a4);
        //System.out.println(picos.vizinhos(arestas));
        //Vertice a = picos.vizinhos(arestas).get(4);
        /*
        picos.getDistanciaParaVizinho(picos.vizinhos(arestas).get(4), arestas);
        for(int i=0; i<picos.vizinhos(arestas).size(); i++){
            System.out.println(picos.vizinhos(arestas).get(i));
        }
        System.out.println(picos.getDistanciaParaVizinho(oeiras, arestas));
        //System.out.println(arestas.get(1).getVertice1().getCidade());
        //System.out.println(a1.getDistancia());
        */
        double melhor = floriano.melhor_caminho(picos, arestas);
        System.out.println(melhor);
        
        
    }
    
}
