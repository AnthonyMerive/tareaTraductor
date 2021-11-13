package com.sofka.traductor;

import java.io.*;
import java.util.Scanner;

public class Traductor {

    Scanner captura = new Scanner(System.in);
    String resultado = "";

    public void leer(String archivo) {

        try {

            System.out.println("Introduce una palabra: ");
            String busqueda = captura.nextLine();

            BufferedReader reader = new BufferedReader(new FileReader(archivo));

            boolean encontrado = false;

            while ((resultado = reader.readLine()) != null) {

                if (resultado.toUpperCase().equalsIgnoreCase(busqueda)) {

                    resultado += " " + reader.readLine() + "\n";

                    System.out.println(resultado);

                    encontrado = true;
                    break;

                }

            }

            if (!encontrado) {

                System.out.println("\nPalabra no econtrada en nuestro diccionario");

                Guardar traduccion = new Guardar();

                traduccion.escribir("PalabrasGuardadas.txt", busqueda);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrar(String archivo) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));

            while (resultado != null) {

                resultado = reader.readLine();

                if (resultado == null) break;

                System.out.println(resultado);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
