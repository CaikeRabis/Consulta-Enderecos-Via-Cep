import cepDTO.CepDTO;
import cepService.ApiService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ApiService apiService = new ApiService();
        CepDTO cepDTO = apiService.getEndereco("72238273");
        if (cepDTO != null) {
            System.out.printf("CEP: %s%nLogradouro: %s%nComplemento: %s%nBairro: %s%nLocalidade: %s%nUF: %s%nIBGE: %s%nGIA: %s%nDDD: %s%nSIAFI: %s%n",
                    cepDTO.cep(), cepDTO.logradouro(), cepDTO.complemento(), cepDTO.bairro(), cepDTO.localidade(), cepDTO.uf(), cepDTO.ibge(), cepDTO.gia(), cepDTO.ddd(), cepDTO.siafi());
        } else {
            System.out.println("Endereço não encontrado.");
        }    }
}
