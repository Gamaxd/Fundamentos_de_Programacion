using System;

namespace U3programa9 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int h1, h2, h3;
            double costo = 0;
            Console.WriteLine("Utiliza el formato de 24 horas.");
            Console.WriteLine("¿Cual fue la hora de entrada? ");
            h1 = Convert.ToInt32(Console.ReadLine()).
            Console.WriteLine("¿Cual fue la hora de salida? ");
            h2 = Convert.ToInt32(Console.ReadLine());

            h3 = h2 - h1;
            Console.WriteLine("Usted estuvo " + h3 + " horas en total");

            if (h3 <= 2)
            {
                costo = h3 * 5;
                Console.WriteLine("Por las " + h3 + " horas que estuvo aqui, tiene que pagar $" + costo);
            }

            else if (h3 <= 5)
            {
                costo = 2 * 5 + (h3 - 2) * 4;
                Console.WriteLine("Por las " + h3 + " horas que estuvo aqui, tiene que pagar $" + costo);
            }

            else if (h3 <= 10)
            {
                costo = 2 * 5 + 3 * 4 + (h3 - 5) * 3;
                Console.WriteLine("Por las " + h3 + " horas que estuvo aqui, tiene que pagar $" + costo);
            }

            else
            {
                costo = 2 * 5 + 3 * 4 + 5 * 3 + (h3 - 10) * 2;
                Console.WriteLine("Por las " + h3 + " horas que estuvo aqui, tiene que pagar $" + costo);
            }
        }
    }
}