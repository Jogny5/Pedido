package pedido;

import java.util.Date;

public abstract class DocTributario {
    
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion dir;
    
    public DocTributario(String x, String y, Date z, Direccion d){
        
        numero=x;
        rut=y;
        fecha=z;
        dir= d;
    }    
}
