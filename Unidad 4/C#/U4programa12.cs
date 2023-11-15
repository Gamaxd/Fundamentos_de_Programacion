using System;

namespace U4programa12 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        
        {
            /*int[][] cal = new int [3] [3];

       cal[0][0] = 5;
       cal[0][1] = 7;
       cal[0][2] = 9;
       cal[1][0] = 3;
       cal[1][1] = 6;
       cal[1][2] = 8;
       cal[2][0] = 2;
       cal[2][1] = 3;
       cal[2][2] = 6;*/
            int[,] cal = { { 5, 7, 9 } , { 3, 6, 8 } , { 2, 3, 6 } };

            int fila = cal.GetLength(0);
            int columna = cal.GetLength(1);

            for (int f = 0; f <= 2; f++)
            {
                for (int c = 0; c <= 2; c++)
                {
                    Console.WriteLine(cal [f, c] + ",");
                }
                Console.WriteLine();
            }
        }
    }
}
