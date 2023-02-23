package clase.Framework;

import java.awt.*;

public enum Resolucion {
    PANTALLA_COMPLETA(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height)),
    VENTANA_4K(new Dimension(3840, 2160)),
    VENTANA_FULLHD(new Dimension(1920, 1080)),
    VENTANA_QHD(new Dimension(2560, 1440)),
    VENTANA_VGA(new Dimension(640, 480));

    
    private Dimension resolucion;
    
    private Resolucion(Dimension r){
        resolucion = r;
    }
    
    public Dimension getResolucion(){
        return resolucion;
    }
}
