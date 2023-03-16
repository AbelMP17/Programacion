package ejercicios.BDJava;

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
            String sql = "SELECT * FROM ALUMNOS WHERE nombre=?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String n = rs.getString("NOMBRE");
                String ciudad = rs.getString("CIUDAD");
                int id = rs.getInt("ID_ALUMNO");
                
                System.out.println(id+" : "+n+" : "+ciudad);
            }
            
        }catch(SQLException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
