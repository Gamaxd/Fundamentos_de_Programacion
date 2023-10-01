using System;

namespace Programa8 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int P1, P2, P3, IVA = 16;
            float multiplicacion, suma;
            Console.WriteLine("Escriba el valor del producto 1: ");
            P1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba el valor del producto 2: ");
            P2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba el valor del producto 3: ");
            P3 = Convert.ToInt32(Console.ReadLine());
            suma = (P1 + P2 + P3);
            Console.WriteLine("La suma de los productos es: " + suma);
            multiplicacion = (P1 + P2 + P3) * IVA;
            Console.WriteLine("El resultado del producto con IVA es: " + multiplicacion);
        }
    }
}