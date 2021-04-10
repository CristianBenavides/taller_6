
package punto_4;

public class Portatil extends Ordenador{
    private String Eslogan="Ideal para tus viajes";
    private double peso;
    //CONSTRUCTORES
    public Portatil() {   
    }
    public Portatil(long codigo, double precio, double peso) {
        super(codigo, precio);
        this.peso=peso;
    }
    //GETTERS
    public String getEslogan() {
        return Eslogan;
    }

    public double getPeso() {
        return peso;
    }
    //SETTER
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        System.out.println(this.Eslogan);
        return "Portatil "+super.toString()+" peso: "+this.peso+"kg";
    }
    
}
