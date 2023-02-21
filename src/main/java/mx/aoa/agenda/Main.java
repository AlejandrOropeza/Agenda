/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aoa.agenda;

import java.util.Scanner;

/**
 *
 * @author orope
 */
public class Main {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda(100);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nIngrese la opción deseada:");
            System.out.println("1. Agregar entrada");
            System.out.println("2. Eliminar entrada");
            System.out.println("3. Mostrar todas las entradas");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el teléfono: ");
                    String telefono = scanner.next();
                    System.out.println("Ingrese la dirección: ");
                    String direccion = scanner.next();
                    miAgenda.agregarEntrada(nombre, telefono, direccion);
                    break;
                case 2:
                    System.out.println("Ingrese el número de entrada que desea eliminar: ");
                    int indice = scanner.nextInt();
                    miAgenda.eliminarEntrada(indice);
                    break;
                case 3:
                    miAgenda.mostrarTodasLasEntradas();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
