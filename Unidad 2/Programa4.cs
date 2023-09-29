using System;

namespace practica_4 // Note: actual namespace depends on the project 
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int Y, A;
            float suma;

            Console.WriteLine("Escriba el valor de la variable Y: ");
            Y = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba el valor de la variable A: ");
            A = Convert.ToInt32(Console.ReadLine());
            //Paso calcular la Suma.
            suma = (Y + A + 3);
            //Paso imprime el resultado.
            Console.WriteLine("El resultado de la suma es: " + suma);
        }
    }
}