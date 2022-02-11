/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio4;

import java.util.Scanner;

/**
 *
 * @author jcgof
 */
public class Main {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Crear una Familia");
            System.out.println("2. Crear un Aldeano");
            System.out.println("3. Listar Familias");
            System.out.println("4. Pelea");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("H");
                    break;
                case 2:
                    System.out.println("4");
                    break;
                case 3:
                    System.out.println("4r");
                    break;
                case 4:
                    System.out.println("e");
                    break;

            }
        } while (opcion != 5);
        System.out.println("Hasta luego B)");
    }
}
