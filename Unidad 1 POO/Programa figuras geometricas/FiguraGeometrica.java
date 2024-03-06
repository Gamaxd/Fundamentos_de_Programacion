package geometria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SALA PAFP 27
 */
public class FiguraGeometrica {
    int puntoX;
    int puntoY;
    int tamanioBorde;
    String colorBorde;
    String colorRelleno;
// Crear constructor del programa.
    public FiguraGeometrica(int puntoX, int puntoY, int tamanioBorde, String colorBorde, String colorRelleno) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
        this.tamanioBorde = tamanioBorde;
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
    }
// Insertar codigo getter
    public int getPuntoX() {
        return puntoX;
    }

    public int getPuntoY() {
        return puntoY;
    }

    public int getTamanioBorde() {
        return tamanioBorde;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }
// Insertar codigo setter.
    public void setPuntoX(int puntoX) {
        this.puntoX = puntoX;
    }

    public void setPuntoY(int puntoY) {
        this.puntoY = puntoY;
    }

    public void setTamanioBorde(int tamanioBorde) {
        this.tamanioBorde = tamanioBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
// Insertar codigo toString.
    @Override
    public String toString() {
        return "Figura Geometrica{" + "punto X=" + puntoX + ", punto Y=" + puntoY + ", tamanio Borde=" + tamanioBorde + ", color Borde=" + colorBorde + ", color Relleno=" + colorRelleno + '}';
        
    }
    
    
}
