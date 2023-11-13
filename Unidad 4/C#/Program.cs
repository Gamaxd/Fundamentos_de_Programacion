using System;

namespace U4programa8 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] numeros = { 1, 12, 6, 4, 5, 16, 17, 9, 14, 10 };

            Console.WriteLine("Los numeros pares son: ");
            foreach (int num in numeros)
            {
                if (EsPar(num))
                {
                    Console.Write(num + " ");
                }
            }

            Console.WriteLine("Los numeros impares son: ");
            foreach (int num in numeros)
            {
                if (!EsPar(num))
                {
                    Console.Write(num + " ");
                }
            }
        }

        static bool EsPar(int numero)
        {
            return numero % 2 == 0;
        }
    }

}