package it.unimi.di.sweng.slalom.model;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Model {


  // TODO completare modello dati

  public void readFilePrimaManche(@NotNull Scanner s) {
    while (s.hasNextLine()) {
      String linea = s.nextLine();
      String[] el = linea.split(";");
      String name = el[0];
      double time = Double.parseDouble(el[1]);


      // TODO memorizzare quanto letto
    }
  }

}
