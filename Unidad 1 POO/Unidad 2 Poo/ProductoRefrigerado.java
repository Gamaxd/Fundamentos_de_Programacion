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
public class ProductoRefrigerado extends Producto{
    float codigo;

    public ProductoRefrigerado(float codigo) {
        this.codigo = codigo;
    }

    public float getCodigo() {
        return codigo;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public float getLote() {
        return lote;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setLote(float lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" + "codigo=" + codigo + '}';
    }
}