package com.lautadev.ejercicioslogica;

import java.util.Scanner;


/*

Programar en PSeInt un algoritmo que solicite al usuario un número entero 
que designa un periodo de tiempo expresado en segundos, y luego muestre 
el equivalente en días, horas, minutos y segundos.

60s -> 0 días, 1 minutos, 0 segundos
90s -> 0 días, 1 minutos, 30 segundos.
86400s -> 1 días, 0 minutos, 0 segundos.
86550s -> 1 días, 1 minuto, 30 segundos.

*/
public class calcularSegundosADias {
    
    public static void main(String[] args){
        System.out.println("Ingrese un numero entero para posteriormente mostrar el equivalente en días,minutos,segundos");
        Scanner teclado = new Scanner(System.in);
        int segundosIngresados = teclado.nextInt();
        
        int dia = 0;
        int minuto = 0;
        int segundo = 0;
        
        if(segundosIngresados < 60){
            segundo = segundosIngresados;          
            System.out.println(segundosIngresados+" es equivalente a "+dia+" dia/s, "+" con "+minuto+" minuto/s y "+segundo+" segundo/s");
        } else if(segundosIngresados >= 60 && segundosIngresados <  3600){
            segundo = segundosIngresados % 60;
            minuto = segundosIngresados / 60;                   
            System.out.println(segundosIngresados+" es equivalente a "+dia+" dia/s, "+" con "+minuto+" minuto/s y "+segundo+" segundo/s");
        } else if(segundosIngresados > 60){
            segundo = segundosIngresados % 60;
            //Minutos auxiliares para ayudar a calcular la totalidad de horas.
            int minutoAux = segundosIngresados / 60; 
            //Horas auxiliares para ayudar a calcular la totalidad de dias.
            int horaAux = minutoAux / 60;
            dia = horaAux / 24;
            minuto = minutoAux % 60;
            System.out.println(segundosIngresados+" es equivalente a "+dia+" dia/s, "+" con "+minuto+" minuto/s y "+segundo+" segundo/s");
        }
    }
}
