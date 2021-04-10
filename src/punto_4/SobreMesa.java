package punto_4;

public class SobreMesa extends Ordenador{
    private String Eslogan="Es el que mas pesa, pero el que menos cuesta";
    private String Descripcion;
    //CONSTRUCTORES
    public SobreMesa() {   
    }
    public SobreMesa(long codigo, double precio, String descripcion) {
        super(codigo, precio);
        this.Descripcion=descripcion;
    }
    //GETTER
    public String getDescripcion() {
        return Descripcion;
    }
    //SETTER
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    @Override
    public String toString() {
        System.out.println(this.Eslogan);
        return "Sobre mesa "+super.toString()+" peso: "+this.Descripcion;
    }
}
