using System;

namespace Programa10 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int Perimetro, Apotema;
            float multiplicacion;
            Console.WriteLine("Asigna el Perimetro: ");
            Perimetro = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Asigna la Apotema: ");
            Apotema = Convert.ToInt32(Console.ReadLine());
            multiplicacion = (Perimetro * Apotema) / 2;

            Console.WriteLine("El area del hexagono es: " + multiplicacion);
        }
    }
}
