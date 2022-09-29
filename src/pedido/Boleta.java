package pedido;

import java.util.Date;


public class Boleta extends DocTributario {
    
    public Boleta(float mci,float msi,float iv,String x,Date z,String s,Cliente c){
        
        super(mci,msi,iv,x,z,s,c);
    }
    
    public String getBoleta(){
        return new String("Boleta "+super.getNumero()+"\n"+super.getFecha()+"\n"+super.cliente.getNombre()+
                "\n"+super.cliente.getRut()+"\n"+super.cliente.getDireccion()+"\n"+super.getCaracteristicas()+
                "\n"+super.getMontoSinIva()+"\nIva "+super.getIva()+"\ntotal "+super.getMontoConIva());
    }
    
}
