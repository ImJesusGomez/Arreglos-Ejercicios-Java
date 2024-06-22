
package arreglosejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LetraYCantidadDeLetras {
    public static void main(String[] args) throws IOException {
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        // Preguntamos al usuario una palabra
        System.out.print("Introduce una palabra: ");
        String palabra = teclado.readLine();
        
        // Calculamos el tamaño de la palabra
        int tamPalabra = palabra.length();
        
        
        // Creamos un arreglo para que cada letra este en el
        char[] letrasPalabra = new char[tamPalabra];
        
        // Usamos un ciclo for para llenar el arreglo por cada letra de la palabra
        for(int i = 0; i < letrasPalabra.length; i++){
            letrasPalabra[i] = palabra.charAt(i);
        }
        
        // Mostramos las letras de la palabra
        System.out.println("Letras: ");
        for(int i = 0; i < letrasPalabra.length; i++){
            System.out.println(letrasPalabra[i]);
        }
        
        System.out.println("Cantidad de letras: " + tamPalabra);
        
    }
    
}
