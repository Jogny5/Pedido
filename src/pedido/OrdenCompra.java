package pedido;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    
    private Date fecha;
    private String estado;
    public DetalleOrden orden;
    public DocTributario doc;
    public ArrayList<DetalleOrden> ar;
        
    public OrdenCompra(){
        
        
    }
    void setDocTributario(DocTributario doct){
        doc=doct;
    }
    
    public void addDetalleOrden(DetalleOrden x){
        
        ar.add(x);
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
}
