

import ConversorDivisas.CalcularConversion;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        CalcularConversion calcular = new CalcularConversion();
        Scanner teclado = new Scanner(System.in);
        int valorUsuario = 100;

        String menu = """
                *************************
                Bienvenido al Conversor de Monedas
                Por favor presiona la tecla 9 para continuar
                si ya la presionaste una vez no es necesario hacerlo de nuevo 
                solo preciona el número deseado en el menu y así
                sucesivamente
                
                *************************
                
                Selecciona la opción deseada
                1. Pesos (MX) a Dolares
                2. Dolares a Pesos (MX)
                3. Yen (JPY) a Pesos (MX)
                4. Pesos (MX) a Yen (JPY)
                5. Dolares a Yen (JPY)
                6. Yen (JPY) a Dolares
                0. Salir
                ******************************
                """;

        while (valorUsuario != 0) {
            System.out.println(menu);
            valorUsuario = teclado.nextInt();
            switch (valorUsuario) {
                case 9:
                    System.out.println(menu);
                    valorUsuario = teclado.nextInt();
                    System.out.println("¿Cual es el valor deseado a convertir?");
                    double valorConversion = teclado.nextInt();
                    calcular.realizarConversion(valorConversion, valorUsuario);
                    break;
                case 0:
                    System.out.println("Gracias por usar el Conversos de Monedas");
                    break;
                default:
                    System.out.println("Opción no valida favor de teclear una opción valida");
                    break;
            }
        }
    }
}
