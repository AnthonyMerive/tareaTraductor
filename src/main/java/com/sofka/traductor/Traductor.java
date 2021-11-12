package com.sofka.traductor;

import java.io.*;


public class Traductor {

    public void leer (String archivo){
        try {
            FileReader reader = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(reader);

            String resultado="";

            while(resultado!=null){

                resultado = buffer.readLine();

                if(resultado==null) break;

                System.out.println(resultado);
            }

            reader.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
