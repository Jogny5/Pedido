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
        
          
        DetalleOrden detaO = new DetalleOrden(2,a);
        
        OrdenCompra orC = new OrdenCompra(fecha1);
        OrdenCompra orC2= new OrdenCompra(fecha1);
        OrdenCompra orC3= new OrdenCompra(fecha1);
        OrdenCompra orC4= new OrdenCompra(fecha1);
        
        orC.addDetalleOrden(detaO);
        orC2.addDetalleOrden(detaO);
        orC3.addDetalleOrden(detaO);
        orC4.addDetalleOrden(detaO);
        
        //System.out.println(orC.calcPrecio());
        
        
        Efectivo efectivo1=new Efectivo(50000f,fecha1,orC);
        Transferencia transferencia1=new Transferencia(60000,fecha1,"BancoEstado","123456");
        Tarjeta tarjeta1=new Tarjeta(45000,fecha1,"gadgafds","456789312");
        
        Efectivo efectivo2=new Efectivo(5000f,fecha1,orC4);
        Efectivo efectivo3=new Efectivo(70000f,fecha1,orC4);
        
        System.out.println(orC.getEstado());
        orC.addPago(efectivo1);
        System.out.println(orC.getEstado());
        
        Boleta boleta1=new Boleta("123456",fecha1,cliente1,orC.calcPrecioSinIVA(),orC.calcPrecio(),orC.calcIVA());
        System.out.println(boleta1.toString());
        
        
        System.out.println(orC2.getEstado());
        orC2.addPago(transferencia1);
        System.out.println(orC2.getEstado());
        
        
        
        
        System.out.println(orC3.getEstado());
        orC3.addPago(tarjeta1);
        System.out.println(orC3.getEstado());
        
        
        System.out.println(orC4.getEstado());
        orC4.addPago(efectivo2);
        System.out.println(orC4.getEstado());
        orC4.addPago(efectivo3);
        System.out.println(orC4.getEstado());
        
    }
    
}
