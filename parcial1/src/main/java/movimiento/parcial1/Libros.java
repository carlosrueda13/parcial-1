/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movimiento.parcial1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class Libros {
    
    private final List<Libro> libros;
    
    public Libros(){
        this.libros = new ArrayList<>();
    } 
    
    public void createBook(int category, String bookTitle){
        Libro libro = new Libro(category, bookTitle);
        libros.add(libro);
    }
     public List<Libro> getLibros(){
        return libros;
    }
}
