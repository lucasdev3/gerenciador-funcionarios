package app.servicos.impl;

import app.entidades.cargos.Operador;
import app.entidades.genericas.Funcionario;
import lombok.NoArgsConstructor;
import app.servicos.FuncionarioFactory;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
public class OperadorFactory implements FuncionarioFactory {


    @Override
    public Funcionario criarFuncionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        return new Operador(nome, dataNascimento, salario);
    }


}
