using System;

namespace U4programa3 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double F = 0, K = 0;
            int TemperaturaTotal;

            Console.WriteLine("Ingrese la cantidad de temperaturas a procesar: ");
            TemperaturaTotal = Convert.ToInt32(Console.ReadLine());

            double[] temp = new double[TemperaturaTotal];
            for (int i = 0; i < TemperaturaTotal; i++)
            {
                Console.WriteLine("Ingrese la temperatura en grados celsius: ");
                temp[i] = Convert.ToDouble(Console.ReadLine());

                F = temp[i] * (9 / 5) + 32;
                Console.WriteLine("Su temperatura en °F es: " + F);

                K = temp[i] + 273.15;
                Console.WriteLine("Su temperatura en °K es: " + K);
            }

        }
    }
}

