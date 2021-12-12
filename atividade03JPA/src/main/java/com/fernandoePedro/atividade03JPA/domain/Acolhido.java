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
@Entity(name = "tbAcolhido")
public class Acolhido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    Date dataNascimento;
    String cpf;
    String descricaoDoCaso;
    String Naturalidade;
    // relacionamento N:N com medicação
    Boolean isActive;

}
