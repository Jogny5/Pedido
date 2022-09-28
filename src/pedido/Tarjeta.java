package pedido;

import java.util.Date;

public class Tarjeta extends Pago{
    
    private final String tipo;
    private final String numTransaccion;
    
    public Tarjeta(float x,Date y,String a, String b){
        
        super(x,y);
        
        tipo=a;
        numTransaccion=b;
    }
    
    
}