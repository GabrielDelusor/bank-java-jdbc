package br.sesi.bank.bank_java_jdbc.domain.cliente;

public class Cliente {

    public String nome;
    public String cpf;
    public String email;

    public Cliente(DadosCadastroCliente dados){
        this.nome = dados.nome;
        this.cpf = dados.cpf;
        this.email = dados.email;
    }
    public String getNome(){
        return nome;
    }
    public String getcpf(){
        return cpf;
    }
    public String getemail(){
        return email;
    }


}
