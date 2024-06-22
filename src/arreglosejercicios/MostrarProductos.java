/*
INSTRUCCIONES: 1.- Empleando arreglos, mostrar n productos con sus respectivos precios.
*/
package arreglosejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MostrarProductos {
    public static void main(String[] args) throws IOException{
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        // Declaramos los arreglos que almacenaran el nombre y precio de los productos
        String[] nombreProducto;
        double[] precioProducto;
        
        // Preguntamos cuantos productos se van a agregar
        System.out.println("Cuantos productos deseas agregar? ");
        int cantProductos = Integer.parseInt(teclado.readLine());
        
        // Definimos el tamaño del arreglo
        nombreProducto = new String[cantProductos];
        precioProducto = new double[cantProductos];
        
        // Usamos un ciclo for para llenar de datos el arreglo
        for(int i = 0; i < nombreProducto.length; i++){
            System.out.println("Ingresa el nombre del producto: ");
            String nombre = teclado.readLine();
            nombreProducto[i] = nombre;
            System.out.println("Ingresa el precio del producto: ");
            double precio = Double.parseDouble(teclado.readLine());
            precioProducto[i] = precio;
        }
        
        
        // Mostramos los productos y su precio
        System.out.println("LISTA DE PRODUCTOS: \n");
        for(int i = 0; i < nombreProducto.length; i++){
            System.out.print(nombreProducto[i] + "\t$" + precioProducto[i]);
            System.out.println();
        }
    }
    
}
