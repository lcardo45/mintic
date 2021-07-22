package utp.edu;

import java.util.Scanner;

/**
 * Enum imita una clase en donde tenemos muchas constantes las podemos tener
 * todas en una clase
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un dia de la semana");
        String dia = sc.next();
        // valueOf lo que hace es que le pasa el literal (LUNES) y te devuelve el enum
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
        switch (diaS) {

            case LUNES:

            case MARTES:

            case MIERCOLES:

            case JUEVES:

            case VIERNES:
                System.out.println("El dia " + diaS + " es laborable");
                break;

            case SABADO:

            case DOMINGO:
                System.out.println("El dia " + diaS + " no es laborable");
                break;

            default:
                System.out.println("El dia es incorrecto");
        }
    }
}
