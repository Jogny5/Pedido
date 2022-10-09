package pedido;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    
    public static void main(String[] args) {
        
        Date fecha1=new Date();
        Date fecha2=new Date();
        
        Cliente cliente1=new Cliente("pepe","20.444.666-1","San Pedro");
        Cliente cliente2=new Cliente("manuel","18.123.456-7","Concepcion");
        Cliente cliente3=new Cliente("pepa","14.449.987-k","Talcahuano");
        Cliente cliente4=new Cliente("jose","19.482.471-1","Chiguayante");
        
        Articulo a=new Articulo(16.5f,"polera","manga corta",17000);
        Articulo b=new Articulo(50.5f,"pantalon","color rosa",20000);
        Articulo c=new Articulo(12.51f,"poleron","color gris",22000);
        Articulo d=new Articulo(20.10f,"zapatilla","deportivas",30000);
        Articulo e=new Articulo(8.78f,"chaqueta","color azul",25000);
        
        DetalleOrden detaO = new DetalleOrden(2,a);
        DetalleOrden detaO2 = new DetalleOrden(3,b);
        DetalleOrden detaO3 = new DetalleOrden(2,c);
        DetalleOrden detaO4 = new DetalleOrden(1,d);
        DetalleOrden detaO5 = new DetalleOrden(1,e);
        
        OrdenCompra orC = new OrdenCompra(fecha1);
        OrdenCompra orC2= new OrdenCompra(fecha1);
        OrdenCompra orC3= new OrdenCompra(fecha1);
        OrdenCompra orC4= new OrdenCompra(fecha1);
        
        orC.addDetalleOrden(detaO3);
        orC.addDetalleOrden(detaO2);
        
        orC2.addDetalleOrden(detaO);
        orC2.addDetalleOrden(detaO3);
        
        orC3.addDetalleOrden(detaO);
        orC3.addDetalleOrden(detaO4);
        
        orC4.addDetalleOrden(detaO2);
        orC4.addDetalleOrden(detaO5);
        
        
        
        
        Efectivo efectivo1=new Efectivo(55000f,fecha1,orC);
        Efectivo efectivo2=new Efectivo(70000f,fecha1,orC);
        Efectivo efectivo3=new Efectivo(40000f,fecha1,orC4);
        Efectivo efectivo4=new Efectivo(25000f,fecha1,orC4);
        
        
        Transferencia transferencia1=new Transferencia(53000,fecha1,"BancoEstado","123456");
        Transferencia transferencia2=new Transferencia(40000,fecha2,"BancoEstado","123456");
        
        Tarjeta tarjeta1=new Tarjeta(45000,fecha1,"tipo af","456789312");
        Tarjeta tarjeta2=new Tarjeta(35000,fecha1,"tipo ff","557788440");
        
        
        Boleta boleta1=new Boleta("123456",fecha1,cliente1,orC.calcPrecioSinIVA(),orC.calcPrecio(),orC.calcIVA());
        System.out.println(boleta1.toString());
        
        System.out.println(orC.getEstado());
        orC.addPago(efectivo1);
        System.out.println(orC.getEstado());
        orC.addPago(efectivo2);
        System.out.println(orC.getEstado());
        
        
        
        Boleta boleta2=new Boleta("234567",fecha2,cliente2,orC2.calcPrecioSinIVA(),orC2.calcPrecio(),orC2.calcIVA());
        System.out.println(boleta2.toString());
        
        System.out.println(orC2.getEstado());
        orC2.addPago(transferencia1);
        System.out.println(orC2.getEstado());
        orC2.addPago(transferencia2);
        System.out.println(orC2.getEstado());
        
        
        
        Factura factura1=new Factura("112254",fecha1,cliente3,orC3.calcPrecioSinIVA(),orC3.calcPrecio(),orC3.calcIVA());
        System.out.println(factura1.toString());
        
        System.out.println(orC3.getEstado());
        orC3.addPago(tarjeta1);
        System.out.println(orC3.getEstado());
        orC3.addPago(tarjeta2);
        System.out.println(orC3.getEstado());
        
        
        Factura factura2=new Factura("112254",fecha1,cliente4,orC4.calcPrecioSinIVA(),orC4.calcPrecio(),orC4.calcIVA());
        System.out.println(factura2.toString());
        
        System.out.println(orC4.getEstado());
        orC4.addPago(efectivo3);
        System.out.println(orC4.getEstado());
        orC4.addPago(efectivo3);
        System.out.println(orC4.getEstado());
        orC4.addPago(efectivo3);
        System.out.println(orC4.getEstado());
        
    }
    
}
