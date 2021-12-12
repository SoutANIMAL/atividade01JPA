package com.fernandoePedro.atividade03JPA.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tbFuncionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    Date dataNascimento;
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

}
