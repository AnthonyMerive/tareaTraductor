package com.sofka.traductor;

import java.io.*;

public class Guardar {

    public void escribir(String archivo, String texto) {

        try {
            FileWriter fichero = new FileWriter(archivo, true);

            fichero.write("\n"+texto+"\n");

            fichero.close();

            System.out.println("agregado "+texto+" con exito");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
