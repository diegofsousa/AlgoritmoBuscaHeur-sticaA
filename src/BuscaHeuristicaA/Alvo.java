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
public class Alvo {
    private Vertice alvo;

    public Alvo(Vertice alvo) {
        this.alvo = alvo;
    }

    public Vertice getAlvo() {
        return alvo;
    }

    public void setAlvo(Vertice alvo) {
        this.alvo = alvo;
    }
   
    public double melhor_caminho(Vertice inicio, ArrayList<Aresta> arestas){
        double menor = inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(0), arestas);
        System.out.println("Variavel menor instanciada com: "+menor);
        Vertice aux = null;
        for(int i=0; i<inicio.vizinhos(arestas).size(); i++){
            System.out.println("Testando: "+inicio.vizinhos(arestas).get(i).getCidade());
            System.out.println(inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(1), arestas) + " é menor que "+ menor + "?");
            if(inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(i), arestas) < menor){
                menor = inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(i), arestas);
                aux = inicio.vizinhos(arestas).get(i);
                System.out.println("Nova rota é: "+aux.getCidade());
            }
        }
        if(aux == null){
            return 0;
        }
        return menor + melhor_caminho(aux, arestas);
    }
    
}
