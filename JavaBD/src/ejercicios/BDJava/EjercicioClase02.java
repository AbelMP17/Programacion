/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.BDJava;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioClase02 {
    public static void main(String[] args) {
        System.out.print("Introduce el id de un alumno: ");
        int i = new Scanner(System.in).nextInt();
        
        try(Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BDJava",
                "root",
                ""
        )){
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM ALUMNOS WHERE id_alumno = %d".formatted(i));
            while(rs.next()){
                System.out.print(rs.getString("ID_ALUMNO"));
                System.out.print(" : ");
                System.out.print(rs.getString("NOMBRE"));
                System.out.print(" : ");
                System.out.println(rs.getString("CIUDAD"));
                
            }
        }catch(SQLException error){
            System.err.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
