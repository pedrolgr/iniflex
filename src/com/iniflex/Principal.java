package com.iniflex;

import com.iniflex.model.Funcionario;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static com.iniflex.model.utils.Utils.*;

// Questão 3
public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        // Questão 3.1
        funcionarios.add(new Funcionario("Maria", "18/10/2000", new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", "12/05/1990", new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", "02/05/1961", new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", "14/10/1988", new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", "05/01/1995", new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", "19/11/1999", new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", "31/03/1993", new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", "08/07/1994", new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", "24/05/2003", new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", "02/09/1996", new BigDecimal("2799.93"), "Gerente"));

        // Questão 3.2
        removerFuncionario(funcionarios,"João");

        // Questão 3.3 ARRUMAR A PONTUACAO E A VIRGULA TBM
        System.out.println(funcionarios);

        // Questão 3.4
        atualizarTodosSalarios(new BigDecimal("0.10"), funcionarios);

        // Questão 3.5
        Map<String, List<Funcionario>> funcionariosMap = new HashMap<String, List<Funcionario>>();

        funcionariosMap = funcionarios.stream().collect(Collectors.groupingBy(
                funcionario -> funcionario.getFuncao()));

        System.out.println(funcionariosMap);

        // Questão 3.6 FAZER DEPOIS

        // Questão 3.8
        imprimirFuncionarioMesAniversario(funcionarios, 10);

        // Questao 3.9
        imprimirFuncionarioMaisVelho(funcionarios);

        // Questao 3.10
        Collections.sort(funcionarios, Comparator.comparing(funcionario -> funcionario.getNome()));

        // Questao 3.11
        imprimirTotalSalario(funcionarios);

    }
}
