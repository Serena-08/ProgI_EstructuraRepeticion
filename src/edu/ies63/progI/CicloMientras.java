package edu.ies63.progI;

import java.util.Scanner;
import java.util.logging.Logger;

public class CicloMientras {
  static final Logger log =
      Logger.getLogger(CicloMientras.class.getName());

  public static void main(String[] args) {

    /*
  Minetras son inderterminados y se respiten mientras
  se cumpla la ocndicion
   */

    //SINTAXIS: while(Condicion)

    String continua = "Si";
    Scanner sc = new Scanner("System.in");

    int nro = 0;
    //Repite mientras que la variable continua es igual a Si
    while (continua.equals("Si")){
      //Para asegurar que la condicion se haga falsa en algun momento
      log.info("Desea continuar?  Si/ No");
      continua = sc.nextLine();
      System.out.println(++nro);
    }

    int contador = 100;
    while (contador > 0){
      log.info("Iteracion nro " + contador);
      contador --;
    }
  }

}
