/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mpisc
 */
public class CartaoCredito implements IOperacao {
    private static double taxaTransacaoATM;
    private int numero;
    private double limite;
    private Date dataValidade;
    private double saldo;
   
    private Cliente cliente;
    
    private List<Movimentacao> movimentacoes = new ArrayList<>();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public CartaoCredito(int numero) {
        this.numero = numero;
    }

    public CartaoCredito(int numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public static double getTaxaTransacaoATM() {
        return taxaTransacaoATM;
    }

    public static void setTaxaTransacaoATM(double taxaTransacaoATM) {
        CartaoCredito.taxaTransacaoATM = taxaTransacaoATM;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean sacar(double quantia) {
        this.saldo -= quantia;
        movimentacoes.add(new Movimentacao(quantia, new Date(),
                            EOperacao.SAQUE, this));
        return true;
    }

    @Override
    public void depositar(double quantia) {
        this.saldo += quantia;
        movimentacoes.add(new Movimentacao(quantia, new Date(),
                            EOperacao.DEPOSITO, this));
    }
    
    public List<Movimentacao> getMovimentos() {
        return movimentacoes;
    }
    
}
