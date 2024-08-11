package org.acme.pessoa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private Long id;

    private String nome;

    private Integer idade;

}
