package com.fernandoePedro.atividade03JPA.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tbCirculacaoAcolhido")
public class CirculacaoAcolhido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalTime horaSaida;
    LocalTime horaEntrada;
    String descricao;
    // relacionamento N:1 com acolhido
    Boolean isActive;

}
