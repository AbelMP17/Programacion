/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.BDJava;

/**
 *
 * @author usuario
 */
import java.sql.*;
import java.util.Scanner;

public class EjercicioAlumno1503 {
    public static void main(String[] args) {
        System.out.print("Escribe el nombre de un alumno: ");
        String nombre = new Scanner(System.in).nextLine();
        
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDJava",
                                                            "root",
                                                            "")
                ){
            String sql = "SELECT * FROM ALUMNOS WHERE ciudad=?";
            PreparedStatement ps = c.prepareStatement(sql);
        }catch(SQLException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
