using System;

namespace U4programa9 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] nombres = { "Darien", "Emiliano", "Ricardo" };
            string[] apellidos = { "Zavala", "Celaya", "Carballo" };

            string[] nombresCompletos = ConcatenarNombresApellidos(nombres, apellidos);

            Console.WriteLine("Nombres Completos:");
            foreach (string nombreCompleto in nombres)
            {
                Console.WriteLine(nombreCompleto);
            }
        }

        static string[] ConcatenarNombresApellidos(string[] nombres, string[] apellidos)
        {
            if (nombres.Length != apellidos.Length)
            {
                Console.WriteLine("Error: Los arreglos no tienen la misma longitud.");
                return new string[0];
            }

            string[] nombresCompletos = new string[nombres.Length];

            for (int i = 0; i < nombres.Length; i++)
            {
                nombresCompletos[i] = nombres[i] + " " + apellidos[i];
            }

            return nombresCompletos;
        }
    }

}