
package punto_4;

public class Ordenador {
    private long codigo;
    private double precio;

    public Ordenador() {
    }
    public Ordenador(long codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }
    public String toString(){
        System.out.print("Ordenador ");
    return "codigo:"+this.codigo+", precio: "+this.precio;
    }    
}
