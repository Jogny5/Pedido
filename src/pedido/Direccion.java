
package pedido;


public class Direccion {
    
    private String dir;
    
    public Direccion(String x){
        
        dir=x;
    }

    public String getDir() {
        return dir;
    }
    
    @Override
    public String toString(){
        return "Direccion\ndireccion: "+this.getDir();
    }
}
