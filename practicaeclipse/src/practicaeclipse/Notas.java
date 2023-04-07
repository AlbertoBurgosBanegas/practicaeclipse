package practicaeclipse;

import java.util.Scanner;

/**
 * Clase Notas, permite ingresar las notas de un estudiante, verificar si las
 * notas son válidas, calcular y mostrar el promedio y determinar si el
 * estudiante aprobó o no.
 */
public class Notas {

    // Declaración de variables
    double uf1, uf2, uf3;
    double acumu1, acumu2, acu3, def;

    // Scanner para la entrada de datos
    Scanner entrada = new Scanner(System.in);

    /**
     * Método para ingresar las notas del estudiante.
     */
    public void ingresaNotas() {
        System.out.println("Ingrese las notas del estudiante");

        System.out.print("Ingrese nota 1: ");
        uf1 = entrada.nextDouble();

        System.out.print("Ingrese nota 2: ");
        uf2 = entrada.nextDouble();

        System.out.print("Ingrese nota 3: ");
        uf3 = entrada.nextDouble();
    }

    /**
     * Método para comprobar la introducción correcta de las notas.
     */
    public void comprobacion() {
        if (uf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }

        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }

        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

    /**
     * Método para calcular la nota definitiva.
     */
    public void calculoNotas() {
        acumu1 = uf1 * 0.35;
        acumu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;

        def = acumu1 + acumu2 + acu3;
    }

    /**
     * Método para mostrar las notas y la nota definitiva.
     */
    public void mostrar() {
        System.out.println("Notas introducidas son:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);

        System.out.println("Acumulado 1 = " + acumu1);
        System.out.println("Acumulado 2 = " + acumu2);
        System.out.println("Acumulado 3 = " + acu3);

        System.out.println("Nota definitiva es = " + def);
    }

    /**
     * Método para determinar si el estudiante aprobó o no.
     */
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendido");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Error en las notas");
            }
        }
    }

    /**
     * Método principal para ejecutar la aplicación.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Notas fc = new Notas();

        fc.ingresaNotas();
        fc.comprobacion();

        fc.calculoNotas();

        fc.mostrar();

        fc.aprobado();

    }

}