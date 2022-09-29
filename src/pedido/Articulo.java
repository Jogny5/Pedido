package pedido;

public class Articulo {
    
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
  
    public Articulo(float x, String a, String b, float y){
        
        peso=x;
        nombre=a;
        descripcion=b;
        precio=y;
    }
    
    public float getPrecio(){
        
        return precio;
    }
    
    public float getPeso(){
        
        return peso;
    }
}
