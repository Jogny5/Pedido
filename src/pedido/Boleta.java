package pedido;

import java.util.Date;


public class Boleta extends DocTributario {
    
    public Boleta(String x, String y, Date z){
        
        super(x,y,z);
    }
    
    public String getBoleta(){
        return new String(super.getNumero()+"\n"+super.getRut()+"\n"+super.getFecha());
    }
    
}
