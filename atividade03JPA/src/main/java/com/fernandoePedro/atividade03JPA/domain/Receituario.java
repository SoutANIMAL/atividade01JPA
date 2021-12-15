package com.fernandoePedro.atividade03JPA.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbReceituario")
public class Receituario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer dosagem;

    // relacionamento N:1 com acolhido
    @ManyToOne
    Acolhido paciente;

    // relacionamento N:1 com medicação
    @ManyToOne
    Medicamento medicamento;

    // Alessio disse que para diminuir a complexidade do trabalho seria melhor
    // dividir a relação N:M em duas 1:N
}
