package com.example.api.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ClienteResponseDTO {

    private String nome;
    private String email;
    private String telefone;

}
