using System;

namespace Programa11 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int edad;
            Console.WriteLine("Ingresa tu edad: ");
            edad = Convert.ToInt32(Console.ReadLine());

            if (edad >= 18)
            {
                Console.WriteLine("Mayor de edad.");
            }
            else
            {
                Console.WriteLine("Menor de edad.");
            }
            Console.ReadLine();
        }
    }
}
