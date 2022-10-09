package pedido;

import java.util.Date;


public class Factura extends DocTributario{
    
    public Factura(String x, Date z, Cliente cliente,float Preciosiniva,float Precioconiva,float Iva){
        
         super(x,z,cliente,Preciosiniva,Precioconiva,Iva);
    }
    
    @Override
    public String toString(){
        return "Factura\nNumero"+this.getNumero()+"\nRut: "+this.getRut()+"\nDireccion: "+this.getDir()+
                "\nPrecio sin iva: "+this.getPrecio()+"\nIva: "+
                this.getIva()+"\nTotal: "+this.getPrecioiva()+"\n";
    }
    
}
