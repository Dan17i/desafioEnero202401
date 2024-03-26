package com.programandoenjava.parte3.clases;
import java.util.Collection;
import java.util.HashSet;

public class Biblioteca {
    private Collection<Libro> listaLibros;


    public Biblioteca (){
        this.listaLibros= new HashSet<>();
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
