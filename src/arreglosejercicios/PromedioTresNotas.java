/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Microsoft Windows 10
 */
public class PromedioTresNotas {

    public static void main(String[] args) throws IOException {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        // Declaramos los arreglos
        double[] notasMatematicas, notasLiteratura, notasCiencias;

        // Declaramos las variables que usaremos para la suma y promedio de las notas
        double sumaMatematicas = 0, sumaLiteratura = 0, sumaCiencias = 0;
        double promedioMatematicas, promedioLiteratura, promedioCiencias;

        // Preguntamos cuantos notas se van a registrar por cada asignatura
        System.out.println("Cuantas notas de matematicas vas a registrar? ");
        int cantNotasMatematicas = Integer.parseInt(teclado.readLine());
        notasMatematicas = new double[cantNotasMatematicas];

        System.out.println("Cuantas notas de literatura vas a registrar? ");
        int cantNotasLiteratura = Integer.parseInt(teclado.readLine());
        notasLiteratura = new double[cantNotasLiteratura];

        System.out.println("Cuantas notas de ciencias vas a registrar? ");
        int cantNotasCiencias = Integer.parseInt(teclado.readLine());
        notasCiencias = new double[cantNotasCiencias];

        // Llenamos los arreglos 
        System.out.println("Notas de Matematicas: ");
        for (int i = 0; i < notasMatematicas.length; i++) {
            System.out.println("Ingresa la nota: ");
            notasMatematicas[i] = Double.parseDouble(teclado.readLine());
            sumaMatematicas += notasMatematicas[i];
        }
        
        System.out.println();

        System.out.println("Notas de Literatura");
        for (int i = 0; i < notasLiteratura.length; i++) {
            System.out.println("Ingresa la nota: ");
            notasLiteratura[i] = Double.parseDouble(teclado.readLine());
            sumaLiteratura += notasLiteratura[i];

        }
        
        System.out.println();

        System.out.println("Notas de Ciencias");
        for (int i = 0; i < notasCiencias.length; i++) {
            System.out.println("Ingresa la nota: ");
            notasCiencias[i] = Double.parseDouble(teclado.readLine());
            sumaCiencias += notasCiencias[i];

        }

        // Realizamos los calculos
        promedioMatematicas = (sumaMatematicas / notasMatematicas.length);
        promedioLiteratura = (sumaLiteratura / notasLiteratura.length);
        promedioCiencias = (sumaCiencias / notasCiencias.length);

        System.out.println();
        
        // Mostramos las notas
        System.out.println("PROMEDIO DE NOTAS: ");
        System.out.println("Promedio de Matematicas: " + promedioMatematicas);
        System.out.println("Promedio de Literatura: " + promedioLiteratura);
        System.out.println("Promedio de Ciencias: " + promedioCiencias);
    }

}
