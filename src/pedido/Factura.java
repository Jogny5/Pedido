package pedido;

import java.util.Date;


public class Factura extends DocTributario{
    private String datosEmpresa;
    public Factura(String x, Date z, Cliente cliente){
        
        super(x,z,cliente);
    }
    
    @Override
    public String toString(){
        return this.getNumero()+"\n"+this.getRut()+"\n"+this.getDir();
    }
    
}
