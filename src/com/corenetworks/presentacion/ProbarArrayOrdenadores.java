package com.corenetworks.presentacion;

import com.corenetworks.modelo.Ordenador;

public class ProbarArrayOrdenadores {
    public static void main(String[] args) {
        //instanciar clase
        String [] nombres =new String[4];
        for (int i=0;i< nombres.length;i++){
            nombres[i]="juan";

        }

        Ordenador[] ordenadores=new Ordenador[4];
        for (int i=0;i< ordenadores.length;i++){
            ordenadores[i]=new Ordenador("1230","gamer",true);

        }
        for (Ordenador elemento:ordenadores
             ) {
            System.out.println(elemento);

        }


    }
}
