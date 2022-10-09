package pedido;

import java.util.Date;

public abstract class Pago {
    
    private float monto;
    private Date fecha;

    public Pago(float x, Date y){
        
        monto=x;
        fecha=y;        
    }
    
    public float getMonto(){
        
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }
    
    @Override
    public String toString(){
        return "Pago\nMonto: "+this.getMonto()+"\nFecha: "+this.getFecha()+"\n";
    }
}
