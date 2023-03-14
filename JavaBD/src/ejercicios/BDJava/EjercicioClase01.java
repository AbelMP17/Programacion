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
public class EjercicioClase01 {
    public static void main(String[] args) {
        try(
                Connection c = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/BDJava",
                        "root",
                        ""
        )){
            String cons = "SELECT nombre FROM ALUMNOS WHERE ciudad IS NULL";
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(cons);
            
            while(rs.next()){
                String n = rs.getString("NOMBRE");
                System.out.println(n);
            }
            
        }catch(SQLException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
