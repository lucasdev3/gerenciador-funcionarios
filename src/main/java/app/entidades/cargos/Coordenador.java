package app.entidades.cargos;

import app.entidades.genericas.Funcionario;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class Coordenador extends Funcionario {

    public Coordenador(String nome, LocalDate dataNascimento, BigDecimal salario) {
        super(nome, dataNascimento, salario, "Coordenador");
    }


}

