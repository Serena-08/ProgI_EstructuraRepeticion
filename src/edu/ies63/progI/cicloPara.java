package edu.ies63.progI;

public class cicloPara {
  public static void main(String[] args) {

    /* for (para) son siclos determinados porque sabemos la cantidad de iteraciones
    Sintaxis:
    for(inicializador; condicion; incremento){
    }
     */

    for(int i = 0; i< 10 ; i++){
      System.out.println("Iteración nro " + i);
    }

    for (int j = 100; j > 0 ;){
      j --;
      System.out.println("Iteración nro " + j );
    }
  }
}
