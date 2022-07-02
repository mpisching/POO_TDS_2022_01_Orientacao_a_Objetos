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
import domain.EOperacao;
import domain.EStatus;
import domain.Movimentacao;
import domain.Poupanca;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mpisc
 */
public class MainApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        Cliente c1 = new Cliente();
        c1.setNome("Lucas");
        c1.setCpf("321.123.456-99");
        System.out.print("Status do cliente [1 - Ativo, 2 - Inativo, 3 - Em Análise]: ");
        int op = entrada.nextInt();
        switch (op) {
            case 1: c1.setStatus(EStatus.ATIVO); break;
            case 2: c1.setStatus(EStatus.INATIVO);break;
            case 3: c1.setStatus(EStatus.EM_ANALISE);break;
            default: 
                System.out.println("Opção inválida");
        }
        c1.setDataCadastro(new Date());
        
        c2.setNome("Roberta");
        c2.setCpf("111.211.456-99");
        c2.setStatus(EStatus.ATIVO);
        c2.setDataCadastro(new Date());
        
        CartaoCredito cc1 = new CartaoCredito(159);
        cc1.setLimite(2000);
        cc1.setSaldo(0.0);
        cc1.setDataValidade(new Date());
        c1.add(cc1);
        
        CartaoCredito cc2 = new CartaoCredito(147);
        cc2.setLimite(3000);
        cc2.setSaldo(2200.0);
        cc2.setDataValidade(new Date());
        c2.add(cc2);
        
        //movimentacoes cliente 1
        cc1.depositar(100);

        cc1.sacar(500);

       
        imprimirMovimentacoes(cc1);
        
        //movimentacoes cliente 2
        cc2.depositar(1000);
       
        cc2.sacar(600);

        
        imprimirMovimentacoes(cc2);
       
        System.out.println("Cliente: " + c1.getDados(true));
        
    }
    
    public static void imprimir(Conta conta) {
        //System.out.println(conta.getDados());
        ContaDetalhada.imprimir(conta);
    }
    
    public static void imprimirMovimentacoes(CartaoCredito cc) {
        List<Movimentacao> movimentos = cc.getMovimentos();
        for (Movimentacao m: movimentos) {
            System.out.print(m.getDados());
        }
    }
}
