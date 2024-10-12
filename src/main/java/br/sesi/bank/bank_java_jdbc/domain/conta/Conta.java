package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.Cliente;
import java.math.BigDecimal;

public class Conta {
    private Integer numero;
    private BigDecimal valor;
    private Cliente titular;

    public Conta(Integer numero, BigDecimal valor, Cliente titular){
       this.numero = numero;
       this.valor = valor;
       this.titular = titular;

    }
    public boolean possuiSaldo(){
        return true;
    }
    public void sacar(BigDecimal valor){

    }
    public void publicar(BigDecimal valor){

    }
    public Integer getnumero() {
        return numero;
    }
    public BigDecimal getvalor() {
        return valor;
    }
    public Cliente gettitular() {
        return titular;
    }

}
