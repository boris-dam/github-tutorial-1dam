package es.dam.collaborations;

import java.util.Scanner;

public class SilviaDiezizquierdo {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        String palabra = in.nextLine();
        
        if (palabra.equals("hola programa")) {
            System.out.println("Hola programador");
        }else{
            System.out.println("Adiós");
        }
        
    }

}