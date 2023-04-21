package app;

import app.entidades.genericas.Funcionario;

import java.util.LinkedList;

import static app.servicos.Tarefas.*;

public class Gerenciador {

    public static void main(String[] args) {

        gerarDelimitador();

        // Criando base de funcionarios
        System.out.println("\nGerando base inicial");
        LinkedList<Funcionario> funcionarios = gerarBaseInicial();
        listarFuncionarios(funcionarios);

        gerarDelimitador();

        // Remover o funcionário "Joao"
        removerFuncionarioPeloNome(funcionarios, "Joao");
        listarFuncionarios(funcionarios);

        gerarDelimitador();

        // Aumentar salário dos funcionarios em 10%
        aumentarSalarioFuncionarios(funcionarios);
        listarFuncionarios(funcionarios);

        gerarDelimitador();

        // Listar funcionarios agrupados por função
        listarFuncionariosAgrupadosPorFuncao(funcionarios);

        gerarDelimitador();

        // Imprimir funcionarios que fazem aniversario em outubro e dezembro
        System.out.println("\nFuncionarios que fazem aniversario em outubro");
        funcionariosAniversario(funcionarios, 10);
        System.out.println("\nFuncionarios que fazem aniversario em dezembro");
        funcionariosAniversario(funcionarios, 12);

        gerarDelimitador();

        // Imprimir funcionário com maior idade
        funcionarioMaiorIdade(funcionarios);

        gerarDelimitador();

        // Imprimir lista de funcionarios por ordem alfabética
        listarFuncionariosOrdenados(funcionarios);

        gerarDelimitador();

        // Imprimir total dos salários dos funcionarios
        listarTotalSalarioFuncionarios(funcionarios);

        gerarDelimitador();

        // Imprimir quantos salários mínimos ganha cada funcionário
        listarSalarioMinimoPorFuncionario(funcionarios);

        gerarDelimitador();

    }


    public static void gerarDelimitador() {
        System.out.println("\n------------------------------------------------------------------------------------------\n");
    }

}
