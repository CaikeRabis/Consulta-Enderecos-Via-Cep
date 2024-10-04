package cepService;

import cepDTO.CepDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {

    CepDTO cepDTO = new CepDTO();

    public CepDTO getEndereco(String cep) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            cepDTO = mapper.readValue(response.body(), CepDTO.class);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cepDTO;
    }

}
