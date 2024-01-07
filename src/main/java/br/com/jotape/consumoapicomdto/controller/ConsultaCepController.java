package br.com.jotape.consumoapicomdto.controller;

import br.com.jotape.consumoapicomdto.dto.CepResultDTO;
import br.com.jotape.consumoapicomdto.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consulta-cep")
public class ConsultaCepController {

    @Autowired
    private CepService cepService;

    @GetMapping("{cep}")
    public CepResultDTO consultaCep(@PathVariable("cep") String cep) {
        return cepService.consultarCep(cep);
    }
}
