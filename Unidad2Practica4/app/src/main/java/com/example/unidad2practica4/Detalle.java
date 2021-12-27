package com.example.unidad2practica4;

import java.io.Serializable;

public class Detalle implements Serializable {
    private String titulo,descripcion;
    private int logoid;

    public Detalle(String titulo, String descripcion, int logoid) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.logoid = logoid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLogoid() {
        return logoid;
    }

    public void setLogoid(int logoid) {
        this.logoid = logoid;
    }
}
