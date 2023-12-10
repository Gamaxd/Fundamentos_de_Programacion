using System;

namespace U5programa4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero entero: ");
            int num = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(num + " " + primo(num));
        }

        public static String primo(int x)
        {
            int c = 0;
            String P;
            for (int i = x; i > 0; i--)
            {
                if (x % i == 0)
                {
                    c++;
                }
            }
            if (c == 2)
            {
                P = "El numero es primo";
            }
            else
            {
                P = "El numero no es primo";
            }
            return P.ToString();
        }

    }
}