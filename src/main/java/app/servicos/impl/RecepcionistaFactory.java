package app.servicos.impl;

import app.entidades.genericas.Funcionario;
import app.servicos.FuncionarioFactory;
import app.entidades.cargos.Recepcionista;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
public class RecepcionistaFactory implements FuncionarioFactory {


    @Override
    public Funcionario criarFuncionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        return new Recepcionista(nome, dataNascimento, salario);
    }


}
