package punto_2;

public class Tecnico extends Operario{
    //CONSTRUCTORES
    public Tecnico() {
    } 
    public Tecnico(String nombre) {
        super(nombre);
    } 
    @Override
    public String toString() {
        return super.toString()+"-->Tecnico"; 
    }
    
}
