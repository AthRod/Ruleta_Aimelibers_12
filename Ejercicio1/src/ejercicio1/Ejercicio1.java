/*
Arreglo de Objetos
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Athziri
 */
public class Ejercicio1 {
    
     private int contador = -1, tope = 22;
     private Datos alumnos[] = new Datos[tope];
     private ArrayList<Integer> numbers = new ArrayList<>(tope);
    
    
    
     /**
      * Método para obtener número de lista al azar y reestablecer lista
      * @return tipo entero
      */
    public int elegir_al_azar(){
        if(contador==tope){
            Collections.shuffle(numbers);
            contador=-1;
        }
        contador++;
        return alumnos[numbers.get(contador)].numeroDeLista;
    }
    
    /**
     * PONER PRIMERO EN EL MAIN
     * Método para inicializar la lista de números al azar
     */
    public void inicializarArrayList(){
        for (int i=1;i<tope;i++){
                numbers.add(i);
        }
        Collections.shuffle(numbers);
    }    
    
   /**
     * Método para validar si el número es tipo flotante o no, independientemente de la presencia del punto o no
     * @param cadena tipo String
     * @return tipo boolean, true= número flotante, false= no flotante
     */
    public boolean esNumEntero(String cadena){
        try { //Intenta convertirlo a doble y si no hay error retorna verdadero
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e){ //Si sí hay error retorna falso
            return false;
        }
    }
    /**
     * Metodo para validar si solo tiene caracteres (Acepta acentos)
     * @param cadena String
     * @return entero
     * Si regresa 1 todos son caracteres y si regresa 0 incluye numeros y caracteres especiales
     */
    public int tieneNumConEspacio(String cadena){//Método para validar números y espacios
        int b=5;
        for(int i=0; i<cadena.length(); i++){
            int a= cadena.charAt(i);
            if(((a<91)&&(a>64))||((a<123)&&(a>96))||(a==193)||(a==201)||(a==205)||(a==211)||(a==218)||(a==225)||(a==233)||(a==237)||(a==243)||(a==250)||(a==32)){
                b=1; //Es letra
            } else {
                b=0; //Tiene un número
                break;
            }
        }//Cerrar ciclo for
        return b;
    }
    
    
   
    
}
