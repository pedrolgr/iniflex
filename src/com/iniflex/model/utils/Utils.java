package com.iniflex.model.utils;

import com.iniflex.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

}
