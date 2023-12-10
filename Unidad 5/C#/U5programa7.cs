using System;

namespace U5programa7 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingresa el precio un producto: ");
            double p = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(" Numero de Cantidad de productos: ");
            int n = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("El subtotal del producto es: " + sub(p, n) + " $");
            Console.WriteLine("El IVA del producto es: " + iva(p) + " $");
            Console.WriteLine("El total a pagar es: " + total(p, n) + " $");
        }
        //IVA
        public static double iva(double a)
        {
            double Iva = 0.16;
            double r = a * Iva;
            return r;
        }
        //SUBTOTAL
        public static double sub(double a, int b)
        {
            double r = a * b;
            return r;
        }
        // TOTAL
        public static double total(double b, double c)
        {
            double IVA = 0.16;
            double r = (b * c) + ((b * c) * IVA);
            return r;
        }

    }
}
