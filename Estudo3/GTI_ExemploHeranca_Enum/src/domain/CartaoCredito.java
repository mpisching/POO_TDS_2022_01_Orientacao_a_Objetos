/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;

/**
 *
 * @author mpisc
 */
public class CartaoCredito {
    private static double taxaTransacaoATM;
    private int numero;
    private double limite;
    private Date dataValidade;
    private double saldo;
   
    private Cliente cliente;

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
    
}
