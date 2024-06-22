/*
INSTRUCCIONES: Ingresar por teclado 10 números en un arreglo y mostrar el numero mayor y el numero menor.
*/

package arreglosejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncontrarNumeroMayorMenor {
    public static void main(String[] args) throws IOException {
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        // Declaramos el arreglo
        int[] numeros = new int[10];
        
        // Llenamos el arreglo de valores
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un numero: ");
            numeros[i] = Integer.parseInt(teclado.readLine());
        }
        
        // Comparamos cual es el menor y cual el mayor
        int numMenor = numeros[0];
        int numMayor = numeros[0];
        
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > numMayor){
                numMayor = numeros[i];
            }
            
            if(numeros[i] < numMenor){
                numMenor = numeros[i];
            }
        }
        
        // Mostramos los resultados
        System.out.println("Numero Mayor: " + numMayor);
        System.out.println("Numero Menor: " + numMenor);
    }
    
}
