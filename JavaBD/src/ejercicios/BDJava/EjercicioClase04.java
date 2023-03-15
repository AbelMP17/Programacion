package ejercicios.BDJava;

import java.sql.*;
import java.util.Scanner;

public class EjercicioClase04 {
    public static void main(String[] args) {
        try(Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BDJava",
                "root",
                ""
        )){
            System.out.print("Introduce una ciudad: ");
            String ciudad = new Scanner(System.in).nextLine();
            
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT COUNT(id_alumno) AS ID, ciudad FROM ALUMNOS WHERE ciudad = '"+ciudad+"'");
            
            while(rs.next()){
                String ciu = rs.getString("CIUDAD");
                int id = rs.getInt("ID");
                
                System.out.println(id+" : "+ciu);
            }
            
        }catch(SQLException error){
            System.out.println("Error.");
            System.out.println(error.getMessage());
        }
    }
}
