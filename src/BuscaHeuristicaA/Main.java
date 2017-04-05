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
        
        Vertice oeiras = new Vertice("Oeiras", 80);        
        Vertice gaturiano = new Vertice("Gaturiano", 270);
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
        
        //picos.getDistanciaParaVizinho(picos.vizinhos(arestas).get(4), arestas);
         /*
        for(int i=0; i<picos.vizinhos(arestas).size(); i++){
            System.out.println(picos.vizinhos(arestas).get(i).getCidade());
            //System.out.println(picos.vizinhos(arestas).get(i).getCidade());
        }
       
        System.out.println(picos.getDistanciaParaVizinho(oeiras, arestas));
        //System.out.println(arestas.get(1).getVertice1().getCidade());
        //System.out.println(a1.getDistancia());
        */
        ArrayList<CaminhoResultante> resultado = new ArrayList<>();
        
        System.out.println("\nLOGS: \n\n");
        resultado = floriano.melhor_caminho(picos, 0, arestas, resultado);
        
        
        System.out.println("\n\nResultado:");
        System.out.println(resultado.size());
        for(int i=0;i<resultado.size(); i++){
            System.out.println("Visitou: "+ resultado.get(i).getEstagio_atual().getCidade() +" e a distancia gradual foi: "+ resultado.get(i).getSomatorio_caminho());
        }
        //System.out.println(melhor);
        
        //System.out.println(picos.getDistanciaParaVizinho(oeiras, arestas));
        
        
    }
    
}
