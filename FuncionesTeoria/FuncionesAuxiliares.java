/*
 * FuncionesAuxiliares.java
 * FuncionesAuxiliares
 * Copyright 2021 Alumno <alumno@alumno-VirtualBox>
 */


public class FuncionesAuxiliares {
	public static boolean esPrimo(int numero){
    if (numero<=1){
      return false;
    }
    for(int i=(int)Math.sqrt(numero);i>1;i--){

      if (numero%i==0){
        return false;
        }
    }
     return true;
  }
  
  public static boolean esPrimo(int numero){
    if (numero<=1){
      return false;
    }
    for(int i=(int)Math.sqrt(numero);i>1;i--){

      if (numero%i==0){
        return false;
        }
    }
     return true;
  }
	
}

