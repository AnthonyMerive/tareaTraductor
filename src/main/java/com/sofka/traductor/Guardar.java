package com.sofka.traductor;

import java.io.*;

public class Guardar {

    public void escribir(String archivo, String texto) {

        try {
            FileWriter fichero = new FileWriter(archivo, true);

            fichero.write("\n"+texto+"\n");

            fichero.close();

            System.out.println("La palabra "+texto+" sera guardada para agregar su traduccion... Gracias!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
