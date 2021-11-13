package com.sofka.traductor;

import java.io.*;
import java.util.Scanner;

public class Guardar {

    Scanner captura = new Scanner(System.in);

    public void escribir(String archivo, String texto) {

        try {
            FileWriter fichero = new FileWriter(archivo, true);

            fichero.write("\n" + texto + "\n");

            fichero.close();

            System.out.println("La palabra " + texto + " sera guardada para agregar su traduccion... Gracias!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void agregar(String archivo) {

        System.out.println("Introduce la palabra en español: ");
        String palabraEspaniol = captura.nextLine();
        System.out.println("Introduce la traduccion al ingles: ");
        String palabraIngles = captura.nextLine();

        try {
            FileWriter fichero = new FileWriter(archivo, true);

            fichero.write("\n\n" + palabraEspaniol + "\n" + "Se traduce como \"" + palabraIngles + "\"");

            fichero.close();

            System.out.println("La palabra \"" + palabraEspaniol + "\" ha sido agregada!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
