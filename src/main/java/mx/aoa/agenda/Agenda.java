/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.aoa.agenda;

/**
 *
 * @author orope
 */
public class Agenda {
    private EntradaAgenda[] entradas;
    private int numEntradas;

    public Agenda(int capacidad) {
        entradas = new EntradaAgenda[capacidad];
        numEntradas = 0;
    }

    public void agregarEntrada(String nombre, String telefono, String direccion) {
        EntradaAgenda entrada = new EntradaAgenda(nombre, telefono, direccion);
        entradas[numEntradas] = entrada;
        numEntradas++;
    }

    public void eliminarEntrada(int indice) {
        for (int i = indice; i < numEntradas - 1; i++) {
            entradas[i] = entradas[i + 1];
        }
        entradas[numEntradas - 1] = null;
        numEntradas--;
    }

    public void mostrarTodasLasEntradas() {
        for (int i = 0; i < numEntradas; i++) {
            System.out.println(entradas[i]);
        }
    }
}
