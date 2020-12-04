/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpsp1ªavaliacióna;

/**
 *
 * @author Marcos
 */
public class Hilo3 extends Thread{
    public String frase;
    public int numeroPalabras;

    public Hilo3(String frase) {
        this.frase = frase;
    }
    
    
    
    @Override
    public void run(){
        String [] sp1 = frase.split(" ");
        numeroPalabras = sp1.length;
        System.out.println("Número de palabras: "+numeroPalabras);
    }
}
