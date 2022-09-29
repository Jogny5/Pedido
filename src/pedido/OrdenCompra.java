
package pedido;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    //public DetalleOrden orden;
    public DocTributario doc;
    
    public OrdenCompra(){
        //orden=new DetalleOrden();
    }
    void setDocTributario(DocTributario doct){
        doc=doct;
    }
    
    public void calcPresionSinIVA(){
        
    }
    public void calcIVA(){
        
    }
    public void calcPrecio(){
        
    }
    public void calcPeso(){
        
    }
}
