using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int opcion;
            Console.WriteLine("Elige la conversecion a realizar: ");
            Console.WriteLine("Temperatura en °C a °F: ");
            Console.WriteLine("Temperatura en °F a °C: ");
            Console.WriteLine("Medidas pulgadas a metros: ");
            Console.WriteLine("Tiempo en horas a segundos: ");
            opcion = Convert.ToInt32(Console.ReadLine());
            switch (opcion)
            {
                case 1:
                    int c;
                    Console.WriteLine("Escribe los grados a convertir: ");
                    c = Convert.ToInt32(Console.ReadLine());
                    Console.WriteLine("Tu resultado es: " + temperaturaCF(c));
                    break;
                case 2:
                    Console.WriteLine("Opcion 2");
                    break;
                case 3:
                    medida();
                    break;
                case 4:
                    tiempo();
                    break;
                
                default:
                    Console.WriteLine("La opcion es incorrecta");
                    break;
            }//Switch
        }//Main
       public static double temperaturaCF(double c)
        {
            double resultados = (c * 1.8) + 32;
            return resultados;
        }
        public static double TemperaturaFK()
        {
            double F, resultado;
            Console.Write("Ingrese la temperatura a en celsius: ");
            F = Convert.ToDouble(Console.ReadLine);
            resultado = (F - 32) * (5 / 9) + 275.16;
            return resultado;
        }

        public static void medida()
        {
            double p, resultado;
            Console.WriteLine("Escriba la medida en pulgadas: ");
            p = Convert.ToDouble(Console.ReadLine());
            resultado = p / 39.37;
            Console.WriteLine("Tu resultado es: " + resultado);
        }
        
        public static double tiempo()
        {
            double h;
            Console.WriteLine("Escriba su tiempo en horas: ");
            h = Convert.ToDouble(Console.ReadLine());
            return h * 3600;
        }
    }
}
