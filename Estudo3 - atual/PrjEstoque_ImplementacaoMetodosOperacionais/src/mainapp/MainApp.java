/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

import domain.Estoque;
import domain.Produto;

/**
 *
 * @author mpisc
 */
public class MainApp {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setCodigo(100);
        p.setDescricao("Refri");
        p.setClassificacao("bebidas");
        p.setMargemLucro(30);
        p.setPreco(2.0);
        p.calcularPrecoVenda();
        p.setDataValidade("10/12/2022");
        p.getEstoque().setQuantidade(1000);
        p.getEstoque().setQuantidadeMaxima(2000);
        p.getEstoque().setQuantidadeMinima(100);
        System.out.println(p.getDados());
        p.getEstoque().retirar(200);
        System.out.println(p.getDados());
        p.getEstoque().repor(100);
        System.out.println(p.getDados());
        
        Produto p1 = new Produto();
    }
}
