/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Conta;
import domain.ContaCorrente;
import domain.ContaDetalhada;
import domain.ContaEspecial;
import domain.ContaEstudante;
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

        Conta conta = new ContaEstudante();
        conta.setNumero(101);
        conta.depositar(4000);
        ((ContaCorrente) conta).setLimite(1000);
        ((ContaCorrente) conta).setTaxaJuro(0.8);
        conta.sacar(2000);

        imprimir(conta);
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
        
    }

    /**
     *
     * @param conta é um parâmetro que pode receber qualquer tipo de objeto
     * Conta, ou seja, uma conta corrente ou poupança
     */
    public static void imprimir(Conta conta) {
        ContaDetalhada cd = new ContaDetalhada();
        System.out.println(cd.imprimir(conta));
//        DecimalFormat df = new DecimalFormat("0.00");
//        if (conta instanceof ContaCorrente) {
//            System.out.println("Dados da conta corrente: "
//                    + "Numero: " + conta.getNumero()
//                    + "Saldo: " + df.format(conta.getSaldo())
//                    + "Taxa de juro: " + ((ContaCorrente) conta).getTaxaJuro()
//                    + "Limite: " + ((ContaCorrente) conta).getLimite()
//            );
//        } else {
//            System.out.println("Dados da poupança: "
//                    + "Numero: " + conta.getNumero()
//                    + "Saldo: " + df.format(conta.getSaldo())
//                    + "Dia de aniversário: " + ((Poupanca) conta).getDiaAniversario()
//            );
//        }
    }
//
//    public static void imprimir(ContaCorrente cc) {
//        DecimalFormat df = new DecimalFormat("0.00");
//        System.out.println("Dados da conta corrente: "
//                + "Numero: " + cc.getNumero()
//                + "Saldo: " + df.format(cc.getSaldo())
//                + "Taxa de juro: " + cc.getTaxaJuro()
//                + "Limite: " + cc.getLimite());
//    }
//    
//    public static void imprimir(Poupanca cp) {
//        DecimalFormat df = new DecimalFormat("0.00");
//            System.out.println("Dados da poupança: "
//                    + "Numero: " + cp.getNumero()
//                    + "Saldo: " + df.format(cp.getSaldo())
//                    + "Dia de aniversário: " + cp.getDiaAniversario()
//            );
//    }    
}
