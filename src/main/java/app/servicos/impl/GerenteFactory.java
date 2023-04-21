package app.servicos.impl;

import app.servicos.FuncionarioFactory;
import app.cargos.Gerente;
import app.genericas.Funcionario;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
public class GerenteFactory implements FuncionarioFactory {


    @Override
    public Funcionario criarFuncionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        return new Gerente(nome, dataNascimento, salario);
    }


}
