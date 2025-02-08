package com.iniflex.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa {
    protected BigDecimal salario;
    protected String funcao;

    protected static String Formato = "R$#.##0,00";
    protected static final DecimalFormat df = new DecimalFormat();

    public Funcionario(String nome, String dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getSalarioFormatado() {
        return df.format(salario);
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
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "{ Nome: " +
                getNome() +
                ", Data de Nascimento: " +
                getDataNascimento().format(formatador) +
                ", Salário: R$" +
                getSalarioFormatado() +
                ", Função: " +
                funcao +
                "}";
    }
}
