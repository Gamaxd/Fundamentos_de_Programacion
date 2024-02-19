/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SALA PAFP 27
 */
public class CuentaBancaria {
    // Crear clase
    // Definir atributos
    int numCuenta;
    String nomCliente;
    float saldo;
    int cvv;
    // Definir el constructor.

    public CuentaBancaria(int numCuenta, String nomCliente, float saldo, int cvv) {
        this.numCuenta = numCuenta;
        this.nomCliente = nomCliente;
        this.saldo = saldo;
        this.cvv = cvv;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public float consultarSaldo() {
        return saldo;
    }

    public int getCvv() {
        return cvv;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", nomCliente=" + nomCliente + ", saldo=" + saldo + ", cvv=" + cvv + '}';
    }
    
    // metodo depositar recibe una cantidad que se sumara al saldo
    void depositar(double cantidad){
        saldo += cantidad;
        // la instruccion equivale a saldo = saldo + cantidad
    }
    //El metodo retirar recibe una cantidad que se va a restar al saldo
    void retirar(double cantidad){
        if (haySaldo(cantidad))
            saldo -= cantidad;
        else
            System.out.println("Fondos insuficientes");
       
    }
    // El metodo haySaldo retorna verdadero si el saldo es mayor o igual a una cantidad o retorna a falso en caso contrario.
    boolean haySaldo(double cantidad){
        if (saldo >= cantidad)
            return true;
        else
            return false;
    }
    }
