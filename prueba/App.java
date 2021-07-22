public class App {
    public static void main(String[] args) {

        // instanciones el objeto de la clase Nota
        Nota nota = new Nota(3, 1, 4, 5);

        
        nota.calcularNotaFinal();

        String gano = nota.ganoOPerdio();
        
        System.out.println(gano);

    }
}