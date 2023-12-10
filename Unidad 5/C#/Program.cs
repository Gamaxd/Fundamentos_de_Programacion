using System;

namespace U5programa1 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(suma(9, 5));
            Console.WriteLine(resta(5, 2));
            Console.WriteLine(multiplicacion(2, 10));
            Console.WriteLine(division(20, 2));
        }
        //1METODO O FUNCION
        public static int suma(int a, int b)
        {
            int r = a + b;
            return r;
        }
        public static int resta(int a, int b)
        {
            int r = a - b;
            return r;
        }
        public static int multiplicacion(int a, int b)
        {
            int r = a * b;
            return r;
        }
        public static int division(int a, int b)
        {
            int r = a / b;
            return r;
        }
    }
}