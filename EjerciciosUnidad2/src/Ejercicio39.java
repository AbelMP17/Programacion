/*
Consulta el pdf de la “Librería Estándar de Java” y busca la clase System. Haz un
programa que muestre por pantalla información sobre tu ordenador, de la forma que indica la
siguiente imagen. (Nota: La carpeta de archivos temporales es la variable de entorno TMP). 
*/

public class Ejercicio39 {
    public static void main(String[] args) {
    String soNombre = System.getProperty("os.name");
    String soVersion = System.getProperty("os.version");
    String soArquitectura = System.getProperty("os.arch");
    String soUsuario = System.getProperty("user.name");
    String soArchivosL = System.getProperty("java.io.tmpdir");
        
        System.out.println("Informacion sobre el ordenador: "
                +"\n- Sistema operativo: "+soNombre
                +"\n- Version del sistema operativo: "+soVersion
                +"\n- Arquitectura del sistema operativo: "+soArquitectura
                +"\n- Usuario actual: "+soUsuario
                +"\n- Carpeta de archivos temporales: "+soArchivosL);
        
    }
}
