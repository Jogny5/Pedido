package pedido;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    
    public static void main(String[] args) {
        
        Date fecha1=new Date();
        String estado="estado";
        Cliente cliente1=new Cliente("pepe","20.444.666-1","San Pedro");
        Cliente cliente2=new Cliente("manuel","18.123.456-7","Concepcion");
        Cliente cliente3=new Cliente("pepa","14.449.987-k","Talcahuano");
        Articulo a=new Articulo(16.5f,"polera","manga corta",16990);
        Articulo b=new Articulo(50.5f,"pantalon","color rosa",19990);
        Articulo c=new Articulo(10.51f,"poleron","color gris",24990);
        Articulo d=new Articulo(10.51f,"poleron","color gris",24990);
        Articulo e=new Articulo(10.51f,"poleron","color gris",24990);
        OrdenCompra primera=new OrdenCompra(fecha1,estado,cliente1,a,5,b,2,c,3,d,0,e,1);
        OrdenCompra segunda=new OrdenCompra(fecha1,estado,cliente2,a,3,b,3,c,0,d,9,e,6);
        //OrdenCompra tercera=new OrdenCompra(fecha1,estado,cliente3,a,1,b,3,c,8,d,4,e,6);
        //OrdenCompra cuarta=new OrdenCompra(fecha1,estado,cliente1,a,0,b,7,c,0,d,0,e,1);
        //OrdenCompra quinta=new OrdenCompra(fecha1,estado,cliente2,a,0,b,1,c,1,d,2,e,8);
        
    }
    
}
