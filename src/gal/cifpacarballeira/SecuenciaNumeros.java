package gal.cifpacarballeira;

/**
 * Ejercicio 1 de la Tarea del Bloque de Contenidos 5
 * @author Donato Ramos Martínez
 */
public class SecuenciaNumeros {
    // Atributos
    private int numero; // Número para trabajar
    private int longitudCiclo; // Longitud total del ciclo
    
    /**
     * Constructor por defecto de la clase
     */
    public SecuenciaNumeros(){
        
    }
    
    /**
     * Constructor al que se le pasa un argumento
     * @param numero Es el argumento a pasarle. Tiene que ser un entero mayor o 
     * igual que 1
     * @throws RuntimeException Se genera una excepción si el número es menor
     * que 1
     */
    public SecuenciaNumeros(int numero) throws RuntimeException{
        if(numero>=1){
            this.numero=numero;
            longitudCiclo();
        }
        else throw new RuntimeException("Tiene que ser mayor o igual que 1");
    } 
    
    // Métodos de la clase
    
    /**
     * Método que realiza el cálculo de la longitud de la secuencia
     */
    private void longitudCiclo(){
        int valor=this.numero;
        boolean finBucle=false;
        while(finBucle==false){
            longitudCiclo++;
            if(valor!=1){
                if(valor%2==0) valor/=2;
                else valor=(3*valor)+1;
            }
            else finBucle=true;
        } 
    }
    
    /**
     * método que escribe en pantalla la secuencia
     */
    public void escribeSecuencia(){
         int valor=this.numero;
         boolean finBucle=false;
         System.out.print(valor);
         while(finBucle==false){
             if(valor!=1){
                 System.out.print(",");
                 if(valor%2==0) valor/=2;
                 else valor=(3*valor)+1;
                 System.out.print(valor);
             }
             else finBucle=true;
         }
         System.out.println();
    }

    // Getters y Setters
    
    /**
     * Getter del atributo numero
     * @return Devuelve el valor del atributo numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Setter que nos permite introducir un valor nuevo para el atributo numero
     * @param numero Valor a modificar en el atributo numero
     * @throws RuntimeException Se genera la excepción cuando el número es 
     * menor o igual que 1.
     */
    public void setNumero(int numero) throws RuntimeException {
        if(numero>=1){
            this.numero = numero;
        }
        else throw new RuntimeException("Tiene que ser mayor o igual que 1");        
    }

    /**
     * Getter que nos devuelve el valor del atributo longitudCiclo
     * @return 
     */
    public int getLongitudCiclo() {
        return longitudCiclo;
    }
    
    /* 
    No tiene sentido hacer un Setter para el atributo longitudCiclo ya que 
    se calcula automáticamente.
    */
}
