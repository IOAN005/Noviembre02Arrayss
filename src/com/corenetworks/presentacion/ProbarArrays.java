package com.corenetworks.presentacion;

import java.util.Scanner;

public class ProbarArrays {
    public static void main(String[] args) {
        //Definir un Arayy de 5lrtra -char
        char[] letras = new char[5];

        letras[0] = 'a';
        letras[1] = 'e';
        letras[2] = 'i';
        letras[3] = '0';
        letras[4] = 'u';

        char letra = 'a';

        for (int i = 0; i < letras.length; i++) {
            System.out.println("elemento" + i + "->" + letras[i]);
        }
        for (char elemento : letras) {
            System.out.println(elemento);
        }
        //Definir un array de String de 3 elementos
        //pedir por consola los 3 elementos

        String[] elementos = new String[3];
        elementos[0] = "cabana";
        elementos[1] = "lago";
        elementos[2] = "bosque";
        Scanner teclado =new Scanner(System.in);


        for (int i=0;i< elementos.length;i++){
            System.out.println("escriba la palabra -->");
            elementos[i]=teclado.nextLine();

        }
        //comprobacion
        for (String elemento:elementos){
            System.out.println(elemento);
        }




    }
}
