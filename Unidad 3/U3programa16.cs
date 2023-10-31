using System;

namespace U3programa16 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i = 1, h, p, s;
            while (i <= 20)
            {
                Console.WriteLine("Ingrese la cantidad de horas trabajadas: ");
                h = Convert.ToInt32(Console.ReadLine());    
                Console.WriteLine("Ingrese el pago de las horas: ");
                p = Convert.ToInt32(Console.ReadLine());
                s = h * p;
                Console.WriteLine("Su sueldo semanal es: " + s);
                i++;
            }
        }
    }
}
