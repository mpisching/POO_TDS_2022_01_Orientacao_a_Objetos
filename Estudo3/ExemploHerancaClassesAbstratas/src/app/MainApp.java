/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Conta;
import domain.ContaCorrente;
import domain.ContaDetalhada;
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
        
        Conta conta = new ContaCorrente();
        conta.setNumero(101);
        conta.depositar(4000);
        ((ContaCorrente)conta).setLimite(1000);
        ((ContaCorrente)conta).setTaxaJuro(0.8);
        conta.sacar(2000);
        
        imprimir(conta);
        //System.out.println(cc);
        
        conta = new Poupanca();
        conta.setNumero(999);
        conta.depositar(1000);
        ((Poupanca)conta).setDiaAniversario(10);
        //System.out.println(cp);
        
        if (conta.sacar(500)) {
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo é insuficiente...");
        }
        
//        System.out.println("Dados da conta corrente: " +
//                "Numero: " + cc.getNumero() + 
//                "Saldo: " + cc.getSaldo() +
//                "Taxa de juro: " + cc.getTaxaJuro() + 
//                "Limite: " + cc.getLimite()
//        );
//        
//        System.out.println("Dados da poupança: " +
//                "Numero: " + cp.getNumero() + 
//                "Saldo: " + cp.getSaldo() +
//                "Dia de aniversário: " + cp.getDiaAniversario() 
//        );        
        

        imprimir(conta);
    }
    
    public static void imprimir(Conta conta) {
        ContaDetalhada cd = new ContaDetalhada();
        System.out.println(cd.imprimir(conta));
//        DecimalFormat df = new DecimalFormat("0.00");
//        if (conta instanceof ContaCorrente) {
//            System.out.println("Dados da conta corrente: " +
//                "Numero: " + conta.getNumero() + 
//                "Saldo: " + df.format(conta.getSaldo()) +
//                "Taxa de juro: " + ((ContaCorrente)conta).getTaxaJuro() + 
//                "Limite: " + ((ContaCorrente)conta).getLimite()
//            );        
//        } else {
//            System.out.println("Dados da poupança: " +
//                "Numero: " + conta.getNumero() + 
//                "Saldo: " + df.format(conta.getSaldo()) +
//                "Dia de aniversário: " + ((Poupanca)conta).getDiaAniversario() 
//            );             
//        }
    }
}
