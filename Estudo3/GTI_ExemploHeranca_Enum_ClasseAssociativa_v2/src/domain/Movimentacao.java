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
public class Movimentacao {
    private double valor;
    private Date dia;
    private EOperacao eOperacao;
    
    private CartaoCredito cartaoCredito;
    private Cliente cliente;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public EOperacao geteOperacao() {
        return eOperacao;
    }

    public void seteOperacao(EOperacao eOperacao) {
        this.eOperacao = eOperacao;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Movimentacao(double valor, Date dia, EOperacao eOperacao, CartaoCredito cartaoCredito) {
        this.valor = valor;
        this.dia = dia;
        this.eOperacao = eOperacao;
        this.cartaoCredito = cartaoCredito;
        this.cliente = cartaoCredito.getCliente();
    }
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(cliente.getNome()).append(" - ").
                append(cartaoCredito.getNumero()).append(" - ").
                append(eOperacao).append(" R$ ").append(valor).append("\n");
        return sb.toString();
    }
     
}
