/*
INSTRUCCIONES: En un arreglo, mostrar los datos de un usuario ( nombre, edad y sexo).
*/
package arreglosejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MostrarDatosUsuario {
    public static void main(String[] args) throws IOException {
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        // Creamos los arreglos que almacenarán los datos
        String[] nombre;
        int[] edad;
        char[] sexo;
        
        // Preguntamos cuantos usuario se van a registrar
        System.out.println("Cuantos usuarios se van a registrar? ");
        int cantUsuarios = Integer.parseInt(teclado.readLine());
        
        
        // Establecemos el tamaño del arreglo
        nombre = new String[cantUsuarios];
        edad = new int[cantUsuarios];
        sexo = new char[cantUsuarios];
        
        // Llenamos de datos los arreglos
        for(int i = 0; i < nombre.length; i++){
            System.out.println("Ingresa el nombre: ");
            nombre[i] = teclado.readLine();
            System.out.println("Ingresa la edad: ");
            edad[i] = Integer.parseInt(teclado.readLine());
            System.out.println("Ingresa el sexo: (M = Masculino/F = Femenino)");
            sexo[i] = teclado.readLine().charAt(0);
        }
        
        // Mostramos los datos
        System.out.println("Nombre      Edad        Sexo");
        System.out.println("_____       ____        ____");
        for(int i = 0; i < nombre.length; i++){
            System.out.println(nombre[i] + "\t\t" + edad[i] + "\t\t" + sexo[i]);
        }
        
    }
    
}
