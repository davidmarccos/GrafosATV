/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidgrafosatv2;

import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author david
 */
public class Grafo {
    
    LinkedList<Vertice> verticeList = new LinkedList<>();
    
    Grafo(LinkedList<Vertice> vet) {
        this.verticeList = vet;
    }

    void insereVet(int vEsquerda, int vDireita) {
        
        Vertice vE = verticeList.get(vEsquerda);
        Vertice vD = verticeList.get(vDireita);
        
        //criando aresta entre os vertices
        vE.vizinho.add(vD);
        vD.vizinho.add(vE);
        
        //adicionando graus
        vE.grauEntrada++;
        vE.grauSaida++;
        vD.grauEntrada++;
        vD.grauSaida++;
    }

    
    //ordem = numero de vertices
    void ordem() 
    {
        System.out.printf("A ordem do Grafo é: %d", verticeList.size()-2);
    }
    
    //tamanho = vertices
    void tamanho() 
    {
        int tamanho=0;
        for (Vertice i : verticeList) {
            tamanho+=i.vizinho.size();
        }
        System.out.printf("\n\nTamanho do Grafo é: %s", tamanho*2);
    }
    
    //Grau de entrada para cada vértice
    void grauEntradaVertice()
    {
        System.out.printf("\nO grau de entrada para cada vértice é :\n");
        for (Vertice i : verticeList) {
            System.out.printf("Vercite %s: %s\n", i.valor, i.grauEntrada);
        }
        
    }
    
    //número de vértices isolados;
    void qtdVerticesIsolados() 
    {
        int qtd=0;
        for (Vertice i : verticeList) {
            if(i.vizinho.isEmpty())
                qtd++;
        }
        System.out.printf("Número de vértices isolados é: %d", qtd);
    }
}
