package utp.edu;

//Se debe importar
import java.util.List;

import java.util.ArrayList;

/**
 * Listas: Conjunto o arreglo o estructura de datos dimanica y crece deacuerdo a
 * la cantidad de elementos que nosotros le estemos ingresando y si eliminamos 1
 * tambien reduce su tamaño Una lista puede ser de dato primitivo o puede ser de
 * tipo de objetos o clases
 */
public class App {
    public static void main(String[] args) {

        // PRIMER EJERCICIO
        // Crear una lista
        List<Integer> Numeros;

        // // Inicializar una lista
        Numeros = new ArrayList<>();

        // Agregar un numero

        Numeros.add(1);
        Numeros.add(15);
        Numeros.add(21);

        // // get es para acceder a la posicion
        // System.out.println(Numeros.get(0));
        // System.out.println(Numeros.get(1));
        // System.out.println(Numeros.get(2));

        // // Remover un elemento con la posicion
        // Numeros.remove(1);
        // System.out.println(Numeros);

        // System.out.println(Numeros.contains(1));

        // SEGUNDO EJERCICIO
        // List<String> Nombres;
        // Nombres = new ArrayList<>();

        // Nombres.add("Luisa");
        // Nombres.add("Pedro");
        // Nombres.add("Juan");

        // // para saber el tamaño de la lista
        // System.out.println(Nombres.size());

        // // Evalua si el elemento se encuetra
        // System.out.println(Nombres.contains("Luisa"));

    }
}
