package com.programandoenjava.parte3.clases;
import java.util.Collection;
import java.util.HashSet;

public class Biblioteca {
    private Collection<Libro> listaLibros;
    private Libro libro;
    private Persona persona;

    public Biblioteca (){
        this.listaLibros= new HashSet<>();
        this.libro = libro;
        this.persona = persona;
    }

    public void agregarLibro (Libro libro){
        listaLibros.add(libro);
    }
    public Libro buscarLibroId( int id){
        return listaLibros.stream()
        .filter(libro -> libro.id() == id)
        .findFirst()
        .orElse(null);
    }

}
