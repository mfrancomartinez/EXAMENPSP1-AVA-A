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
public class Hilo2 extends Thread{
    public String frase;
    public int contadorletras = 0;

    public Hilo2(String frase) {
        this.frase = frase;
    }
    
    
    
    
    public synchronized void añadir(){
        contadorletras++;
        notifyAll();
    }   
    
    
   
    
    @Override
    public void run(){
        for (int i = 0; i<frase.length();i++){
            añadir();
        }
        System.out.println("Número de letras: "+contadorletras);
        
        try{
            sleep(1000);
        }catch(InterruptedException ex){
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
