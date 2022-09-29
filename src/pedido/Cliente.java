package pedido;

public class Cliente {
    private String nombre;
    private String rut;
    private String direccion;
    
    public Cliente(String s1,String s2,String s3){
        this.nombre=s1;
        this.rut=s2;
        this.direccion=s3;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}
