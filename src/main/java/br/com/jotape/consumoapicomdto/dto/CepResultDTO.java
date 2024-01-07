package br.com.jotape.consumoapicomdto.dto;

public record CepResultDTO(
        String cep,
        String logradouro,
        String complemento,
        String uf
) {
}
