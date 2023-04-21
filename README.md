# Avaliação app.Gerenciador de Funcionarios

## Desenvolvedor - Lucas Souza

#### Qualificações

* Java Core
* Maven
* Spring Boot
* JPA e JDBC
* SOLID
* Design Patterns
* Oracle DB, MySQL
* Linux
* Shell Script
* Git e CVS
* HTML, CSS e Javascript

#### Contatos
* Linkedin - https://www.linkedin.com/in/lucas-souza-478a031ab/
* GitHub - https://www.github.com/lucasdev3/

### Desafio Java

Considerando que uma indústria possui as pessoas/funcionários abaixo:

Diante disso, você deve desenvolver um projeto java, com os seguintes requisitos:

* 1– Classe Pessoa com os atributos: nome (String) e data nascimento (LocalDate).

* 2 – Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String).

* 3 – Deve conter uma classe Principal para executar as seguintes ações:
    * 3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
    * 3.2 – Remover o funcionário “João” da lista.
    * 3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:
        * informação de data deve ser exibido no formato dd/mm/aaaa;
        * informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.
    * 3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
    * 3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
    * 3.6 – Imprimir os funcionários, agrupados por função.
    * 3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
    * 3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
    * 3.10 – Imprimir a lista de funcionários por ordem alfabética.
    * 3.11 – Imprimir o total dos salários dos funcionários.
    * 3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.

### DESENVOLVIMENTO

#### Tecnologias utilizadas

* Sistema Operacional: Windows (Compativel com linux, testado nas distribuições Ubuntu e Fedora).
* Java JDK-17.
* Maven 3.8.6.
* SOLID
* Design Patterns
* TDD


#### Pontos de atenção

* Verifique a versão do Java
* Verifique a versão do Maven
* Compilar projeto e gerar artefato no target:
      ``` mvn clean package ```


#### Resultado esperado "clean package"
![imgs/clean_package.png](imgs/clean_package.png)


#### Resultado esperado execução do artefato ( arquivo jar no diretório /target )
![imgs/saida_part1.png](imgs/saida_part1.png)
![imgs/saida_part2.png](imgs/saida_part2.png)
![imgs/saida_part3.png](imgs/saida_part3.png)