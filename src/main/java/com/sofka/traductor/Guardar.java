package com.sofka.traductor;

import java.io.*;

public class Guardar {

    public void escribir(String archivo, String palabra) {

        try {
            FileWriter fichero = new FileWriter(archivo);

            fichero.write(palabra);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
