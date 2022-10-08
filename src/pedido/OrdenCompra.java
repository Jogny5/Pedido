package pedido;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    
    private Date fecha;
    private String estado;
    private DocTributario doc;
    
    public ArrayList<DetalleOrden> ar;
    public ArrayList<Pago> pagos;
        
    public OrdenCompra(Date x){
        
        fecha=x;
        estado="Por pagar";
    }
    
    public void addDetalleOrden(DetalleOrden x){
        
        ar.add(x);
    }
    
    public void setDocTributario(DocTributario doct){
        
        doc=doct;
    }
    
    public void actEstado(String x){
        
        estado=x;
    }
    
    public Date getFecha(){
        
        return fecha;
    }
    
    public float calcPrecioSinIVA(){
        
        float total=0;
        
        for (int i=0; i< ar.size();i++){
            
            total = total + ar.get(i).calcPrecioSinIVA();
        }
        
        return total;
    }
    
    public float calcIVA(){
        
        float total=0;
        
        for (int i=0; i< ar.size();i++){
            
            total = total + ar.get(i).IVA();
        }
        
        return total;
        
    }
    
    public float calcPrecio(){
        
        float total=0;
        
        for (int i=0; i< ar.size();i++){
            
            total = total + ar.get(i).calcPrecio();
        }
        
        return total;
    }
    
    public float calcPeso(){
        
        float total=0;
        
        for (int i=0; i< ar.size();i++){
            
            total = total + ar.get(i).Peso();
        }
        
        return total;
    }
    
    public void addPago(Pago x){
        
        pagos.add(x);
        
        float total=0;
        
        for(int i=0; i<pagos.size();i++){
            
            total = total + pagos.get(i).getMonto();
            
        }
        
        if(total>=calcPrecio()){
            
            estado="Pagado";
        }
    }
}
