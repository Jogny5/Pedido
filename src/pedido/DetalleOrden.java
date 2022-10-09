package pedido;

public class DetalleOrden {
    
    private final int cantidad;
    private final Articulo item;
    
    public DetalleOrden(int x, Articulo y){
        
        cantidad=x;
        item=y;
    }
    
    public float calcPrecio(){
        
        return (float) ((item.getPrecio()*cantidad)*1.19);
    }
    
    public float calcPrecioSinIVA(){
        
        return item.getPrecio()*cantidad;
    }
    
    public float IVA(){
        
        return (float) ((item.getPrecio()*cantidad)*0.19);
    }
    
    public float Peso(){
        
        return item.getPeso()*cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Articulo getItem() {
        return item;
    }
    
    @Override
    public String toString(){
        return "DetalleOrden\n Cantidad: "+this.getCantidad()+"\nItem: "+this.getItem();
    }
}
