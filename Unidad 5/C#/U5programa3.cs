using System;

namespace U5programa3 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)

        {
            double x, y;
            Console.WriteLine("Escribe el valor de x: ");
            x = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe el valor de y: ");
            y = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Resultados 1ra operacion: " + ecuacion1(x, y));
            Console.WriteLine("Resultados 2da operacion: " + ecuacion2(x, y));

        }//MAIN
        public static double ecuacion1(double x, double y)
        {
            double r;
            r = Math.Pow(x, 2) + (2 * Math.Pow(y, 4));
            return r;
        }
        public static double ecuacion2(double x, double y)
        {
            double r;
            r = Math.Sqrt(Math.Pow(x, 4) + (5 * y));
            return r;
        }
    }
}
