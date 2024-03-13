/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author SALA PAFP 31
 */
public class ProductoFresco extends Producto{
    String pais;
    Date dia;

    public ProductoFresco(String pais, Date dia) {
        this.pais = pais;
        this.dia = dia;
    }

    public String getPais() {
        return pais;
    }

    public Date getDia() {
        return dia;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public float getLote() {
        return lote;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setLote(float lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + "pais=" + pais + ", dia=" + dia + '}';
    }
}