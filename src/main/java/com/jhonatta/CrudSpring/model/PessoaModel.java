package com.jhonatta.CrudSpring.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="cadastro_pessoa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="cpf")
    private String cpf;

    @Column(unique = true, name="email")
    private String email;

    @Column(name="num_telefone")
    private Long numeroTelefone;

    @Column(name="data_nascimento")
    private LocalDate dataNascimento;
}
