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

    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro El libro que se va a agregar.
     */
    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    /**
     * Busca un libro por su identificador único.
     *
     * @param id El identificador único del libro a buscar.
     * @return El libro encontrado, o null si no se encuentra ningún libro con el
     *         identificador dado.
     */
    public Libro buscarLibroId(int id) {
        return listaLibros.stream()
                .filter(libro -> libro.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
