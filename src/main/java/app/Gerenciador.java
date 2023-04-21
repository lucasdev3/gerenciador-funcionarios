import entidades.genericas.Funcionario;

import java.util.LinkedList;

import static servicos.Tarefas.*;

public class Gerenciador {

    public static void main(String[] args) {


        // Criando base de funcionarios
        System.out.println("\nGerando base inicial");
        LinkedList<Funcionario> funcionarios = generarBaseInicial();
        listarFuncionarios(funcionarios);

        // Remover o funcionário "João"
        removerFuncionarioPeloNome(funcionarios, "Caio");
        listarFuncionarios(funcionarios);

        // Aumentar salário dos funcionários em 10%
        aumentarSalarioFuncionarios(funcionarios);
        listarFuncionarios(funcionarios);

        // Listar funcionarios agrupados por função
        listarFuncionariosAgrupadosPorFuncao(funcionarios);

        // Imprimir funcionários que fazem aniversário em outubro e dezembro
        System.out.println("\nFuncionários que fazem aniversário em outubro");
        funcionariosAniversario(funcionarios, 10);
        System.out.println("\nFuncionários que fazem aniversário em dezembro");
        funcionariosAniversario(funcionarios, 12);

        // Imprimir funcionário com maior idade
        funcionarioMaiorIdade(funcionarios);

        // Imprimir lista de funcionários por ordem alfabética
        listarFuncionariosOrdenados(funcionarios);

        // Imprimir total dos salários dos funcionários
        listarTotalSalarioFuncionarios(funcionarios);

        // Imprimir quantos salários mínimos ganha cada funcionário
        listarSalarioMinimoPorFuncionario(funcionarios);


    }


}
