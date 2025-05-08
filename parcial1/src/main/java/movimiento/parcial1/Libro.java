/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movimiento.parcial1;

/**
 *
 * @author estudiante
 */
public class Libro {
    
    private int category;
    private String bookTitle;
    
    public Libro (int category, String bookTitle) {
    
        this.category = category;
        this.bookTitle = bookTitle;
        
    }
    
     @Override
    public String toString() {
        return String.format("Categoria: %d ----- Titulo: %s",category,bookTitle);
    }
}
