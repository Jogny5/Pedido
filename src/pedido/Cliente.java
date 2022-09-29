package pedido;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
   
    private String nombre;
    private String rut;
    private Direccion dir;
    
    private ArrayList <OrdenCompra> ar;
    
    public Cliente(String s1,String s2,String s3){
        
        this.nombre=s1;
        this.rut=s2;
        
        dir = new Direccion(s3);
    }
    
    public void addOrdenCompra(OrdenCompra x, String a, String num){
        
        ar.add(x);
                
        if(a.equals("Boleta")){
            
            x.setDocTributario(new Boleta(num,rut,x.getFecha(),dir));
        }
        
        if(a.equals("Factura")){
            
            x.setDocTributario(new Factura(num,rut,x.getFecha(),dir));
        }
    }
    
    
}
