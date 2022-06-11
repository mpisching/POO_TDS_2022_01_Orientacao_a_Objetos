/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Conta;
import domain.ContaCorrente;
import domain.ContaDetalhada;
import domain.Poupanca;

/**
 *
 * @author mpisc
 */
public class MainApp {
    public static void main(String[] args) {
        Conta conta = new Poupanca();
        conta.setNumero(1111);
        conta.setSaldo(333);
        ((Poupanca)conta).setDiaAniversario(22);//downcast
        imprimir(conta);
        
        Poupanca cp = new Poupanca();
        cp.setNumero(1234);
        cp.setSaldo(1000);
        cp.setDiaAniversario(21);
        imprimir(cp);
        cp.sacar(500);
        imprimir(cp);
        
        ContaCorrente.setTaxaJuro(0.5);//definição de um valor estático - compartilhado 
        //com todos os objetos da classe
        
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setNumero(4321);
        cc1.setSaldo(4040);
        cc1.setLimite(10000);
        imprimir(cc1);
        cc1.sacar(6000);
        //imprimir(cc1);
        ContaDetalhada.imprimir(cc1);
        
        ContaCorrente cc2 = new ContaCorrente();
        cc2.setNumero(4321);
        cc2.setSaldo(2040);
        cc2.setLimite(10000);
        imprimir(cc2);
        
    }
    
    public static void imprimir(Conta conta) {
        //System.out.println(conta.getDados());
        ContaDetalhada.imprimir(conta);
    }
}
