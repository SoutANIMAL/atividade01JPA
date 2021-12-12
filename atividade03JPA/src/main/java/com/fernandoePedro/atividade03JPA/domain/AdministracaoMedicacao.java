package com.fernandoePedro.atividade03JPA.domain;

import java.time.LocalTime;

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
@Entity(name = "tbAdministracaoMedicacao")

public class AdministracaoMedicacao {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    Date dataAdministracao;
    LocalTime horaAdministracao;
    // relacionamento N:1 com acolhido
    // relacionamento N:1 com funcionario
    // relacionamento N:1 com remedio
    Boolean isActive;

}
