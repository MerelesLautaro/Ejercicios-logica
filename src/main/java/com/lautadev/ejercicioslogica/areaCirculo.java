package com.lautadev.ejercicioslogica;

import java.util.Scanner;

/*
Programar en PSeInt un algoritmo que calcule el área 
y el perímetro de un círculo en función del radio que indique el usuario.

Para calcular el área y el perímetro de un círculo en función del radio, se puede usar estas fórmulas:

Área: El área ( A ) de un círculo se calcula con la fórmula:

A=πr2
donde ( r ) es el radio del círculo y ( \pi ) (pi) es una constante aproximadamente igual a 3.14159.

Perímetro: El perímetro ( P ), también conocido como la circunferencia, se calcula con la fórmula:

P=2πr
donde ( r ) es el radio del círculo.


*/
public class areaCirculo {
    
    public static void main(String[] args){
        System.out.println("Ingrese el radio: ");
        Scanner teclado = new Scanner(System.in);
        double radio = teclado.nextDouble();
        
        double area = 3.14159 * radio * radio;
        double perimetro = 2 * 3.14159 * radio;
        
        System.out.println("El area es: "+area+" y el perimetro es: "+perimetro);
    }
}
