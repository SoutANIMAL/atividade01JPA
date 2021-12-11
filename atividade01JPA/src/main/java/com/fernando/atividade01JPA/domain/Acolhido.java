package com.fernando.atividade01JPA.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tabela_acolhido")
public class Acolhido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Instant dataNascimento;
    private String cpf;
    private String descricao;
    private String naturalidade;
    private Boolean isActive;

    public static Acolhido parseNote(String line) {
        String[] text = line.split(",");
        Acolhido note = new Acolhido();
        note.setId(Long.parseLong(text[0]));
        note.setNome(text[1]);
        return note;
    }

}
