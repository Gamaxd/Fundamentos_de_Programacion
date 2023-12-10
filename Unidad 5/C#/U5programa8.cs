using System;

namespace U5programa8 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            dado();
        }
        public static void dado()
        {
            Random aleatorio = new Random();
            int G = aleatorio.Next(6);
            Console.WriteLine("Su numero es: " + G);
        }
    }
}
