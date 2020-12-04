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
public class Hilo6 extends Thread{
    public String terceraPalabra;
    public String penultimaPalabra;
    
    public Hilo6 (String terceraPalabra, String penultimaPalabra){
        this.terceraPalabra = terceraPalabra;
        this.penultimaPalabra = penultimaPalabra;
    }
    
    public void run(){
        System.out.println("La tercera palabra es: "+terceraPalabra+ " y la penultimaPalabra es: "+penultimaPalabra);
    }
}
