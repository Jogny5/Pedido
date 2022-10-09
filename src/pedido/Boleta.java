package pedido;

import java.util.Date;


public class Boleta extends DocTributario {
    
    public Boleta(String x, Date z, Cliente cliente,float Preciosiniva,float Precioconiva,float Iva){
        
        super(x,z,cliente,Preciosiniva,Precioconiva,Iva);
    }
    
    @Override
    public String toString(){
        return this.getNumero()+"\n"+this.getRut()+"\n"+this.getDir()+"\n"+this.getPrecio()+"\n"+
                this.getIva()+"\n"+this.getPrecioiva();
    }
    
}
