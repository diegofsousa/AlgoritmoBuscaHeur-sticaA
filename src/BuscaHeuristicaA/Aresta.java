/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaHeuristicaA;

/**
 *
 * @author diegof
 */
public class Aresta {
    private Vertice vertice1;
    private Vertice vertice2;

    public Aresta(Vertice vertice1, Vertice vertice2, double distancia) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.distancia = distancia;
    }
    private double distancia;

    public Vertice getVertice1() {
        return vertice1;
    }

    public void setVertice1(Vertice vertice1) {
        this.vertice1 = vertice1;
    }

    public Vertice getVertice2() {
        return vertice2;
    }

    public void setVertice2(Vertice vertice2) {
        this.vertice2 = vertice2;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
