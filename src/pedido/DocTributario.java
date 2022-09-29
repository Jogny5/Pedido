package pedido;

import java.util.Date;

public abstract class DocTributario {
    
    private float montoConIva;
    private float montoSinIva;
    private float iva;
    private String numero;
    private Date fecha;
    private String caracteristicas;
    public Cliente cliente;
    
    public DocTributario(float mci,float msi,float iv,String x,Date z,String s,Cliente c){
        montoConIva=mci;
        montoSinIva=msi;
        iva=iv;
        numero=x;
        fecha=z;
        caracteristicas=s;
        cliente=c;
    }

    public String getNumero() {
        return numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public float getMontoConIva() {
        return montoConIva;
    }

    public float getMontoSinIva() {
        return montoSinIva;
    }

    public float getIva() {
        return iva;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
}
