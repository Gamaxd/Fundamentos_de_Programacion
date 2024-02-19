 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author SALA PAFP 27
 */
public class Banco {
    public static void main(String[] args) {
        // Crear un objeto de la clase CuentaBancaria
        // Ejecutar todos los metodos desde el objeto
        int numCuenta;
        String nomCliente;
        float saldo;
        int cvv;
        CuentaBancaria cuentab;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Numero de cuenta?: ");
        numCuenta = entrada.nextInt(); //Leer un entero.
        entrada.nextLine(); //Limpia el buffer.
        
        System.out.println("Nombre del cliente?: ");
        nomCliente = entrada.nextLine();
        
        System.out.println("Saldo inicial?: ");
        saldo = entrada.nextFloat();
        
        System.out.println("CVV?: ");
        cvv = entrada.nextInt();
        
        cuentab = new CuentaBancaria(numCuenta, nomCliente, saldo, cvv);
        double cantidad;
        System.out.println("Que cantidad desea retirar?: ");
        cantidad = entrada.nextDouble();
        cuentab.retirar(cantidad);
        System.out.println("El saldo actual es: " + cuentab.consultarSaldo());
        System.out.println("Que cantidad desea depositar?: ");
        cantidad = entrada.nextDouble();
        cuentab.retirar(cantidad);
        System.out.println("El saldo actual es: " + cuentab.consultarSaldo());
    }
}
