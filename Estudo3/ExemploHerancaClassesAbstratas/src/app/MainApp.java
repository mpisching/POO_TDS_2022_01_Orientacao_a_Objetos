/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.CartaoCredito;
import domain.Cliente;
import domain.Conta;
import domain.ContaCorrente;
import domain.ContaDetalhada;
import domain.IOperacao;
import domain.Poupanca;
import java.text.DecimalFormat;

/**
 *
 * @author mpisc
 */
public class MainApp {

    public static void main(String[] args) {
//        Conta conta = new Conta();
//        conta.setNumero(100);
//        conta.depositar(2000);

        Cliente cliente = new Cliente();
        cliente.setCpf("999.999.888-99");
        cliente.setNome("Roberto");
        
        Conta conta = new ContaCorrente();
        conta.setNumero(101);
        conta.depositar(4000);
        ((ContaCorrente) conta).setLimite(1000);
        ((ContaCorrente) conta).setTaxaJuro(0.8);
        conta.sacar(2000);
        conta.setCliente(cliente);

        imprimir(conta);
        
        CartaoCredito cartao = new CartaoCredito();
        cartao.setCliente(cliente);
        cartao.setDataValidade("12/01/2025");
        cartao.setLimite(10000);
        cartao.setNumero(1234432);
        
        sacar(cartao, 200.00);
        
        sacar(conta, 100.00);
        //System.out.println(cc);

        conta = new Poupanca();
        conta.setNumero(999);
        conta.depositar(1000);
        ((Poupanca) conta).setDiaAniversario(10);
        //System.out.println(cp);

        if (conta.sacar(500)) {
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo é insuficiente...");
        }
        imprimir(conta);
      
        
    }
    
    public static void sacar(IOperacao operacao, double quantia) {
        operacao.sacar(quantia);
    }

    /**
     *
     * @param conta é um parâmetro que pode receber qualquer tipo de objeto
     * Conta, ou seja, uma conta corrente ou poupança
     */
    public static void imprimir(Conta conta) {
        ContaDetalhada cd = new ContaDetalhada();
        System.out.println(cd.imprimir(conta));

    }
   
}
