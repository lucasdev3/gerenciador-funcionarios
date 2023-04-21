package app.servicos;

import app.entidades.genericas.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface FuncionarioFactory {

    Funcionario criarFuncionario(String nome, LocalDate dataNascimento, BigDecimal salario);

}
