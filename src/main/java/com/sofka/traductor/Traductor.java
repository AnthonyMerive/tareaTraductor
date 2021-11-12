package com.sofka.traductor;

import java.io.*;

public class Traductor {

    public void leer(String archivo, String busqueda) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));

            String resultado = "";
            boolean encontrado = false;

            while ((resultado = reader.readLine()) != null) {

                if (resultado.toUpperCase().equalsIgnoreCase(busqueda)) {

                    resultado += " " +reader.readLine() + "\n";

                    System.out.println(resultado);

                    encontrado = true;
                    break;

                }

            }

            if(!encontrado) {

                System.out.println("\nPalabra no econtrada en nuestro diccionario");

                Guardar traduccion = new Guardar();

                traduccion.escribir("PalabrasGuardadas.txt", busqueda);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
