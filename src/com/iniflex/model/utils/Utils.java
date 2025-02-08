package com.iniflex.model.utils;

import com.iniflex.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utils {

    public static void removerFuncionario(List<Funcionario> funcionarios, String nome) {
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nome));
    }

    public static void atualizarTodosSalarios(BigDecimal percentual, List<Funcionario> funcionarios){
        for(Funcionario funcionario: funcionarios) {
            BigDecimal novoSalario = funcionario.getSalario().add(funcionario.getSalario().multiply(percentual));
            funcionario.setSalario(novoSalario.setScale(2, RoundingMode.HALF_EVEN));
        }
    };

    public static void imprimirFuncionarioMesAniversario(List<Funcionario> funcionarios, int mesAniversario) {
        List<Funcionario> funcionarioAniversariante = new ArrayList<Funcionario>();
        for(Funcionario funcionario: funcionarios) {
            if(funcionario.getDataNascimento().getMonth().getValue() == mesAniversario) {
                funcionarioAniversariante.add(funcionario);
            }
        }
        System.out.println(funcionarioAniversariante);
    }

    public static void imprimirFuncionarioMaisVelho(List<Funcionario> funcionarios) {
        Funcionario funcionarioMaisVelho = null;
        int maiorIdade = 0;
        for(Funcionario funcionario: funcionarios) {
            Period idadeFuncionario = Period.between(funcionario.getDataNascimento(), LocalDate.now());
            if(idadeFuncionario.getYears() > maiorIdade) {
                maiorIdade = idadeFuncionario.getYears();
                funcionarioMaisVelho = funcionario;
            }
        }
        System.out.println("*** FUNCIONÁRIO MAIS VELHO ***\n" +
                "Nome: " + funcionarioMaisVelho.getNome() + " | Idade: " +maiorIdade + "\n");

    }

    public static void imprimirTotalSalario(List<Funcionario> funcionarios) {
        BigDecimal salarioTotal = new BigDecimal(0);
        for(Funcionario funcionario: funcionarios) {
            salarioTotal = salarioTotal.add(funcionario.getSalario());
        }
        System.out.println("*** SOMA DOS SALÁRIOS ***\n" +
                "R$" + salarioTotal + "\n");
    }

    public static void imprimirQtdSalariosMinimosPorFuncionario(List<Funcionario> funcionarios) {
        BigDecimal qtdSalarioMinimo = new BigDecimal(0);
        BigDecimal salarioMinimo = new BigDecimal(1212.00);
        System.out.println("*** QUANTIDADE DE SALÁRIOS MINIMOS POR FUNCIONÁRIO ***");
        for(Funcionario funcionario: funcionarios) {
            qtdSalarioMinimo = funcionario.getSalario().divide(salarioMinimo, 2);
            System.out.println(funcionario.getNome() + " recebe " + qtdSalarioMinimo + " salários mínimos.");
        }
        System.out.println("\n\n");
    }
}
