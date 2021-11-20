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
@Entity(name = "tabela_funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Instant dataNascimento;
    private String cpf;
    private String telefone;
    private String cep;
    private String numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private Boolean isActive;

    public static Funcionario parseNote(String line) {
        String[] text = line.split(",");
        Funcionario note = new Funcionario();
        note.setId(Long.parseLong(text[0]));
        note.setNome(text[1]);
        return note;
    }

}
