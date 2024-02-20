/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controldecelular;

/**
 *
 * @author SALA PAFP 27
 */
public class Celular {
    String marca;
    String dueño;
    double precio;
    boolean estado;
    
    public Celular(String marca, String dueño, double precio, boolean estado){
        this.marca = marca;
        this.dueño = dueño;
        this.precio = precio;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public String getDueño() {
        return dueño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
    return "CuentaBancaria{" + "marca=" + marca + ", dueño=" + dueño + ", precio=" + precio + ", estado" + estado + '}';
}  
    
   
    void funcion(double funcion){
        precio += funcion;
        // la instruccion equivale a saldo = saldo + cantidad
    }
    //El metodo retirar recibe una cantidad que se va a restar al saldo
    void salida(double funcion){
        if (Habilitado(funcion))
            precio -= funcion;
        else
            System.out.println("Telefono deshabilitado");
       
    }
    // El metodo Habilitado retorna verdadero si el celular esta funcionando y retorna a falso en caso contrario.    
    boolean Habilitado(double funcion){
        if (precio >= funcion)
            return true;
        else
            return false;

}
}

