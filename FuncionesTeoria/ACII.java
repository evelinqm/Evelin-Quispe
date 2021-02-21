/*
 * ACII.java
 *
 * Copyright 2021 Alumno <alumno@alumno-VirtualBox>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *Crea una función que nos devuelva el número ASCII de un carácter pasado por parámetro
 *
 *
 *
 */


public class ACII {

  public static void main (String[] args) {
    char caracter='a';
    System.out.print("El caracter"+ " "+ caracter+ " "+"tiene asociado el código"+ " "+ ASCII(caracter));

  }
  public static int ASCII(char caracter){
    return (int)caracter;

  }

}

