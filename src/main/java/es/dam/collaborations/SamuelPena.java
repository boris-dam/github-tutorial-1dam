package es.dam.collaborations;

import java.util.Scanner;

public class SamuelPena {

        public static void main(String[] args) {
            
        Scanner in = new Scanner(System.in);
        String entrada;
        byte id;
        int limite;
        StringBuilder sb;
        
        while (in.hasNext()) {
            entrada = in.nextLine();
            id = 0;
            while (id < entrada.length()) {
                limite = (entrada.charAt(id) == '1')? 3:2;
                System.out.println((char)Integer.parseInt(entrada));
                id += limite;
            }
        }
    }
}