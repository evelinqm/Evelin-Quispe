/*
 * Booleano.java
 *
 * Copyright 2021 Alumno <alumno@alumno-VirtualBox>
 *
 *Crea una función que indique si el número es mayor o menor que cero
 *
 *En este ejercico, tenemos dos funciones;
 * 1. con la variable num y un if, el if  en lugar de usar (num>0) usamos mayor0()
 */


public class Booleano {

  public static void main (String[] args) {

    int num=-8;

    if(mayor0(num)){

      System.out.print("El número"+ " "+num+ " "+"es mayor que 0");
    }else{
      System.out.print("El número"+ " "+num+ " "+"es menor que 0");
    }


  }

  public static boolean mayor0(int num) {
     return(num>0);

  }
}

