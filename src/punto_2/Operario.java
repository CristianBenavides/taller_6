
package punto_2;

public class Operario extends Empleado{
    //CONSTRUCTORES
    public Operario() {
    }
    public Operario(String nombre) {
        super(nombre);
    }    
    @Override
    public String toString() {
        return super.toString()+"--> Operario";
    }   
}   
