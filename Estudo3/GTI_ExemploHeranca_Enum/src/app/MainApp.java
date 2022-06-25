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
import domain.EStatus;
import domain.Poupanca;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        //System.out.print("Data de cadastro: ");
        //String data = entrada.next();
        //c1.setDataCadastro(new Date(data));
       
//        sdf.setLenient(false);
//        try {
//            c1.setDataCadastro(sdf.parse(data));
//        } catch (ParseException ex) {
//            System.out.println("Data inválida!");
//            System.out.println("Error: " + ex.getMessage());
//        }
//        
        //System.out.println("Cliente: " + c1);
        
        CartaoCredito cc1 = new CartaoCredito(159);
        cc1.setLimite(2000);
        cc1.setSaldo(0.0);
        cc1.setDataValidade(new Date());
        c1.add(cc1);
        
        CartaoCredito cc2 = new CartaoCredito(147);
        cc2.setLimite(3000);
        cc2.setSaldo(2200.0);
        cc2.setDataValidade(new Date());
        c1.add(cc2);
        
        System.out.println("Cliente: " + c1.getDados(true));
        
    }
    
    public static void imprimir(Conta conta) {
        //System.out.println(conta.getDados());
        ContaDetalhada.imprimir(conta);
    }
}
