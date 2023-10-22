using System;

namespace U3programa8 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int N1, N2;
            Console.WriteLine("Ingrese el 1er número: ");
            N1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Ingrese el 2do número: ");
            N2 = Convert.ToInt32(Console.ReadLine());

            if (N1 > N2)
                Console.WriteLine(N1 + " Es mayor que: " + N2);
            else
                Console.WriteLine(N1 + " Es menor que: " + N2);
        }
    }
}
