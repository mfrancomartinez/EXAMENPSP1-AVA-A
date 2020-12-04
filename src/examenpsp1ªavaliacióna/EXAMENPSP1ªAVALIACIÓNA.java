/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpsp1ªavaliacióna;

import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class EXAMENPSP1ªAVALIACIÓNA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
    System.out.println("Escriba una frase: ");
    Scanner sc = new Scanner(System.in);
    String frase = sc.nextLine();
    Hilo h1 = new Hilo(frase);
    Hilo2 h2 = new Hilo2(frase);
    Hilo3 h3 = new Hilo3(frase);
    Hilo4 h4 = new Hilo4(frase);
    Hilo5 h5 = new Hilo5(h2.contadorletras, h3.numeroPalabras);
    Hilo6 h6 = new Hilo6(h1.tercerapalabra, h4.penultimaPalabra);
    h1.run();
    h2.run();
    h3.run();
    h4.run();
    h5.run();
    h6.run();
    h5.join();
    h6.join();
    
            
    }
    
}
