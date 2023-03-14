package clase.programaConBaseDeDatos;
import java.sql.*;

public class ProgramaBD {
    public static void main(String[] args) {
        
        try(Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/BDJava","root",""
            )){
            
            System.out.println("Conexion establecida correctamente.");
            
            
            //Le pido a la conexion un Statement para poder manejar SQL
            Statement s = cn.createStatement();
            
            //Hago un String con la consulta
            String sql = "Select id_alumno, nombre, ciudad FROM ALUMNOS";
            
            //Le paso al Statement el String para que lo ejecute
            ResultSet rs = s.executeQuery(sql);
            
            //Recorro el ResultSet
            while(rs.next()){ // esto baja la fila seleccionada
                String n = rs.getString("NOMBRE");
                String c = rs.getString("CIUDAD");
                int id = rs.getInt("ID_ALUMNO");
                System.out.print(id);
                System.out.print(" : ");
                System.out.print(n);
                System.out.print(" : ");
                System.out.println(c);
            }
            
            //nos desconectamos
            /*cn.close();*/
            
        }catch(SQLException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
