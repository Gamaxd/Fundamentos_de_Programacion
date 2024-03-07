/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco_1;

/**
 *
 * @author SALA PAFP 27
 */
public class CuentaDebito extends CuentaBancaria{

    public CuentaDebito(int numCuenta, String nombCliente, float saldo, int cvv) {
        super(numCuenta, nombCliente, saldo, cvv);
    }
    
//método depositar recibe una cantidad que
//se sumará al saldo
void depositar(double cantidad){
saldo += cantidad;
//la instrucción equivale a
//saldo=saldo+cantidad
}

//método retirar recibe una cantidad que
//se restará al saldo
void retirar(double cantidad){
if (haySaldo(cantidad))
saldo -= cantidad;
else
System.out.println("Fondos insuficientes");
}
//el método haySaldo retorna verdadero si
//el saldo es mayor o igual a una cantidad
//o retorna falso en caso contrario.
private boolean haySaldo(double cantidad){
if (saldo >= cantidad)
return true;
else
return false;
}

}
