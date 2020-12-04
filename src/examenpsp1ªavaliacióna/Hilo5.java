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
public class Hilo5 extends Thread{
    public int numeroCaracteres;
    public int numeroPalabras;


public Hilo5 (int numeroCaracteres, int numeroPalabras){
this.numeroCaracteres = numeroCaracteres;
this.numeroPalabras = numeroPalabras;
}
public void run(){
    System.out.println("Número de palabras: "+numeroPalabras+" Número de letras: "+numeroCaracteres);
}




}

