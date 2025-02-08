package com.iniflex.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;


    private static final DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento, formatador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getDataNascimentoString() {
        return dataNascimento.format(formatador);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "{" +
                nome +
                ", " +
                dataNascimento +
                ", " +
                "}";
    }
}
