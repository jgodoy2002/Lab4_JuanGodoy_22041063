/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio4;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author jcgof
 */
public class Main {
    static Random random;
    static ArrayList<Familia> familia;
    static Scanner leer = new Scanner(System.in);

    public static void main(String args[]) {

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
                    crearAldeano();
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

    //Funcion para crear aldeano
    public static void crearAldeano() {
        String nombre;
        String apellido;
        int edad;
        int vida;
        System.out.println("Escriba el nombre del Aldeano");
        nombre = leer.next();
        System.out.println("Escriba el apellido del Aldeano");
        apellido = leer.next();
        if(chequeo(apellido)){
            
        }
        System.out.println("Escriba la edad del Aldeano");
        edad = leer.nextInt();
        System.out.println("Escriba la vida del Aldeano");
        vida = leer.nextInt();
        System.out.println("Eliga cual profesion quiere para el Aldeano");
        System.out.println("1. Normal");
        System.out.println("2. Pacifista");
        System.out.println("3. Herrero");
        System.out.println("4. Agronomo");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1: {
                
            }
            break;

            case 2: {
                
            }
            break;

            case 3: {
                
            }
            break;

            case 4: {
                
                
            }
            break;
        }
    }

    //Verifica si el Apellido existe
    public static Familia chequeo(String apellido){
        for (Familia familia1 : familia) {
           if(apellido.equals(familia1.getApellidoU()))
               return familia1;
        } 
        return null;
    } 
    
    //Agrega el Aldeano al apellido existente
    public static void agregar(){
        
    }
    
    public static void list(){
        System.out.println("Lista: ");
        int pos = 1;
        for(Familia f : familia) {
            System.out.println();
        }
    }
    
}
