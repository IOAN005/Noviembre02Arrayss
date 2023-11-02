package com.corenetworks.modelo;

public class Palabra {
    //atributos
    private String []palabra;

    //metodo
    public void  actualizaElemento(String contenido,int posicion){
        //contenido se guarda en en array en la posicion
        palabra[posicion]=contenido;


    }
    //constructores

    public Palabra(int elemento) {
        palabra=new String[elemento];
    }
//4 setter y getters


    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }
}







