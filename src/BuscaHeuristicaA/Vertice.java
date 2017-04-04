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
}
