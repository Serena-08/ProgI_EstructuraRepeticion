package edu.ies63.progI;

import java.util.Scanner;
import java.util.logging.Logger;

public class CicloHacerMientras {
  public static final Logger log =
      Logger.getLogger(CicloHacerMientras.class.getName());

  public static void main(String[] args) {
    //Hacer mientras, asegura que las instrucciones que se van a repetir, sejecuten al menos una vez

    /*
    Sintaxix;

    do{

    }while(Condicion)
     */

    Scanner sc = new Scanner(System.in);
    String continua = "";
    int nroIteracion = 0;
    do {
      log.info("Desea continua ? Si/No");
      continua = sc.nextLine();
      log.info("Iteracion nro " + ++nroIteracion);
    }while (continua.equals("Si"));
  }
}
