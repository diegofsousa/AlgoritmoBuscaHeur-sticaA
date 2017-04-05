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
   ///////////////falta fazer
    public double melhor_caminho(Vertice inicio, double tam_caminho, ArrayList<Aresta> arestas){
        double calculo_atual = tam_caminho + inicio.getDistanceParaOAlvo();
        System.out.println("Variavel menor instanciada com: "+calculo_atual);
        Vertice aux = null;
        double menor = tam_caminho + inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(1), arestas);
        aux = inicio.vizinhos(arestas).get(1);
        double aux_tam_caminho = 0;
        for(int i=0; i<inicio.vizinhos(arestas).size(); i++){
            System.out.println("Testando: "+inicio.vizinhos(arestas).get(i).getCidade());
            System.out.println("Distancia de "+ inicio.getCidade()+" para "+ inicio.vizinhos(arestas).get(i).getCidade() + ": "+inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(i), arestas));
            System.out.println(inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(i), arestas) + tam_caminho + " é menor que "+ menor + "?");
            
            
            if(inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(i), arestas) +inicio.getDistanceParaOAlvo()+ tam_caminho <= menor){
                menor = inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(i), arestas) + tam_caminho;
                aux = inicio.vizinhos(arestas).get(i);
                System.out.println("Nova rota é: "+aux.getCidade());
            }
        }
        if(inicio.getDistanceParaOAlvo() > 0){
            System.out.println("Continua ...");
            melhor_caminho(aux, menor, arestas);
        }
        return tam_caminho;
    }
    
}
