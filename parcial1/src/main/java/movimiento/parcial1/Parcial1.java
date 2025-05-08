/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package movimiento.parcial1;
import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Parcial1 {

    public static void main(String[] args) {
        Libros libros = new Libros();
        Usuarios usuarios = new Usuarios();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("\n=== BIENVENIDO A LA BIBLIOTECA DE LA UNAL ===");
                System.out.println("1. Crear Usuario");
                System.out.println("2. Mostrar usuarios");
                System.out.println("3. Registrar un libro");
                System.out.println("4. Mostrar libros");
                System.out.println("5. Salir");
                String opt = scanner.nextLine();

            switch (opt) {
                case "1": {
                    System.out.println("Ingrese el usuario");
                    String userName = scanner.nextLine();
                    usuarios.createUser(userName);
                    System.out.println("Usuario creado exitosamente.");
                    break;
                }
                case "2": {
                    usuarios.getUsuarios().forEach(u -> System.out.println(u));
                    break;
                }
                case "3": {
                    System.out.println("Ingrese la categoria");
                    System.out.println("1. Ficcion");
                    System.out.println("2. Ingenieria");
                    System.out.println("3. Medicina");
                    int category = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el titulo");
                    String bookTitle = scanner.nextLine();
                    libros.createBook(category, bookTitle);
                    System.out.println("Libro creado exitosamente.");
                    break;
                }
                case "4": {
                    libros.getLibros().forEach(b -> System.out.println(b));
                    break;
                }
                case "5": {
                    exit = true;
                    break;
                }
                default:
                    System.out.println("Opcion Invalida");
            }
        }
    }   
}
