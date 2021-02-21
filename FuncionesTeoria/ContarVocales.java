/*
 * ContarVocales.java
 *
 * Copyright 2021 Alumno <alumno@alumno-VirtualBox>
 *
 * Realiza una función que nos indique cuantas vocales tiene una frase.
 *
 *Muy importante con este tipo de ejercio usar JOptionPane y no Scanner ya que se cuentan los espacios
 */
import javax.swing.JOptionPane;

public class ContarVocales {

  public static void main (String[] args) {
    String texto=JOptionPane.showInputDialog(null,
                                              "inserta una frase",
                                              "insercion",
                                              JOptionPane.INFORMATION_MESSAGE);

      int vocales=contarVoc(texto.toLowerCase());

      System.out.println(vocales);
  }
  public static int contarVoc(String frase){
    char vocales []={ 'a','e','i','o','u'};
    int contador=0;
    char caracterActual;
    boolean esVocal;
    esVocal=false;
    for(int i=0;i<frase.length();i++){
      caracterActual=frase.charAt(i);

      for (int j=0; j<vocales.length && !esVocal; j++){
        if (caracterActual==vocales[j]){
          esVocal=true;
        } esVocal=false;

      }

      }
      if(esVocal=true){
        contador++;

    }
      return contador;
  }
}

