package pedido;

import java.util.Date;

public class Transferencia extends Pago{
    
    private String banco;
    private String numCuenta;
    
    public Transferencia(float x,Date y,String a, String b){
        
        super(x,y);
        
        banco=a;
        numCuenta=b;
    }

    public String getBanco() {
        return banco;
    }

    public String getNumCuenta() {
        return numCuenta;
    }
    
    @Override
    public String toString(){
        return "Transferencia\nBanco: "+this.getBanco()+"\nNumero de la cuenta: "+this.getNumCuenta()+"\n";
    }
    
}
