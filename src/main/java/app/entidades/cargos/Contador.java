package app.entidades.cargos;

import app.entidades.genericas.Funcionario;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class Contador extends Funcionario {

    public Contador(String nome, LocalDate dataNascimento, BigDecimal salario) {
        super(nome, dataNascimento, salario, "Contador");
    }


}

