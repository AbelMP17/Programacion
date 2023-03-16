/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.BDJava;

import java.util.*;
import java.sql.*;
/**
 *
 * @author usuario
 */

public class CatalogoAlumnos {
    public static List<Alumno> getAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDJava","root","")){
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM ALUMNOS ORDER BY nombre");
            while(rs.next()){
                int id = rs.getInt("ID_ALUMNO");
                String nombre = rs.getString("NOMBRE");
                String ciudad = rs.getString("CIUDAD");
                
                alumnos.add(new Alumno(id, nombre, ciudad));
            }
        }catch(SQLException error){
            System.out.println("Error.");
            System.out.println(error.getMessage());
        }
        
        return alumnos;
    }
    
    public static Alumno actualizar(int id, String nombreNuevo, String ciudadNueva){
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDJava","root","")){
            PreparedStatement s = c.prepareStatement("UPDATE ALUMNOS SET nombre=?, ciudad=? WHERE id_alumno=?");
            s.setString(1, nombreNuevo);
            s.setString(2, ciudadNueva);
            s.setInt(3, id);
            s.executeUpdate();
            
        }catch(SQLException error){
            System.out.println("Error.");
            System.out.println(error.getMessage());
        }
        return new Alumno(id, nombreNuevo, ciudadNueva);
    }
    
    public static void eliminar(int id){
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDJava","root","")){
            PreparedStatement s = c.prepareStatement("DELETE FROM ALUMNOS WHERE id_alumno=?");
            s.setInt(1, id);
            s.executeUpdate();
            
        }catch(SQLException error){
            System.out.println("Error.");
            System.out.println(error.getMessage());
        }
    }
}
