package pedido;

import java.util.Date;


public class Boleta extends DocTributario {
    
    public Boleta(String x, Date z, Cliente cliente){
        
        super(x,z,cliente);
    }
    
    @Override
    public String toString(){
        return this.getNumero()+"\n"+this.getRut()+"\n"+this.getDir();
    }
    
}
