import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ApiConversion {
    public Monedas buscarCambio(String moneda, String cambio) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d603520aacc39cbf7f4e7469/pair/"+moneda+"/"+cambio);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        //System.out.println("URL de solicitud: " + direccion + "\n");


        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return new Gson().fromJson(response.body(), Monedas.class);
            } else {
                throw new RuntimeException("Error al obtener el tipo de cambio - Código de estado: " + response.statusCode());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener el tipo de cambio: " + e.getMessage());
        }
    }
}
