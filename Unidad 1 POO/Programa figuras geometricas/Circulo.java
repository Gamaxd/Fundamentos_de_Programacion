/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;


public class Circulo extends FiguraGeometrica{
    float radio;

    public Circulo(float radio, int puntoX, int puntoY, int tamanioBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoY, tamanioBorde, colorBorde, colorRelleno); //Atributos de la SuperClase.
        this.radio = radio;
    }
    
    public void dibujar(){
    System.out.println("Dibujando Circulo.");
}
    
    double calcularArea(){
        double area;
        area = 3.1416 * (radio * radio);
        return area;
    }
    
    double calcularPerimetro(){
        double perimetro;
        double diametro;
        diametro = radio * 2;
        perimetro = 3.1416 * diametro;
        return perimetro;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "radio=" + radio + '}';
    }
    
}