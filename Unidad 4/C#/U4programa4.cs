﻿using System;

namespace U4programa4
{
    internal class Negativo
    {
        static void Main(string[] args)
        {

            int n = 0, num;
            Console.WriteLine("Ingrese los números a procesar: ");
            num = Convert.ToInt32(Console.ReadLine());

            int[] neg = new int[num];

            for (int i = 0; i < neg.Length; i++)
            {
                Console.WriteLine("Escribe un número en decimal negativo " + i + ": "); ;
                neg[i] = Convert.ToInt32(Console.ReadLine());

                if (neg[i] < 0)
                {
                    i++;
                }
                Console.WriteLine("Hay un total de " + i + " números negativos.");
            }

        }
    }
}
