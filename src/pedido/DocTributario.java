package pedido;

import java.util.Date;

public abstract class DocTributario {
    
     
    private String numero;
    private String rut;
    private Date fecha;
    private String dir;
    private Cliente cliente;
    
    public DocTributario(String x, Date z, Cliente cliente){
        
        this.numero=x;
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
    
    
}
