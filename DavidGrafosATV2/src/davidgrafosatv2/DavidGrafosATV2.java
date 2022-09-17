/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidgrafosatv2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author david
 */
public class DavidGrafosATV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        //FileInputStream entrada = new FileInputStream("src/davidgrafosatv2/pequenoG.txt");
        //InputStreamReader arquivo = new InputStreamReader(entrada);
        
        LinkedList<String> arq = new LinkedList<>();
        String val;
        
        try {
            BufferedReader arquivo = new BufferedReader( new FileReader("src/davidgrafosatv2/pequenoG.txt"));
        
        while ((val = arquivo.readLine()) != null) 
        {
            arq.add(val);
        }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        
        LinkedList<Vertice> vet = new LinkedList<>();
        Grafo g = new Grafo(vet);
        
        arq.forEach(item->vet.add(new Vertice(item)));
        
        int aux = Integer.parseInt(arq.get(0));
        //arq.remove(0);
        //arq.remove(1);
        for (int i = 2; i < aux; i++) {
            String[] v = arq.get(i).split(" ");
            g.insereVet(
                Integer.parseInt(v[0]),
                Integer.parseInt(v[1])
            );
        }
        int tam = Integer.parseInt(arq.get(0))+ Integer.parseInt(arq.get(1));
        g.ordem();
        System.out.printf("\n\nTamanho do Grafo é: %d", tam);
        g.grauEntradaVertice();
        g.qtdVerticesIsolados();
        
        
        
        
        
    }
    
}
