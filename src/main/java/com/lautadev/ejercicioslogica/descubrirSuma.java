package com.lautadev.ejercicioslogica;

import java.util.Scanner;

/*
Representar en un DFD un algoritmo que lea tres números y descubra si uno
de ellos es la suma de los otros dos.
 */
public class descubrirSuma {

    public static void main(String[] args) {

        int[] numeros = new int[3];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese los valores para descubrir la suma");
            int num = teclado.nextInt();
            numeros[i] = num;
        }
        
        // [3,2,1]
        for (int x = 0; x < numeros.length; x++) {
            //[3] [2] [1]
            int numeroAdescubrir = numeros[x];
            
            System.out.println("Numero a descubrir es: "+numeroAdescubrir);
            for (int e = 0; e < numeros.length; e++) {
                for (int i = 0; i < numeros.length; i++) {
                    //suma = [3+3] , [3+2], [3+1]
                    //suma = [2+3] , [2+2], [2+1]
                    //suma = [1+3] , [1+2], [1+1] 
                    int suma = numeros[e] + numeros[i];
                    System.out.println("Suma es: "+suma);
                    if (suma == numeroAdescubrir) {
                        System.out.println("El numero descubierto es: " + numeroAdescubrir + 
                                           " que se logra sumando: " + numeros[e] + " + " + numeros[i]);
                    }
                }
            }
        }
    }
}
