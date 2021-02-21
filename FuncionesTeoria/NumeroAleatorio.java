/*
 * NumeroAleatorio.java
 *
 * Copyright 2021 Alumno <alumno@alumno-VirtualBox>
 *
 * Crea una función que devuelva un número aleatorio entre dos números enteros que nosotros le demos
 *
 *Este esta mal
 *
 *
 */

import java. util.Scanner;
public class NumeroAleatorio {

  public static void main (String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce el rango menor");
    int minimo=s.nextInt();
    System.out.println("Introduce el rango mayor");
    int maximo=s.nextInt();

    numAleatorio(minimo,maximo);

    for(int i=0;i<20;i++){

      System.out.println(numAleatorio(minimo,maximo));
    }



  }

  public static int numAleatorio ( int minimo, int maximo){

    return (int )Math.random()*(minimo-(maximo+1))+(maximo+1);



  }
}

