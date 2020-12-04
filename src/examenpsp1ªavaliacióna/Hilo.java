/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpsp1ªavaliacióna;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Hilo extends Thread{
    
    public String tercerapalabra;
    public String frase;
    
    
    public Hilo(String frase){
        this.frase = frase;
    }
    
    

    public Hilo(String tercerapalabra, String frase) {
        this.tercerapalabra = tercerapalabra;
        this.frase = frase;
     }

    

    
    @Override
    public void run(){
        
        String [] sp = frase.split(" ");
        tercerapalabra = sp[2];
        System.out.println(tercerapalabra);       
  
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
           
    }
        
    }

           