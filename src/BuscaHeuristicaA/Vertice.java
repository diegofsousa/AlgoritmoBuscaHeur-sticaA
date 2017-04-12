/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaHeuristicaA;

import java.util.ArrayList;

/**
 *
 * @author diegof
 */
public class Vertice {
    private String cidade;
    private double distanceParaOAlvo;

    public Vertice(String cidade, double distanceParaOAlvo) {
        this.cidade = cidade;
        this.distanceParaOAlvo = distanceParaOAlvo;
    }

    public double getDistanceParaOAlvo() {
        return distanceParaOAlvo;
    }

    public void setDistanceParaOAlvo(double distanceParaOAlvo) {
        this.distanceParaOAlvo = distanceParaOAlvo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public ArrayList<Vertice> vizinhos(ArrayList<Aresta> arestas) {
        ArrayList<Vertice> v = new ArrayList<Vertice>();
        for(int i = 0; i < arestas.size(); i++){
            if(arestas.get(i).getVertice1().equals(this)){
                v.add(arestas.get(i).getVertice2());
            }else if(arestas.get(i).getVertice2().equals(this)){
                v.add(arestas.get(i).getVertice1());
            }
        }
        return v;
    }
    
    public boolean verifica_vizinhanca(Vertice vizinho, ArrayList<Aresta> arestas) {
        for(int i = 0; i < arestas.size(); i++){
            if((arestas.get(i).getVertice1().equals(this) && arestas.get(i).getVertice2().equals(vizinho)) || (arestas.get(i).getVertice2().equals(this) && arestas.get(i).getVertice1().equals(vizinho))){
                return true;
            }
        }
        return false;
    }
    
    public double getDistanciaParaVizinho(Vertice vizinho, ArrayList<Aresta> arestas){
        //ArrayList<Vertice> v = new ArrayList<>();
        //System.out.println(arestas.size());
        for(int i = 0; i < arestas.size(); i++){
            if((arestas.get(i).getVertice1().equals(this) && arestas.get(i).getVertice2().equals(vizinho)) || (arestas.get(i).getVertice2().equals(this) && arestas.get(i).getVertice1().equals(vizinho))){
                return arestas.get(i).getDistancia();
            }
        }
        return 0;
    }
}
