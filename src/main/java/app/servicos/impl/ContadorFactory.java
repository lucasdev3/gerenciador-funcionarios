package app.servicos.impl;

import app.servicos.FuncionarioFactory;
import app.entidades.cargos.Contador;
import app.entidades.genericas.Funcionario;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
public class ContadorFactory implements FuncionarioFactory {


    @Override
    public Funcionario criarFuncionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        return new Contador(nome, dataNascimento, salario);
    }


}
