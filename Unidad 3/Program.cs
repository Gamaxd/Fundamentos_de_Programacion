using System;

namespace U3programa10 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int horas_t, horas_e;
            double pago, sueldosem = 0;
            Console.WriteLine("Horas trabajadas");
            horas_t = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("¿Pago por hora? ");
            pago = Convert.ToInt32(Console.ReadLine());

            if (horas_t <= 40)
            {
                sueldosem = horas_t * pago;
                Console.WriteLine("Recibiras un total de $" + sueldosem);
            }
            else
            {
                horas_e = horas_t - 40;
                sueldosem = 40 * pago + horas_e * (pago * 2);
                Console.WriteLine("Por trabajar " + horas_e + " horas extra, usted recibe un total de $" + sueldosem);


            }
        }
    }
}