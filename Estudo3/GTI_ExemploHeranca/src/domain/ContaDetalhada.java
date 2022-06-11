/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class ContaDetalhada {
    
    public static void imprimir(Conta conta) {//dependência de classe - 
                                        //ContaDetalhada depende de Conta
        System.out.println(conta.getDados());
    }
}
