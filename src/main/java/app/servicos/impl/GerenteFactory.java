package app.servicos.impl;

import app.servicos.FuncionarioFactory;
import app.entidades.cargos.Gerente;
import app.entidades.genericas.Funcionario;
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
