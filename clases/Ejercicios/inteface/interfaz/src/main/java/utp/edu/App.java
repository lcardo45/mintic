package utp.edu;

/**
 * Interface especie de forma en la que obligamos a implementar ciertos metodos
 *
 */
public class App {
    public static void main(String[] args) {
        Carro c = new Carro();
        Bicicleta b = new Bicicleta();
        c.avanzar();
        b.avanzar();
    }
}
