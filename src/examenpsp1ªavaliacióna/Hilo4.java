/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpsp1ªavaliacióna;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Hilo4 extends Thread{
    public String penultimaPalabra;
    public String frase;
    
    
    public Hilo4(String frase){
        this.frase = frase;
    }
    
    @Override
    public void run(){
        
        String [] sp = frase.split(" ");
        penultimaPalabra = sp[sp.length - 2];
        System.out.println(penultimaPalabra);       
  
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
           
    }
}
