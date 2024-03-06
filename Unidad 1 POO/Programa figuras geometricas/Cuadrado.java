/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author SALA PAFP 27
 */
public class Cuadrado extends FiguraGeometrica {
    float lado;

    public Cuadrado(float lado, int puntoX, int puntoY, int tamanioBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoY, tamanioBorde, colorBorde, colorRelleno);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return super.toString() + "Cuadrado{" + "lado=" + lado + '}';
    }
    
    void dibujarCuadrado(){
        System.out.println("Dibujando el cuadrado");
    }
    
    double calcularArea(){
        double area;
        area = lado * lado;
        return area;
    }
    double calcularPerimetro(){
        return lado * 4;
    }
}
