using System;

namespace U4prorama14 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] matriz = new int[3];
            matriz[0] = 3;
            matriz[1] = 5;
            matriz[2] = 2;

            Console.WriteLine("Contenido del arreglo");
            for (int i = 0; i < 3; i++)
            {
                Console.WriteLine(matriz[i]);

            }
            int suma;
            suma = matriz[0] + matriz[1] + matriz[2];
            Console.WriteLine("La suma de los arreglos en la matriz es: " + suma);
        }
    }
}
