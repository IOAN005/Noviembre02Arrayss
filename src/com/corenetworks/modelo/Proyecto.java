package com.corenetworks.modelo;

public class Proyecto {
    //atributos
    private int idProyecto;
    private String nombreProyecto;
    private double horas;
    private double tarifa;
    //metodo
    public double calcularImporte(){
        return  horas*tarifa;

    }public double calcularImporte(double descuento){
        return calcularImporte()-(calcularImporte()*descuento);
        //return horas*tarifa-(horas*tarifa*descuento);

    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "idProyecto=" + idProyecto +
                ", nombreProyecto='" + nombreProyecto + '\'' +
                ", horas=" + horas +
                ", tarifa=" + tarifa +
                '}';
    }
    //Constructor

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String nombreProyecto, double horas, double tarifa) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    //setters y getters

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
