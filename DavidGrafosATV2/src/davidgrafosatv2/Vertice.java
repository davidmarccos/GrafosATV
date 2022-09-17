/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidgrafosatv2;

import java.util.LinkedList;

/**
 *
 * @author david
 */
class Vertice 
{
    //Vertice vizinho;
    String valor;
    int grauEntrada;
    int grauSaida;
    LinkedList<Vertice> vizinho = new LinkedList<>();
    
    public Vertice(String valor) {
        this.valor = valor;
    }
}
