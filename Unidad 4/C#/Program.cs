using System;

namespace U4programa7 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double[] numeros = { 11, 2, 6, 7, 10, 9, 14, 3, 15, 10 };

            double media = CalcularMedia(numeros);
            Console.WriteLine("La media es: " + media);

            double mediana = CalcularMediana(numeros);
            Console.WriteLine("La mediana es: " + mediana);
        }

        static double CalcularMedia(double[] arreglo)
        {
            double suma = 0;

            foreach (double num in arreglo)
            {
                suma += num;
            }

            return suma / arreglo.Length;
        }


        static double CalcularMediana(double[] arreglo)
        {
            Array.Sort(arreglo);

            int n = arreglo.Length;

            if (n % 2 == 0)
            {
                int indice1 = n / 2 - 1;
                int indice2 = n / 2;
                return (arreglo[indice1] + arreglo[indice2]) / 2.0;
            }
            else
            {
                int indice = n / 2;
                return arreglo[indice];
            }
        }
    }

}