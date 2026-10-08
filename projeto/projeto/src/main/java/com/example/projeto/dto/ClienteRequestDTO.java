package com.example.projeto.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteRequestDTO {

    @NotBlank(message = "0  nome é obrigatório.")
    @Size(min = 3, message = "O nome deve ter no mínimo 3 caracters.")
    private String nome;

    @NotBlank(message = "0  e-mail é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    @Size(max = 200, message = "O e-mail válido deve ter no máximo 200 caracters.")
    private String email;


    @NotBlank(message = "0 telefone é obrigatório.")
    @Size(min = 11, max = 15, message = "O telefone deve ter no entre 11 e 15 caracters.")
    private String telefone;
}
