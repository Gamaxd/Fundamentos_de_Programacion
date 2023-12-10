using System;

namespace U5programa5 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese una palabra completa: ");
            String palabra = Convert.ToString(Console.ReadLine);
            Console.WriteLine(palabra + " tiene un total de: " + palabra(palabra) + " letras");
        }
        public static int palabra(String x)
        {
            int palabra = x.Length();
            return palabra;
        }
    }
}