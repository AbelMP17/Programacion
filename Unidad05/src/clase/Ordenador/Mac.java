package clase.Ordenador;

import java.io.IOException;

public class Mac extends Ordenador{
    private String cuentaApple;
    private int numeroPuertosThunderbolt;
    
    public Mac(int cr, String ca, int  npt){
        super(cr, "Mac OS", "Apple");
        this.cuentaApple = ca;
        this.numeroPuertosThunderbolt = npt;
    }

    public String getCuentaApple() {
        return cuentaApple;
    }

    public int getNumeroPuertosThunderbolt() {
        return numeroPuertosThunderbolt;
    }
    
    @Override
    public void encender(){
        super.encender();
        System.out.println("""
                                                    _
                                                   **
                                                  ***
                                             _____ = _____  
                                            **************
                                          **************
                                         ***************_
                                         *****************___=
                                         *********************
                                          *******************
                                           *****************
                                            ***************
                                             =====   =====
                           """);
    }
    
    @Override
    public void abrirNavegador(){
        try {
           Process proceso = new ProcessBuilder("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe").start();
        } catch (IOException error) {
            System.out.println(error);
        }
    }
            
}
