package com.programandoenjava.parte3.clases;

public class Libro {
    //--------------------------------atributo---------------------------------------
    private String titulo;
    private String autor; 
    private int anoPublicacion;
    private int id;

    //--------------------------constructor------------------------------------------
    public Libro(String titulo, String autor, int anoPublicacion, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.id = id;
    }
    //-----------------------metodos de acceso---------------------------------------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    
    
}
