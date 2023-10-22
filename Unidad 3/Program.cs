using System;

namespace U3programa7 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double T;
            Console.WriteLine("¿Qué temperatura hay hoy?");
            T = Convert.ToInt32(Console.ReadLine());

            if (T >= 27)
            {
                Console.WriteLine("¡Hace calor!!");
            }
            else if (T < 27 && T >= 20)
            {
                Console.WriteLine("¡Hay clima agradable!");
            }
            else
            {
                Console.WriteLine("Clima fresco o frio!!!");
            }
        }
    }
}