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
public class Usuarios {
    
    private final List<Usuario> usuarios;
    
    public Usuarios(){
        this.usuarios = new ArrayList<>();
    } 
    
    public void createUser(String userName){
        Usuario usuario = new Usuario(userName);
        usuarios.add(usuario);
    }
    
    public List<Usuario> getUsuarios(){
        return usuarios;
    }
    
}
