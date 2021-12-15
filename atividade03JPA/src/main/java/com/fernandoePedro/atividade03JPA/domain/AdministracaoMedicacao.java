package com.fernandoePedro.atividade03JPA.domain;

import java.time.Instant;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbAdministracaoMedicacao")

public class AdministracaoMedicacao {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    Instant dataAdministracao;
    LocalTime horaAdministracao;

    // relacionamento N:1 com acolhido
    @ManyToOne
    Acolhido acolhido;

    // relacionamento N:1 com funcionario
    @ManyToOne
    Funcionario ministrador;

    // relacionamento N:1 com remedio
    @ManyToOne
    Medicamento medicamento;

    Boolean isActive;

}
