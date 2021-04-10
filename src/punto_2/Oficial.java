package punto_2;

public class Oficial extends Operario{
    //CONSTRUCTORES
    public Oficial() {
    }
    public Oficial(String nombre) {
        super();
    }
    @Override
    public String toString() {
        return super.toString()+"-->Oficial";
    }    
}
