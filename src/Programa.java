import gal.cifpacarballeira.SecuenciaNumeros;
import java.util.Scanner;

/**
 * Ejercicio 2 de Tarea del Bloque de Contenidos 5
 *
 * @author Donato Ramos Martínez
 */
public class Programa {

    /**
     * Hacer un programa en el que se declare un objeto de la clase
     * SecuenciaNumeros. Crear el objeto con un valor para numero leído por
     * teclado. Escribir a continuación la longitud de ciclo del número, así
     * como la secuencia de valores hasta llegar a 1. Crear otro objeto
     * utilizando el constructor por defecto. Darle a continuación a la
     * propiedad número el valor 89, y escribir la secuencia para ese valor
     *
     * @param args No se necesitan argumentos para el método principal
     * @exception RuntimeException Se genera cuando introducimos un valor que
     * es inferior a 1 o no es numérico.
     */
    public static void main(String[] args) throws RuntimeException {
        // Declaración de variables
        boolean ok = false; // Booleano para controlar la entrada de datos
        Scanner leer = new Scanner(System.in);

        // Declaramos un Objeto de la clase SecuenciaNumeros
        
        /* 
        miObjeto, en la declaración tiene que apuntar a null ya que sino el
        IDE nos marca error.
        */
        SecuenciaNumeros miObjeto = null;
        /*
        Ahora instanciaremos el objeto mediante un valor numérico leído por
        teclado.
         */
        do {
            try {
                System.out.print("Introduzca un valor entero mayor o igual que"
                        + " 1: ");
                miObjeto = new SecuenciaNumeros(leer.nextInt());
                System.out.println("Objeto creado correctamente");
                ok = true;
            } catch (RuntimeException ex) {
                leer.nextLine();
                System.out.println("Valor introducido incorrecto");
            }
        } while (ok == false);

        // Escribiremos ahora la longitud del ciclo del número
        System.out.printf("La longiutud del ciclo del número %d es %d\n",
                miObjeto.getNumero(), miObjeto.getLongitudCiclo());

        // Escribimos ahora la secuencia de valores hasta llegar a 1
        miObjeto.escribeSecuencia();

        // Creamos otro objeto utilizando el constructor por defecto
        // Para ello realizaremos la declaración e instanciación a la vez
        SecuenciaNumeros miNuevoObjeto = new SecuenciaNumeros();

        // Le daremos el valor 89 al atributo numero
        miNuevoObjeto.setNumero(89);

        // Por último escribiremos la secuencia por pantalla
        miNuevoObjeto.escribeSecuencia();

    }

}
