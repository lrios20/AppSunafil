package com.example.ma7.myapplication.Model;

public class Item {
    public int type;
    public String orden;
    public String empleador;
    public String direccion;

    public Item(){
    }
    public Item (int type ,String orden, String empleador , String direccion){
        this.type = type;
        this.orden = orden;
        this.empleador = empleador;
        this.direccion = direccion;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getEmpleador() {
        return empleador;
    }

    public void setEmpleador(String empleador) {
        this.empleador = empleador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
