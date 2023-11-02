package com.corenetworks.presentacion;

import com.corenetworks.modelo.Palabra;

import java.util.Scanner;

public class ProbarPalabras {
    public static void main(String[] args) {

        //leer por consola cada uno de los elementos


        //Definir variable
        Scanner teclado =new Scanner(System.in);
        String palabra;
        int elementos;
        //pedir el numero de palabras
        System.out.println("cuantas palabras-> ");
        elementos=teclado.nextInt();
        teclado.nextLine();

        Palabra p1 =new Palabra(elementos);

        //2.estructura
        //for (int i=0;i<p1.getPalabra().length;i++)
        for (int i=0;i<elementos;i++){
            System.out.println("escriba la palabra");
            p1.actualizaElemento(teclado.nextLine(),i);

        }
        for (String elemento:p1.getPalabra()){
            System.out.println(elemento);
        }




    }

}
