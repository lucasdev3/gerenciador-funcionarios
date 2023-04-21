package app.entidades.genericas;

import lombok.Getter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Getter
public class Funcionario extends Pessoa implements Comparable<Funcionario> {

    private BigDecimal salario;

    private final String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }


    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Funcionario outroFuncionario) {
        return this.getNome().compareTo(outroFuncionario.getNome());
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        String salarioFormatado = formato.format(getSalario());
//        return "Nome: " + getNome() + ", Data de Nascimento: " + getDataNascimento().format(formatter);
        return String.format("Nome: %s | Data de Nascimento: %s | Salario: R$%s | Funcao: %s", getNome(), getDataNascimento().format(formatter), salarioFormatado, getFuncao());
    }


}
