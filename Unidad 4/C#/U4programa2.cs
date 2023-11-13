using System;

namespace U4programa2 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] cal = new int[10 ] {90, 100, 80, 70, 100, 80, 40, 30, 69, 100};
            double promedio = 0, suma = 0;

            for (int i = 0; i < 10; i++)
            {
                suma = suma + cal[i];
                promedio = suma / 10;
            }
            Console.WriteLine("El promedio de tus califiaciones es: " + promedio);
        }
    }
}
