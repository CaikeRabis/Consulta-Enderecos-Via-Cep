package cepDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.management.ConstructorParameters;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CepDTO(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String ibge, String gia, String ddd, String siafi) {
    public CepDTO(){
        this("","","","","","","","","","");
    }
}
