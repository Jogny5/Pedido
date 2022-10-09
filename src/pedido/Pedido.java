package pedido;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    
    public static void main(String[] args) {
        
        Date fecha1=new Date();
        
        Cliente cliente1=new Cliente("pepe","20.444.666-1","San Pedro");
        Cliente cliente2=new Cliente("manuel","18.123.456-7","Concepcion");
        Cliente cliente3=new Cliente("pepa","14.449.987-k","Talcahuano");
        
        Articulo a=new Articulo(16.5f,"polera","manga corta",17000);
        Articulo b=new Articulo(50.5f,"pantalon","color rosa",20000);
        Articulo c=new Articulo(10.51f,"poleron","color gris",25000);
        
          
        DetalleOrden detaO = new DetalleOrden(5,a);
        
        OrdenCompra orC = new OrdenCompra(fecha1);
        
        orC.addDetalleOrden(detaO);
        
        System.out.println(orC.calcPrecio());
        
        
        
    }
    
}
