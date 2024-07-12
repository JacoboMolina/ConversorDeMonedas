import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ApiConversion conversion = new ApiConversion();
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        System.out.println("******* Bienvenido al Conversor de Monedas *********");
        while(menu){
            String menuText = """
                    1) Dolar a Peso MXN
                    2) Peso MXN a Dolar
                    3) Dolar a Euro
                    4) Euro a Dolar
                    5) Euro a Peso MXN
                    6) Peso MXN a Euro
                    7) SALIR""";
            System.out.println(menuText);
            System.out.println("Qué conversión desea realizar?");
            int seleccion = scanner.nextInt();

            if (seleccion == 7) {
                menu = false;
                System.out.println("¡Hasta luego!");
                break;
            }

            System.out.println("Ingresa el Valor que deseas Convertir");
            double valor = scanner.nextDouble();

            switch (seleccion){
                case 1:
                    // Dolar a Peso MXN
                    Cambio.cambiomonedas("USD", "MXN", valor);
                    break;
                case 2:
                    // Peso MXN a Dolar
                    Cambio.cambiomonedas("MXN", "USD", valor);
                    break;
                case 3:
                    // Dolar a Euro
                    Cambio.cambiomonedas("USD", "EUR", valor);
                    break;
                case 4:
                    // Euro a Dolar
                    Cambio.cambiomonedas("EUR", "USD", valor);
                    break;
                case 5:
                    // Euro a Peso MXN
                    Cambio.cambiomonedas("EUR", "MXN", valor);
                    break;
                case 6:
                    // Peso MXN a Euro
                    Cambio.cambiomonedas("MXN", "EUR", valor);
                    break;
                default:
                    System.out.println("Selección inválida. Por favor, elija una opción del 1 al 7.");
                    break;
            }
        }
        scanner.close();
    }
}
