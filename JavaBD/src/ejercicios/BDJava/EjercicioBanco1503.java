/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.BDJava;

import java.sql.*;
import java.util.*;

/**
 *
 * @author usuario
 */
public class EjercicioBanco1503 {

    public static void main(String[] args) {
        System.out.print("Usuario: ");
        String usuario = new Scanner(System.in).nextLine();

        System.out.print("Contrseña: ");
        String contraseña = new Scanner(System.in).nextLine();

        try (Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BDJava",
                "root",
                ""
        )) {
            //Enfoque vulnerable
            /*Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM BANCO WHERE username = 'xxx' AND clave2 = md5('xxx') or 1=1");*/
            
            String sql = "SELECT * FROM BANCO WHERE username=? AND clave2 = md5(?)";
           
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                String nom = rs.getString("NOMBRE");
                int id = rs.getInt("ID");
                int sld = rs.getInt("SALDO");

                boolean rep = true;
                while (rep) {
                    System.out.println("""
                                        Bienvenido %s
                                            - Tu saldo es %d
                                            1. Sacar dinero
                                            2. Hacer transferencia
                                            3. Domiciliar recibos
                                            4. Salir
                                       """.formatted(nom, sld));
                    System.out.print("Opcion a elegir: ");
                    int opc = new Scanner(System.in).nextInt();

                    switch (opc) {
                        case 1 -> {
                            System.out.print("Cantidad a retirar: ");
                            int dinero = new Scanner(System.in).nextInt();
                            ps.executeUpdate("UPDATE BANCO SET saldo=saldo-" + dinero + " WHERE id=" + id);
                            sld -= dinero;
                            System.out.println("Tu saldo ahora es de " + sld);

                        }
                        case 2 -> {
                            System.out.print("Cantidad a transferir: ");
                            int can = new Scanner(System.in).nextInt();
                            
                            System.out.print("Usuario de destino: ");
                            String usr1 = new Scanner(System.in).nextLine();
                            
                            String sql1 = "UPDATE BANCO SET saldo = saldo-"+can+" WHERE id = "+id;
                            String sql2 = "UPDATE BANCO SET saldo = saldo+"+can+" WHERE username = '"+usr1+"'";
                            
                            c.setAutoCommit(false);
                            
                            Statement s1 = c.createStatement();
                            s1.executeUpdate(sql1);
                            Statement s2 = c.createStatement();
                            s2.executeUpdate(sql2);
                            c.commit();
                        }
                        case 4 -> rep = false;
                        default -> {
                            System.out.println("Opcion no valida.");
                            rep = false;
                        }
                    }
                }
            } else {
                System.out.println("Usuario y contraseña incorrecta.");
            }

        } catch (SQLException error) {
            System.out.println("Error.");
            System.out.println(error.getMessage());
        }
    }
}
