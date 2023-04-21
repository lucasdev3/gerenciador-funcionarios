package app.servicos;

import app.entidades.genericas.Funcionario;
import app.servicos.impl.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Tarefas {

    public static LinkedList<Funcionario> gerarBaseInicial() {

        FuncionarioFactory operadorFactoryMaria = new OperadorFactory();
        FuncionarioFactory operadorFactoryJoao = new OperadorFactory();
        FuncionarioFactory coordenadorFactoryCaio = new CoordenadorFactory();
        FuncionarioFactory diretorFactoryMiguel = new DiretorFactory();
        FuncionarioFactory recepcionistaFactoryAlice = new RecepcionistaFactory();
        FuncionarioFactory operadorFactoryHeitor = new OperadorFactory();
        FuncionarioFactory contadorFactoryArthur = new ContadorFactory();
        FuncionarioFactory gerenteFactoryLaura = new OperadorFactory();
        FuncionarioFactory eletricistaFactoryHeloisa = new OperadorFactory();
        FuncionarioFactory gerenteFactoryHeitor = new GerenteFactory();


        LinkedList<Funcionario> funcionarios = new LinkedList<>();
        funcionarios.add(operadorFactoryMaria.criarFuncionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44")));
        funcionarios.add(operadorFactoryJoao.criarFuncionario("Joao", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38")));
        funcionarios.add(coordenadorFactoryCaio.criarFuncionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14")));
        funcionarios.add(diretorFactoryMiguel.criarFuncionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88")));
        funcionarios.add(recepcionistaFactoryAlice.criarFuncionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68")));
        funcionarios.add(operadorFactoryHeitor.criarFuncionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72")));
        funcionarios.add(contadorFactoryArthur.criarFuncionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84")));
        funcionarios.add(gerenteFactoryLaura.criarFuncionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45")));
        funcionarios.add(eletricistaFactoryHeloisa.criarFuncionario("Heloisa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85")));
        funcionarios.add(gerenteFactoryHeitor.criarFuncionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93")));

        return funcionarios;

    }

    public static void listarFuncionarios(LinkedList<Funcionario> funcionarios) {
        System.out.println("\n");
        funcionarios.forEach(System.out::println);
    }

    public static void listarFuncionariosOrdenados(LinkedList<Funcionario> funcionarios) {
        System.out.println("\nLista de funcionarios por ordem alfabética:");
        Collections.sort(funcionarios);
        funcionarios.forEach(System.out::println);
    }

    public static void listarFuncionariosAgrupadosPorFuncao(LinkedList<Funcionario> funcionarios) {
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));
        System.out.println("\nFuncionarios agrupados por funcao:");
        for (Map.Entry<String, List<Funcionario>> entry : funcionariosPorFuncao.entrySet()) {
            System.out.println("\nFuncao: " + entry.getKey());
            for (Funcionario funcionario : entry.getValue()) {
                System.out.println(funcionario);
            }
        }
    }

    public static void removerFuncionarioPeloNome(LinkedList<Funcionario> funcionarios, String nome) {
        System.out.printf("\nRemovendo funcionario %s", nome);
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nome));
    }

    public static void aumentarSalarioFuncionarios(LinkedList<Funcionario> funcionarios) {
        System.out.println("\nAumentando salario dos funcionarios em 10%:");
        funcionarios.forEach(funcionario -> {
            BigDecimal novoSalario = funcionario.getSalario().multiply(new BigDecimal("1.1"));
            funcionario.setSalario(novoSalario);
        });
    }

    public static void funcionariosAniversario(LinkedList<Funcionario> funcionarios, int mes) {
        List<Funcionario> funcionariosFiltrados = funcionarios.stream()
                .filter(funcionario -> funcionario.getDataNascimento().getMonthValue() == mes)
                .toList();
        if (funcionariosFiltrados.isEmpty()) {
            System.out.printf("Nenhum funcionario encontrado no mes %d\n", mes);
        } else {
            funcionariosFiltrados.forEach(funcionario -> {
                System.out.println(funcionario.toString());
            });
        }
    }

    public static void funcionarioMaiorIdade(LinkedList<Funcionario> funcionarios) {
        System.out.println("\nFuncionario com maior idade:");
        Optional<Funcionario> funcionarioMaisVelho = funcionarios.stream().min(Comparator.comparing(Funcionario::getDataNascimento));
        funcionarioMaisVelho.ifPresent(System.out::println);
    }

    public static void listarTotalSalarioFuncionarios(LinkedList<Funcionario> funcionarios) {
        BigDecimal totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("\nTotal dos salarios dos funcionarios: " + totalSalarios);
    }

    public static void listarSalarioMinimoPorFuncionario(LinkedList<Funcionario> funcionarios) {
        System.out.println("\nSalarios minimos dos funcionarios:");
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        funcionarios.forEach(funcionario -> {
            BigDecimal salarioMinimoFracionado = funcionario.getSalario().divide(salarioMinimo, 2, RoundingMode.HALF_UP);
            System.out.println(funcionario.getNome() + ": " + salarioMinimoFracionado + " salarios minimos");
        });
    }

}
