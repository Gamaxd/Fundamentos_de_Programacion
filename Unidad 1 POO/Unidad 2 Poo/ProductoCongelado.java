/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

import java.util.Date;

/**
 *
 * @author SALA PAFP 31
 */
public class ProductoCongelado extends Producto{
    float temperatura;

    public ProductoCongelado(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public float getLote() {
        return lote;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setLote(float lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" + "temperatura=" + temperatura + '}';
    }
}