using System;

namespace Programa_9 
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int N1, N2;
            float suma, resta, multiplicacion, division;
            Console.WriteLine("Escriba el primer numero: ");
            N1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba el segundo numero: ");
            N2 = Convert.ToInt32(Console.ReadLine());

            suma = (N1 + N2);
            Console.WriteLine("El resultado de la suma es: " + suma);

            resta = (N1 - N2);
            Console.WriteLine("El resultado de la resta es: " + resta);

            multiplicacion = (N1 * N2);
            Console.WriteLine("El resultado de la multiplicacion es: " + multiplicacion);

            division = (N1 / N2);
            Console.WriteLine("El resultado de la division es: " + division);
        }
    }
}
