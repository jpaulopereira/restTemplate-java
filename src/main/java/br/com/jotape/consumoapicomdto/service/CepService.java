package br.com.jotape.consumoapicomdto.service;

import br.com.jotape.consumoapicomdto.dto.CepResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {

    @Value("${cep.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    @Autowired
    public CepService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CepResultDTO consultarCep(String cep) {
        String url = String.format("%s%s/json/", apiUrl, cep);
        ResponseEntity<CepResultDTO> responseEntity = restTemplate.getForEntity(url, CepResultDTO.class);
        return responseEntity.getBody();
    }
}
