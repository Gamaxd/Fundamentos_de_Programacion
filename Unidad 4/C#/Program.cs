using System;

namespace U4programa6 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] numeros = { 5, 6, 3, 2, 1, 9, 8, 4 };

            int[] arreglo_O = OrdenarArreglo(numeros);

            Console.WriteLine("El arreglo Ordenado es: ");
            foreach (int num in arreglo_O)
            {
                Console.Write(num + " ");
            }
        }

        static int[] OrdenarArreglo(int[] arreglo)
        {
            int[] arreglo_O = new int[arreglo.Length];
            Array.Copy(arreglo, arreglo_O, arreglo.Length);

            for (int i = 0; i < arreglo_O.Length - 1; i++)
            {
                for (int j = 0; j < arreglo_O.Length - 1 - i; j++)
                {
                    if (arreglo_O[j] > arreglo_O[j + 1])
                    {
                        int temp = arreglo_O[j];
                        arreglo_O[j] = arreglo_O[j + 1];
                        arreglo_O[j + 1] = temp;
                    }
                }
            }

            return arreglo_O;
        }
    }
}