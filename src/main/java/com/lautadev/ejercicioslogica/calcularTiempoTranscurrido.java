package com.lautadev.ejercicioslogica;

import java.util.Scanner;


/*Programar en PSeInt un algoritmo que solicite al usuario dos horarios del día (hora y minuto) 
y calcule el tiempo transcurrido entre ellos (indicando la cantidad de horas y minutos). 
Tener en cuenta que el usuario puede indicar primero la hora más tardía y luego la hora más temprana:
Ejemplo:
"Ingresar el primer horario (primero la hora, luego los minutos)"
15
40
"Ingresar el segundo horario (primero la hora, luego los minutos)"
16
50
"El tiempo transcurrido es 1 hora, 10 minutos"*/
public class calcularTiempoTranscurrido {

    public static void main(String[] args) {

        boolean confirmacion = true;

        while (confirmacion) {

            System.out.println("Ingrese la 1° Hora");
            Scanner teclado = new Scanner(System.in);
            int hora = teclado.nextInt();

            System.out.println("Ingrese el 1°  Minutos");
            int minutos = teclado.nextInt();

            System.out.println("Ingrese la 2° Hora");
            int segundaHora = teclado.nextInt();

            System.out.println("Ingrese el 2° Minutos");
            int segundoMinutos = teclado.nextInt();

            /* El algoritmo debe contemplar las siguientes situaciones:
            1. Que la primera hora ingresada sea menor/igual a la segunda hora y sus 2
            respectivas "variantes" 
                a. que los minutos sean menor/igual al segundo minutos ingresados
                b. y/o los minutos ingresados sean mayores a los segundos minutos ingresados.
        
            2. Que la primera hora ingresada sea mayor a la segunda hora y sus 2
            respectivas "variantes" 
                a. que los minutos sean menor/igual al segundo minutos ingresados
                b. y/o los minutos ingresados sean mayores a los segundos minutos ingresados.                       
             */
            if (hora <= segundaHora) {
                if (minutos <= segundoMinutos) {
                    int horaTranscurrida = segundaHora - hora;
                    int minutosTranscurridos = segundoMinutos - minutos;

                    System.out.println("El tiempo transcurrido es de: " + horaTranscurrida + " hora/s, con: " + minutosTranscurridos + " minutos");
                } else if (minutos >= segundoMinutos) {
                    // Se le resta 1 a las horas transcurridas debido a que la 1° hora es menor a la 2° hora.
                    int horaTranscurrida = segundaHora - hora - 1;
                    // como los 1° minutos ingresados son menores a los 2° minutos ingresados, se sigue la siguiente logica:
                    // ejemplo: 60(minutos que tiene una hora) - 45 (1° minutos ingresados) + 5 (2° minutos ingresados)
                    // el resultado nos daria 50 minutos // ya que si seguimos la logica anterior nos daria -40 lo cual no es correcto.
                    int minutosTranscurridos = (60 - minutos) + segundoMinutos;

                    System.out.println("El tiempo transcurrido es de: " + horaTranscurrida + " hora/s, con: " + minutosTranscurridos + " minutos");
                }
            } else if (hora >= segundaHora) {
                if (minutos <= segundoMinutos) {
                    // en caso que la hora sea mayor no podemos simplemente restar la segunda hora como en el ejemplo (classroom)
                    // ej: 16:00 - 13:00 = -3, hay que considerar que un dia tiene 24 horas. lo correcto seria decir que pasaron 21 horas.
                    int horaTranscurrida = (24 - hora) + segundaHora;
                    int minutosTranscurridos = segundoMinutos - minutos;

                    System.out.println("El tiempo transcurrido es de: " + horaTranscurrida + " hora/s, con: " + minutosTranscurridos + " minutos");
                } else if (minutos >= segundoMinutos) {
                    // para sacar las horas transcurridas sigue una logica similar a la anterior pero restandole -1 ya que aqui entra 
                    // el factor de los 1° minutos ingresados siendo mayores a los 2° minutos ingresados.
                    int horaTranscurrida = (24 - hora) + segundaHora - 1;
                    int minutosTranscurridos = (60 - minutos) + segundoMinutos;

                    System.out.println("El tiempo transcurrido es de: " + horaTranscurrida + " hora/s, con: " + minutosTranscurridos + " minutos");
                }
            }

            System.out.println("Desea seguir ejecutando el programa? Y/N");
            teclado.nextLine();
            String confirmacionUsuario = teclado.nextLine();
            if (confirmacionUsuario.equals("N")) {
                confirmacion = false;
            }
        }
    }
}
