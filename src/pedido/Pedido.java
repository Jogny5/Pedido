package pedido;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    
    public static void main(String[] args) {
        Date fecha1=new Date();
        String estado="estado";
        Cliente cliente=new Cliente("pepe","204446661","peru");
        Articulo a=new Articulo(16.5f,"polera","manga corta",16990);
        Articulo b=new Articulo(50.5f,"pantalon","color rosa",19990);
        Articulo c=new Articulo(10.51f,"poleron","color gris",24990);
        OrdenCompra primera=new OrdenCompra(fecha1,estado,cliente);
        
        
        
    }
    
}
