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
public class CaminhoResultante {
    private Vertice estagio_atual;
    private Double somatorio_caminho;

    public CaminhoResultante(Vertice estagio_atual, Double somatorio_caminho) {
        this.estagio_atual = estagio_atual;
        this.somatorio_caminho = somatorio_caminho;
    }

    public Double getSomatorio_caminho() {
        return somatorio_caminho;
    }

    public void setSomatorio_caminho(Double somatorio_caminho) {
        this.somatorio_caminho = somatorio_caminho;
    }

    public Vertice getEstagio_atual() {
        return estagio_atual;
    }

    public void setEstagio_atual(Vertice estagio_atual) {
        this.estagio_atual = estagio_atual;
    }
    
    
    
}
