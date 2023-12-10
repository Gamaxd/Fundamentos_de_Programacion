using System;
using System.Text;

namespace U5programa10 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int longitud = 8;
            String contrasena = aleatorio(longitud);
            Console.WriteLine("password: " + contrasena);


        }
        public static String aleatorio(int lon)
        {
            String caracteres = "ABCDEFGHIJK123456789*-_.";
            Random random = new Random();
            StringBuilder cadena = new StringBuilder(lon);
            for (int i = 0; i < lon; i++)
            {
                int indiceCaracter = random.Next(caracteres.LengthL());
                cadena.Append(caracteres.CharAt(indiceCaracter));
            }
            return cadena.ToString();
        }
    }
}
