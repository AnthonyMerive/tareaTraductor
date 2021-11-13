package com.sofka.traductor;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int op = -1;
        Scanner captura = new Scanner(System.in);

        while (op != 0) {

            try {

                System.out.println(
                        "\n\nDiccionario Sofka Español-Ingles: \n\n " +
                                "1. Traducir palabra\n " +
                                "2. Agregar palabra\n " +
                                "3. Ver diccionario\n " +
                                "4. Ver palabras sin agregar\n " +
                                "0. Salir\n");

                System.out.println("Ingrese una opcion: ");
                op = captura.nextInt();

                switch (op) {

                    case 1:

                        System.out.println("\n- Eligio Buscar Palabra en el diccionario\n");

                        Traductor palabras = new Traductor();
                        palabras.leer("PalabrasIngles.txt");

                        break;

                    case 2:

                        System.out.println("\n- Eligio Agregar Palabra al diccionario\n");

                        Guardar palabra = new Guardar();
                        palabra.agregar("PalabrasIngles.txt");

                        break;

                    case 3:

                        System.out.println("\n- Eligio Visualizar Diccionario\n");

                        Traductor diccionario = new Traductor();
                        diccionario.mostrar("PalabrasIngles.txt");

                        break;

                    case 4:

                        System.out.println("\n- Eligio Visualizar Palabras por Agregar\n");

                        Traductor traducir = new Traductor();
                        traducir.mostrar("PalabrasGuardadas.txt");

                        break;
                    default:
                        System.out.println("Opcion invalida");

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
