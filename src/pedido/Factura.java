package pedido;

import java.util.Date;


public class Factura extends DocTributario{
    private String datosEmpresa;
    public Factura(String x, Date z, Cliente cliente,float Preciosiniva,float Precioconiva,float Iva){
        
         super(x,z,cliente,Preciosiniva,Precioconiva,Iva);
    }
    
    @Override
    public String toString(){
        return this.getNumero()+"\n"+this.getRut()+"\n"+this.getDir()+"\n"+this.getPrecio()+"\n"+
                this.getIva()+"\n"+this.getPrecioiva();
    }
    
}
