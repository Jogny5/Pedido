package pedido;

import java.util.Date;

public class Efectivo extends Pago {
    
    private OrdenCompra oc;
    
    public Efectivo(float x,Date y, OrdenCompra a){
        
        super(x,y);
        oc=a;
    }
    
    public float calcDevolucion(){
        
        return getMonto()-oc.calcPrecio();
    }
    
}
