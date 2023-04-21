package app.servicos.impl;

import app.genericas.Funcionario;
import app.servicos.FuncionarioFactory;
import app.cargos.Eletricista;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
public class EletricistaFactory implements FuncionarioFactory {


    @Override
    public Funcionario criarFuncionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        return new Eletricista(nome, dataNascimento, salario);
    }


}
