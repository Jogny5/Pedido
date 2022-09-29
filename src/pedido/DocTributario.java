package pedido;

import java.util.Date;

public abstract class DocTributario {
    
    private String numero;
    private String rut;
    private Date fecha;
    
    public DocTributario(String x, String y, Date z){
        
        numero=x;
        rut=y;
        fecha=z;
        
    }

    public String getNumero() {
        return numero;
    }

    public String getRut() {
        return rut;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
}
