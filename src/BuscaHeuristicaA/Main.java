/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaHeuristicaA;

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
        
        System.out.println(a1.getDistancia());
        
        
    }
    
}
