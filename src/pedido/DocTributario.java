package pedido;

import java.util.Date;

public abstract class DocTributario {
    
     
    private String numero;
    private String rut;
    private Date fecha;
    private String dir;
    private Cliente cliente;
    private float precio;
    private float precioiva;
    private float iva;
    
    public DocTributario(String x, Date z, Cliente client,float Preciosiniva,float Precioconiva,float Iva){
        this.precio=Preciosiniva;
        this.precioiva=Precioconiva;
        this.iva=Iva;
        this.numero=x;
        this.cliente=client;
        this.rut=this.cliente.getRut();
        this.fecha=z;
        dir= this.cliente.getDireccion();
    }

    public String getNumero() {
        return numero;
    }

    public String getRut() {
        return rut;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDir() {
        return dir;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public float getPrecio() {
        return precio;
    }

    public float getPrecioiva() {
        return precioiva;
    }

    public float getIva() {
        return iva;
    }
    
    
}
