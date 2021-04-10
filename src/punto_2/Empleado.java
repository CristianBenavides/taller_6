package punto_2;

public class Empleado {
    private String nombre;
    
    ///GETTER
    public String getNombre() {
        return nombre;
    }
    //SETTER
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //CONSTRUCTOR SOBRECARGADO
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    //CONSTRUCTOR
    public Empleado() {
    }
    
    public String toString() {
        return "Empleado "+this.nombre;
    }
    
}
