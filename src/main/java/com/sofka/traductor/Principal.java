package com.sofka.traductor;

import java.io.*;

public class Principal {

    public static void main(String[] args) throws IOException {

        String palabraTraducir = "";

        System.out.println("Introduzca la palabra a traducir: ");

        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(entrada);

        try {
            palabraTraducir = buffer.readLine();
        } catch (IOException e) {
            System.out.println("Error");
        }

        Traductor palabras = new Traductor();

        palabras.leer("PalabrasIngles.txt");

        Guardar traduccion = new Guardar();

        traduccion.escribir("PalabrasGuardadas.txt", palabraTraducir);

    }
}
