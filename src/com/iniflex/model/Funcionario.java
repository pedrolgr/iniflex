package com.iniflex.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    protected BigDecimal salario;
    protected String funcao;

    public Funcionario(String nome, String dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "{ Nome: " +
                getNome() +
                ", Data de Nascimento: " +
                getDataNascimento() +
                ", Salário: " +
                salario +
                ", Função: " +
                funcao +
                "}";
    }
}
