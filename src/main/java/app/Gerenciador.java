package app;

import app.entidades.genericas.Funcionario;

import java.util.LinkedList;

import static app.servicos.Tarefas.*;

public class Gerenciador {

    public static void main(String[] args) {


        // Criando base de funcionarios
        System.out.println("\nGerando base inicial");
        LinkedList<Funcionario> funcionarios = gerarBaseInicial();
        listarFuncionarios(funcionarios);

        // Remover o funcionário "Joao"
        removerFuncionarioPeloNome(funcionarios, "Joao");
        listarFuncionarios(funcionarios);

        // Aumentar salário dos funcionarios em 10%
        aumentarSalarioFuncionarios(funcionarios);
        listarFuncionarios(funcionarios);

        // Listar funcionarios agrupados por função
        listarFuncionariosAgrupadosPorFuncao(funcionarios);

        // Imprimir funcionarios que fazem aniversario em outubro e dezembro
        System.out.println("\nFuncionarios que fazem aniversario em outubro");
        funcionariosAniversario(funcionarios, 10);
        System.out.println("\nFuncionarios que fazem aniversario em dezembro");
        funcionariosAniversario(funcionarios, 12);

        // Imprimir funcionário com maior idade
        funcionarioMaiorIdade(funcionarios);

        // Imprimir lista de funcionarios por ordem alfabética
        listarFuncionariosOrdenados(funcionarios);

        // Imprimir total dos salários dos funcionarios
        listarTotalSalarioFuncionarios(funcionarios);

        // Imprimir quantos salários mínimos ganha cada funcionário
        listarSalarioMinimoPorFuncionario(funcionarios);


    }


}
