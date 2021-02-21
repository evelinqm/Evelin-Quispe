/*
 * Suma.java
 *
 * Copyright 2021 Alumno <alumno@alumno-VirtualBox>
 *
 * Crea una función que devuelva la suma de dos números, pasados por parámetros.
 *
 *En este ejercicio usamos dos funiones;
 * 1-VOID que devuelve el resultado en pantalla, donde es necesario inicializar las variables que van a participar en este programa; ponemos numero 1, numero2 y resultado.
 * 2-INT es la función de suma, que debe ser mencionada en la función1  en mi caso he mencionado la suma dentro de la variable suma. a y b, pueden ser sustituidos por numero1 y numero2.
 *
 *
 */


public class Suma {

  public static void main (String[] args) {
    int numero1=4;
    int numero2=3;
    int resultado= suma(numero1,numero2);

    System.out.print("El resultado es"+ resultado);
  }
  public static  int suma(int a, int b) {
    return a+b;
  }

}

