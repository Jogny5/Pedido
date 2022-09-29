package pedido;

import java.util.Date;


public class Factura extends DocTributario{
    private String datosEmpresa;
    public Factura(float mci,float msi,float iv,String x,Date z,String s,Cliente c){
        super(mci,msi,iv,x,z,s,c);
    }
    
    public String GetFactura(){
        return new String("Facura de compra\n"+datosEmpresa+"\nFecha"+super.getFecha()+
                "\nFactura Numero "+super.getNumero()+"\n"+super.cliente.getNombre()+"\n"+
                super.cliente.getRut()+"\n"+super.cliente.getDireccion()+"\n"+
                super.getFecha()+"\n"+super.getMontoSinIva()+"\nIva "+super.getIva()+
                "\ntotal "+super.getMontoConIva());
    }
    
}
