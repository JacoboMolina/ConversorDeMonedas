public class Cambio {

    public static void cambiomonedas(String moneda, String cambio, double valor){
        ApiConversion apiconversion = new ApiConversion();
        Monedas monedas = apiconversion.buscarCambio(moneda, cambio);

        double conversion = valor * monedas.conversion_rate(); // Utiliza el getter generado
        System.out.printf("***** %.2f %s equivale a %.2f %s *****%n", valor, moneda, conversion, cambio);
    }
}
