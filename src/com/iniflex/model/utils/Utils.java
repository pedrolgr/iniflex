package com.iniflex.model.utils;

import com.iniflex.model.Funcionario;

import java.util.List;

public class Utils {

    public static void removerFuncionario(List<Funcionario> funcionarios, String nome) {
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nome));

    }
}
