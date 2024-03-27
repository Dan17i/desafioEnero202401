package com.programandoenjava.parte3.clases;

import java.util.HashSet;
import java.util.Set;

public class Persona {

    // ---------atributos----------------
    private String nombre;
    private int edad;
    private int id;
    private Set<Libro> librosPrestados;

    // -----------constructores-------------
    public Persona() {

    }

    public Persona (String nombre, int edad, int id){
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.librosPrestados = new HashSet<Libro>();
    }
    public Persona(String nombre, int edad, int id, Set<Libro> librosPrestados) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.librosPrestados = new HashSet<Libro>();
    }

    // ---------------metodos de acceso---------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(Set<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    // ---------------metodos-----------------------
    /**
     * Agrega un libro a la lista de libros prestados.
     * 
     * @param libro El libro que se va a agregar a la lista de libros prestados.
     */
    public void AgregarLibrosPrestados(Libro libro) {
        librosPrestados.add(libro);
    }

    /**
     * Elimina un libro de la lista de libros prestados al devolverlo.
     * 
     * @param libro El libro que se va a devolver.
     */
    public void devolverLibroPrestado(Libro libro) {
        librosPrestados.remove(libro);
    }

    /**
     * Presta un libro a la persona si no está en la lista de libros prestados.
     * 
     * @param libro El libro que se va a prestar.
     * @return Un mensaje indicando si la operación fue exitosa o no.
     */
    public String prestarLibro(Libro libro) {

        if (libro != null && !librosPrestados.contains(libro)) {
            AgregarLibrosPrestados(libro);
            return nombre + " ha tomado prestado el libro '" + libro.getTitulo() + "'.";
        }
        return "El libro no está disponible para ser prestado.";

    }

    /**
     * Devuelve un libro prestado por la persona.
     * 
     * @param libro El libro que se va a devolver.
     * @return Un mensaje indicando si la operación fue exitosa o no.
     */
    public String devolverLibro(Libro libro) {
        if (libro != null && librosPrestados.contains(libro)) {
            devolverLibro(libro);
            return nombre + " ha devuelto el libro  prestado" + libro.getTitulo() + "'.";
        }
        return "El libro no está en poseción de : " + nombre + " .";

    }

    /**
     * Devuelve una representación en cadena de la persona,
     * incluyendo su nombre, edad, ID y libros prestados.
     * 
     * @return Una representación en cadena de la persona.
     */
    @Override
    public String toString() {
        return "Los datos de la persona son :" + "\n El nombre es: " + nombre + "\n La  edad es:" + edad +
                "\n El id es :" + id + "\nLos ó el libroPrestado son :" + librosPrestados;
    }

}
