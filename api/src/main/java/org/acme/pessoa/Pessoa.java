package org.acme.pessoa;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@Table(name = "pessoa")
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "idade", nullable = false)
    private Integer idade;

}
