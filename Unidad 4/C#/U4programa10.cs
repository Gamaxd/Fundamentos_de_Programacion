using System;

namespace U4programa10 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] paises = { "Perú", "Portugal", "México", "Brasil", "Israel", "Argentina" };


            double longitud_Promedio = CalcularLongitudPromedio(paises);
            Console.WriteLine("La longitud promedio de las palabras es: " + longitud_Promedio);
        }

        static double CalcularLongitudPromedio(string[] arreglo)
        {
            int total_Caracteres = 0;

            foreach (string palabra in arreglo)
            {
                total_Caracteres += palabra.Length;
            }

            return (double)total_Caracteres / arreglo.Length;
        }
    }
    }
