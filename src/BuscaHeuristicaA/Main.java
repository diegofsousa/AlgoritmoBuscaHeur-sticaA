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
        /*
        Alvo bucharest =  new Alvo(new Vertice("Bucharest", 0));
        Vertice arad = new Vertice("Arad", 366);
        Vertice craiova = new Vertice("Craiova", 160);
        Vertice drobeta = new Vertice("Drobeta", 242);
        Vertice eforie = new Vertice("Eforie", 161);
        Vertice fagaras = new Vertice("Fagaras", 176);
        Vertice giurgiu = new Vertice("Giurgiu", 77);
        Vertice hirsovia = new Vertice("Hisóvia", 151);
        Vertice iasi = new Vertice("Iasi", 226);
        Vertice lugoj = new Vertice("Lugoj", 244);
        Vertice mehadia = new Vertice("Mahadia", 241);
        Vertice neamt = new Vertice("Neamt", 234);
        Vertice oradea = new Vertice("Oradea", 380);
        Vertice pitesti = new Vertice("Pitesti", 100);
        Vertice riminicu = new Vertice("Riminicu", 193);
        Vertice sibiu = new Vertice("Sibiu", 253);
        Vertice timisoara = new Vertice("Tiisoara", 329);
        Vertice ursiceni = new Vertice("Ursiceni", 80);
        Vertice vaslui = new Vertice("Vaslui", 199);
        Vertice zerind = new Vertice("Zerind", 374);
        
        Aresta a1 = new Aresta(oradea, zerind, 71);
        Aresta a2 = new Aresta(zerind, arad, 75);
        Aresta a3 = new Aresta(arad, timisoara, 118);
        Aresta a4 = new Aresta(timisoara, lugoj, 111);
        Aresta a5 = new Aresta(lugoj, mehadia, 70);
        Aresta a6 = new Aresta(mehadia, drobeta, 75);
        Aresta a7 = new Aresta(drobeta, craiova, 120);
        Aresta a8 = new Aresta(craiova, riminicu, 146);
        Aresta a9 = new Aresta(riminicu, sibiu, 80);
        Aresta a10 = new Aresta(arad, sibiu, 140);
        Aresta a11 = new Aresta(oradea, sibiu, 151);
        Aresta a12 = new Aresta(sibiu, fagaras, 99);
        Aresta a13 = new Aresta(riminicu, pitesti, 97);
        Aresta a14 = new Aresta(craiova, pitesti, 138);
        Aresta a15 = new Aresta(pitesti, bucharest.getAlvo(), 101);
        Aresta a16 = new Aresta(fagaras, bucharest.getAlvo(), 211);
        Aresta a17 = new Aresta(bucharest.getAlvo(), giurgiu, 90);
        Aresta a18 = new Aresta(bucharest.getAlvo(), ursiceni, 86);
        Aresta a19 = new Aresta(ursiceni, hirsovia, 98);
        Aresta a20= new Aresta(hirsovia, eforie, 86);
        Aresta a21 = new Aresta(hirsovia, vaslui, 142);
        Aresta a22 = new Aresta(vaslui, iasi, 92);
        Aresta a23 = new Aresta(iasi, neamt, 87);
        
        ArrayList<Aresta> arestas = new ArrayList<>();
        arestas.add(a1);
        arestas.add(a2);
        arestas.add(a3);
        arestas.add(a4);
        arestas.add(a5);
        arestas.add(a6);
        arestas.add(a7);
        arestas.add(a8);
        arestas.add(a9);
        arestas.add(a10);
        arestas.add(a11);
        arestas.add(a12);
        arestas.add(a13);
        arestas.add(a14);
        arestas.add(a15);
        arestas.add(a16);
        arestas.add(a17);
        arestas.add(a18);
        arestas.add(a19);
        arestas.add(a20);
        arestas.add(a21);
        arestas.add(a22);
        arestas.add(a23);
        
        ArrayList<CaminhoResultante> resultado = new ArrayList<>();
        
        System.out.println("\nLOGS: \n\n");
        resultado = bucharest.melhor_caminho(arad, 0, arestas, resultado);
        
        System.out.println("\n\nResultado:");
        System.out.println(resultado.size());
        for(int i=0;i<resultado.size(); i++){
            System.out.println("Visitou: "+ resultado.get(i).getEstagio_atual().getCidade() +" e a distancia gradual foi: "+ resultado.get(i).getSomatorio_caminho());
        }
        */
        
        
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
         
        for(int i=0; i<picos.vizinhos(arestas).size(); i++){
            System.out.println(picos.vizinhos(arestas).get(i).getCidade());
            //System.out.println(picos.vizinhos(arestas).get(i).getCidade());
        }
       
        System.out.println(picos.getDistanciaParaVizinho(oeiras, arestas));
        //System.out.println(arestas.get(1).getVertice1().getCidade());
        //System.out.println(a1.getDistancia());
        
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
