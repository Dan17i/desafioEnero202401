package com.programandoenjava.parte3.clases;

public class LibroDigital extends Libro {

    private String Url;

    public LibroDigital(String Url,String titulo, String autor, int anoPublicacion, int id) {
        super(titulo, autor, anoPublicacion, id);
        this.Url=Url;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    
    
}
