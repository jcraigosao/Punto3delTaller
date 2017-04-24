/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

/**
 *
 * @author TOSHIBA
 */
public class Main {
public static void main(String[]args){
Date fecha= new Date (1,1,2004,"miercoles","enero");
Person persona= new Person (fecha);
    System.out.println(persona);
fecha.Bisiesto();
}    
}