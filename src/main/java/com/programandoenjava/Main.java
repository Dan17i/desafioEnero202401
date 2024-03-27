package com.programandoenjava;

import com.programandoenjava.parte3.clases.Biblioteca;
import com.programandoenjava.parte3.clases.Libro;
import com.programandoenjava.parte3.clases.Persona;

public class Main {

    public static void main(String[] args) {
 // Crear algunos libros
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943, 1);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 2);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, 3);

        // Crear una biblioteca y agregar los libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Crear una persona
        Persona persona = new Persona("Juan", 30, 123456789);

        // Prestar un libro a la persona
        String mensajePrestamo = persona.prestarLibro(libro1);
        System.out.println(mensajePrestamo); // Debería imprimir un mensaje de préstamo exitoso

        // Mostrar los datos de la persona y los libros prestados
        System.out.println("Datos de la persona:");
        System.out.println(persona);

        // Buscar un libro por su ID en la biblioteca
        Libro libroEncontrado = biblioteca.buscarLibroId(2);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado");
        }
    }
}