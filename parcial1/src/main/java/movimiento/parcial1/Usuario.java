/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movimiento.parcial1;

/**
 *
 * @author estudiante
 */
public class Usuario {
    
    
    private String userName;
    
    public Usuario (String userName) {
    
        this.userName = userName;
    }
    
    @Override
    public String toString() {
        return String.format("Usuario: %s", userName);
    }
}
