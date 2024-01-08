package com.javanauta.usuario.api.response;

public record EnderecoResponseDTO(String rua,

                                  Long numero,

                                  String bairro,

                                  String complemento,

                                  String cidade,

                                  String cep) {

}
