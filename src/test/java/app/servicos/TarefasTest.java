package app.servicos;

import app.entidades.genericas.Funcionario;
import app.entidades.genericas.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.LinkedList;

@DisplayName("Tarefas Testes")
class TarefasTest {

    @Test
    @DisplayName("verifica se a lista de funcionários gerada pela função gerarBaseInicial() não é nula e tem tamanho 10.")
    public void testGerarBaseInicial() {
        LinkedList<Funcionario> funcionarios = Tarefas.gerarBaseInicial();
        Assertions.assertNotNull(funcionarios);
        Assertions.assertEquals(10, funcionarios.size());
    }

    @Test
    @DisplayName("verifica se a função listarFuncionarios() pode ser executada sem erros.")
    public void testListarFuncionarios() {
        LinkedList<Funcionario> funcionarios = Tarefas.gerarBaseInicial();
        Tarefas.listarFuncionarios(funcionarios);
    }

    @Test
    @DisplayName("verifica se a função listarFuncionariosOrdenados() pode ser executada sem erros.")
    public void testListarFuncionariosOrdenados() {
        LinkedList<Funcionario> funcionarios = Tarefas.gerarBaseInicial();
        Tarefas.listarFuncionariosOrdenados(funcionarios);
    }

    @Test
    @DisplayName("verifica se a função listarFuncionariosAgrupadosPorFuncao() pode ser executada sem erros.")
    public void testListarFuncionariosAgrupadosPorFuncao() {
        LinkedList<Funcionario> funcionarios = Tarefas.gerarBaseInicial();
        Tarefas.listarFuncionariosAgrupadosPorFuncao(funcionarios);
    }

    @Test
    @DisplayName("verifica se a função removerFuncionarioPeloNome() remove corretamente um funcionário da lista.")
    public void testRemoverFuncionarioPeloNome() {
        LinkedList<Funcionario> funcionarios = Tarefas.gerarBaseInicial();
        Tarefas.removerFuncionarioPeloNome(funcionarios, "Joao");
        Assertions.assertFalse(funcionarios.stream().anyMatch(f -> f.getNome().equals("Joao")));
    }

    @Test
    @DisplayName("""
             verifica se a função aumentarSalarioFuncionarios() aumenta corretamente o salário de todos os funcionários
             e se o salário de um funcionário específico (Maria) é maior após o aumento.
            """)
    public void testAumentarSalarioFuncionarios() {
        LinkedList<Funcionario> funcionarios = Tarefas.gerarBaseInicial();
        BigDecimal salarioMariaAntes = funcionarios.stream()
                .filter(f -> f.getNome().equals("Maria"))
                .map(Funcionario::getSalario)
                .findFirst()
                .orElse(null);
        Tarefas.aumentarSalarioFuncionarios(funcionarios);
        BigDecimal salarioMariaDepois = funcionarios.stream()
                .filter(f -> f.getNome().equals("Maria"))
                .map(Funcionario::getSalario)
                .findFirst()
                .orElse(null);
        Assertions.assertNotNull(salarioMariaAntes);
        Assertions.assertNotNull(salarioMariaDepois);
        Assertions.assertTrue(salarioMariaDepois.compareTo(salarioMariaAntes) > 0);
    }

    @Test
    @DisplayName("verifica se a função funcionariosAniversario() pode ser executada sem erros.")
    public void testFuncionariosAniversario() {
        LinkedList<Funcionario> funcionarios = Tarefas.gerarBaseInicial();
        Tarefas.funcionariosAniversario(funcionarios, 5);
    }

    @Test
    @DisplayName("verifica se a função funcionarioMaiorIdade() retorna o funcionário mais velho corretamente.")
    public void testFuncionarioMaiorIdade() {
        LinkedList<Funcionario> funcionarios = Tarefas.gerarBaseInicial();
        Funcionario funcionarioMaisVelho = funcionarios.stream()
                .min(Comparator.comparing(Pessoa::getDataNascimento))
                .orElse(null);
        Assertions.assertNotNull(funcionarioMaisVelho);
        Assertions.assertEquals("Caio", funcionarioMaisVelho.getNome());
    }

}