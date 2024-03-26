package com.programandoenjava.parte3.clases;

import java.util.Collection;
import java.util.HashSet;

public class Biblioteca {
    // --------------------atributos -----------------
    private Collection<Libro> listaLibros;

    // ---------------------constructor--------------------
    public Biblioteca() {
        this.listaLibros = new HashSet<>();
    }

    // -------------------- metodo de acceso ---------------
    public Collection<Libro> getListaLibros() {
        return listaLibros;
    }
    /*
     * metodo 
     * @param 
     */
    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public Libro buscarLibroId(int id) {
        return listaLibros.stream()
                .filter(libro -> libro.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
