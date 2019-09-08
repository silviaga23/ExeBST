/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbusqueda;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nandi
 */
public class ArbolBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sn = new Scanner(System.in);
        boolean out = false;
        int option; //Guardaremos la opcion del usuario
        int num;
        Gestor g1 = new Gestor();
        
 
        while (!out) {

            System.out.println("1. Agregar un elemento al arbol");
            System.out.println("2. Ver post orden");
            System.out.println("3. Ver in orden");
            System.out.println("4. Ver pre orden");
            System.out.println("5. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        System.out.println("Digita el entero a agregar al arbol ");
                        num = sn.nextInt();
                        g1.agregarNodo(num);
                        break;
                    case 2:
                        System.out.println("Post Orden: ");
                        g1.postOrden();
                        break;
                    case 3:
                        System.out.println("In Orden: ");
                        g1.inOrden();
                        break;
                    case 4:
                        System.out.println("Pre Orden: ");
                        g1.preOrden();
                        break;
                    case 5:
                        out = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 10");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
    
        }
    }
}
