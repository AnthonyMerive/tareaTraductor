package com.sofka.traductor;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese la palabra a traducir: ");
        String palabraTraducir = captura.nextLine();

        //Traductor de palabras:
        Traductor palabras = new Traductor();
        palabras.leer("PalabrasIngles.txt", palabraTraducir);

    }
}
