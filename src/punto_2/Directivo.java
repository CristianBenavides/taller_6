package punto_2;

public class Directivo extends Empleado{
    //CONSTRUCTORES   
    public Directivo() {
    }
    public Directivo(String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        return super.toString()+"-->Directivo";
    }   
}
