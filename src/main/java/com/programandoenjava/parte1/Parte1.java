package com.programandoenjava.parte1;

public class Parte1 {

    /**
     * Escribe un programa en Java que reciba una cadena de texto y devuelva la
     * misma cadena pero con cada palabra invertida. Por ejemplo, para la entrada "Hola Mundo",
     * la salida debería ser "aloH odluM".
     * @param cadena cadena de entrada
     * @return cadena invertida
     */
    public String invertirPalabras(final String cadena) {
        if (cadena == null) {
            return ""; // Manejo del caso en que la cadena es nula
        }
    
        // Divide la cadena manteniendo los espacios
        String[] palabras = cadena.split("(?<=\\s)|(?=\\s)");
    
        StringBuilder cadenaInvertida = new StringBuilder();
        for (String palabra : palabras) {
            // Si la palabra no es un espacio en blanco, invertirla
            if (!palabra.matches("\\s+")) {
                // Si la palabra contiene caracteres especiales, preservar su posición
                if (palabra.matches(".*[\\p{Punct}].*")) {
                    // Extraer caracteres especiales al inicio y al final de la palabra
                    String inicio = "";
                    String fin = "";
                    while (!Character.isLetterOrDigit(palabra.charAt(0))) {
                        inicio += palabra.charAt(0);
                        palabra = palabra.substring(1);
                    }
                    while (!Character.isLetterOrDigit(palabra.charAt(palabra.length() - 1))) {
                        fin = palabra.charAt(palabra.length() - 1) + fin;
                        palabra = palabra.substring(0, palabra.length() - 1);
                    }
                    // Invertir la palabra y agregar los caracteres especiales
                    palabra = inicio + new StringBuilder(palabra).reverse().toString() + fin;
                } else { // Si la palabra no contiene caracteres especiales, simplemente invertirla
                    palabra = new StringBuilder(palabra).reverse().toString();
                }
            }
            // Agregar la palabra a la cadena invertida
            cadenaInvertida.append(palabra);
        }
    
        return cadenaInvertida.toString();
    }
}
