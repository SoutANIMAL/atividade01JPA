package com.fernandoePedro.atividade03JPA.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbFuncionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = 128)
    String nome;

    Instant dataNascimento;

    String tipoFuncionario;
    Double salario;
    String cpf;
    String email;
    String telefone;
    String cep;
    String numero;
    String rua;
    String bairro;
    String cidade;
    String estado;
    Boolean isActive;

//    @OneToMany(mappedBy = "responsavel")
//    List<Refeicao> refeicaoList;
}
