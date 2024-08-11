package org.acme.pessoa;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.acme.pessoa.dto.PessoaDTO;

@RequestScoped
public class PessoaService {

    @Inject
    EntityManager entityManager;

    @Transactional
    public void criar(PessoaDTO dto) {
        Pessoa pessoa = Pessoa.builder().id(dto.getId()).idade(dto.getIdade()).nome(dto.getNome()).build();
        this.entityManager.persist(pessoa);
    }

}
