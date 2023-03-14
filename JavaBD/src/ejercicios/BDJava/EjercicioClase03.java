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
public class EjercicioClase03 {
    public static void main(String[] args) {
        try(Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BDJava",
                "root",
                ""
        )){
            System.out.print("Introduce un String: ");
            String str = new Scanner(System.in).nextLine();
            System.out.print("Introduce una ciudad: ");
            String ciudad = new Scanner(System.in).nextLine();
            
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM ALUMNOS WHERE nombre LIKE '%"+str+"%'");
            
            while(rs.next()){
                System.out.println("");
            }
            
        }catch(SQLException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
