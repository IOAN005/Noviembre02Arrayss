package com.corenetworks.presentacion;

import com.corenetworks.modelo.Proyecto;

import java.util.Scanner;

public class ProbarProyecto {
    public static void main(String[] args) {


        Proyecto p1=new Proyecto(1,"Everest",1000,50);
        System.out.println("importe isn descuento" +p1.calcularImporte());


        System.out.println("el descuento es->"+p1.calcularImporte(0.1));


        //definir escaner
        Scanner teclado=new Scanner(System.in);
        double descuentoPresentacion;
        System.out.println("escriba el descuento(debe ser decimal 0.1)");
        descuentoPresentacion=teclado.nextDouble();

        System.out.println("importe con descuento  ->"+p1.calcularImporte(descuentoPresentacion));

        System.out.println("escribe el descuento (tiene que ser con decimale)");
        System.out.println("importe con descuento  ->"+p1.calcularImporte(teclado.nextDouble()));



    }
}
