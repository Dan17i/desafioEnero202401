package com.programandoenjava.parte3.clases;

import java.util.HashSet;
import java.util.Set;

public class Persona {

    private String nombre;
    private int edad;
    private int id;
    private Set<Libro> librosPrestados;

    public Persona(String nombre, int edad, int id, Set<Libro> librosPrestados) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.librosPrestados = new HashSet<Libro>();
    }

    public void AgregarLibrosPrestados(Libro libro) {
        librosPrestados.add(libro);
    }

    public void devolverLibroPrestado(Libro libro){
        librosPrestados.remove(libro);
    }

    public String prestarLibro(Libro libro) {

        if (libro != null && !librosPrestados.contains(libro)) {
            AgregarLibrosPrestados(libro);
            return nombre + " ha tomado prestado el libro '" + libro.getTitulo() + "'.";
        }
        return "El libro no está disponible para ser prestado.";

    }

    public String devolverLibro(Libro libro) {
        if (libro != null && librosPrestados.contains(libro)) {
            devolverLibro(libro);
            return nombre + " ha devuelto el libro  prestado" + libro.getTitulo() + "'.";
        }
        return "El libro no está en poseción de : "+nombre+ " .";
        
    }

    @Override
    public String toString() {
        return "Los datos de la persona son :"+"\n El nombre es: " + nombre + "\n La  edad es:" + edad +
         "\n El id es :" + id + "\nLos ó el libroPrestado son :" + librosPrestados;
    }

    
}
