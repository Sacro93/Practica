package org.uf2;

/*Pedir 2 numeros al usuario
* introducir numeros aleatorios hasta que introduzca un 0
* o = finalizar ejecucion y print pantalla suma de todos aquellos numeros que hayan caido dentro del intervadlo
*
* funcion imprimir()
* funcion estaDentroIntervalo*/

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

        public static void main(String[] args) {


            //crear un array list de numeros enteros
            ArrayList<Integer> numeros = new ArrayList<>();

            numeros.add(2,5);

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingresa numeros enteros , el  0 termina la operacion ");


        }
}