package pedido;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    
    private Articulo articulo1;
    private Articulo articulo2;
    private Articulo articulo3;
    private Articulo articulo4;
    private Articulo articulo5;
    private int cantidadA;
    private int cantidadB;
    private int cantidadC;
    private int cantidadD;
    private int cantidadE;
    private Date fecha;
    private String estado;
    public DocTributario doc;
    private Cliente cliente;
    public ArrayList<DetalleOrden> ar;
    
    public OrdenCompra(Date hoy,String state,Cliente client,
            Articulo a,int cantA,Articulo b,int cantB,
            Articulo c,int cantC,Articulo d,int cantD,
            Articulo e,int cantE){
        this.articulo1=a;
        this.articulo2=b;
        this.articulo3=c;
        this.articulo4=d;
        this.articulo5=e;
        this.cantidadA=cantA;
        this.cantidadB=cantB;
        this.cantidadC=cantC;
        this.cantidadD=cantD;
        this.cantidadE=cantE;
        this.fecha=hoy;
        this.estado=state;
        this.cliente=client;
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
