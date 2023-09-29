using System;

namespace programa5 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int B, H;
            float multiplicacion;

            Console.WriteLine("Escriba el valor de la variable B: ");
            B = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba el valor de la variable H: ");
            H = Convert.ToInt32(Console.ReadLine());
            //paso calcular la operacion
            multiplicacion = (B + H) / 2;
            Console.WriteLine("El resultado de la operacion es: " + multiplicacion);

            int L1, L2, L3;
            float suma;
            Console.WriteLine("Escriba el valor de la variable L1: ");
            L1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba el valor de la variable L2: ");
            L2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba el valor de la variable L3: ");
            L3 = Convert.ToInt32(Console.ReadLine());
            //paso calcular la operacion
            suma = (L1 + L2 + L3);
            Console.WriteLine("El resultado de la operacion es: " + suma);
        }
    }
}
