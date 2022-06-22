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
import domain.EStatusCartao;
import domain.IOperacao;
import java.util.Scanner;


/**
 *
 * @author mpisc
 */
public class MainApp {

    public static void main(String[] args) {
//        Conta conta = new Conta();
//        conta.setNumero(100);
//        conta.depositar(2000);
/* --- voltando ao passado ... exemplo de variáveis e constantes */
   
        //declaração de variáveis
        int x = 10;
        System.out.println("x: " + x);
        x = 12;
        System.out.println("x: " + x);
        
        //declaracao de constantes
        final int constante;
        //System.out.println("Constante: " + constante);
        System.out.println("Informe o valor da constante: " );
        constante = (new Scanner(System.in)).nextInt();
        //constante = 12;//não é possível modificar o valor de uma constante
        System.out.println("Constante: " + constante);
        //modificar o valor da constante?
        //constante = (new Scanner(System.in)).nextInt();

/* fim do exemplo de variáveis e constantes */        
 
/**
 * Exemplo de objeto na memória sem variável de referência
 */
        new CartaoCredito();//instância criada sem variável de referência,
                            //será um objeto removido automaticamente pelo
                            //coletor automático de lixo (Garbage Collection)
                            //do ambiente Java (JVM).
/* fim do exemplo de objeto sem variável de referência */

        Cliente cliente = new Cliente();
        cliente.setCpf("999.999.888-99");
        cliente.setNome("Roberto");
        cliente.setStatus(EStatus.INATIVO);
        
        CartaoCredito.setTaxaTransacaoATM(5.0);        
              
        CartaoCredito cartao1 = new CartaoCredito();
        //cartao.setCliente(cliente);
        cartao1.setDataValidade("12/01/2025");
        cartao1.setLimite(10000);
        cartao1.setNumero(1234432);
        cartao1.setStatus(EStatusCartao.DESBLOQUEADO);
        
        
        
        cliente.add(cartao1);
        
        CartaoCredito cartao2 = new CartaoCredito();
        //cartao.setCliente(cliente);
        cartao2.setDataValidade("21/10/2025");
        cartao2.setLimite(15000);
        cartao2.setNumero(4321543);
        cartao2.setStatus(EStatusCartao.BLOQUEADO);
        
        cliente.add(cartao2);
        
       // cliente.remove(cartao2);
       // cliente.remove(cartao);
        
        
        System.out.println(cliente.getDados());
        
        sacar(cartao1, 200.00);
        if (!sacar(cartao2, 100.00)) {
            System.out.println("Não foi possível executar a operação de saque" + "\n"
                    + "Status do cartao: " + cartao2.getStatus().getDescricao());
        }
        
        
        System.out.println(cartao1.getDados());
        System.out.println(cartao2.getDados());
//        
//        sacar(conta, 100.00);
//        //System.out.println(cc);
//
//        conta = new Poupanca();
//        conta.setNumero(999);
//        conta.depositar(1000);
//        ((Poupanca) conta).setDiaAniversario(10);
//        //System.out.println(cp);
//
//        if (conta.sacar(500)) {
//            System.out.println("Saque realizado com sucesso");
//        } else {
//            System.out.println("Saldo é insuficiente...");
//        }
        
      
        
    }
    
    public static boolean sacar(IOperacao operacao, double quantia) {
        return operacao.sacar(quantia);
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
