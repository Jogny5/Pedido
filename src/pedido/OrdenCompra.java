package pedido;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    
    private Date fecha;
    private String estado;
    public DocTributario doc;
    private Cliente cliente;
    
    public ArrayList<DetalleOrden> ar;
    public ArrayList<Pago> pagos;
    
    
   public OrdenCompra(Date x){
        
        fecha=x;
        estado="Por pagar";
        
        ar = new ArrayList<>();
        pagos = new ArrayList<>();
    }
    void setDocTributario(DocTributario doct){
        doc=doct;
    }
    
    void setCliente(Cliente client){
        cliente=client;
    }
    
    public void addDetalleOrden(DetalleOrden x){
        
        ar.add(x);
    }
    
    
    
    public void actEstado(String x){
        
        estado=x;
    }

    public String getEstado() {
        return estado;
    }
    
    public Date getFecha(){
        
        return fecha;
    }

    public DocTributario getDoc() {
        return doc;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<DetalleOrden> getAr() {
        return ar;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
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
            
            estado="Pagado\n";
        }
    }
    
    @Override
    public String toString(){
        return "OrdenCompra\nFecha: "+this.getFecha()+"\nEstado: "+
                this.getEstado()+"\nDocTributario: "+this.getDoc()+
                "\nCliente: "+this.getCliente();
    }
}
