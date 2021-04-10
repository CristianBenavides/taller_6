package punto_4;

public class main {
    public static void main(String[] args) {
        Ordenador o1 = new Ordenador(23, 244);
        Portatil p1 = new Portatil(230, 200, 34);
        SobreMesa Sm = new SobreMesa(124, 513, "con un gabinete con luces retroalimentadas");
        System.out.println(o1);
        System.out.println(p1);
        System.out.println(Sm);
    }
}
