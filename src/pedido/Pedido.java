package pedido;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    
    public static void main(String[] args) {
        
        Date d = new Date();
        
        Articulo a = new Articulo(10,"Bola","Tenis",10000);
        
        DetalleOrden detaO = new DetalleOrden(5,a);
        
        OrdenCompra orC = new OrdenCompra(d);
        
        orC.addDetalleOrden(detaO);
        
        System.out.println(orC.calcPrecio());
        
    }
    
}
