package br.sesi.bank.bank_java_jdbc.domain.cliente;

public class DadosCadastroCliente {
    public String nome, cpf, email;

    public DadosCadastroCliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
}
