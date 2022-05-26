/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Estoque {
    private int quantidade;
    private int quantidadeMaxima;
    private int quantidadeMinima;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    
    public boolean retirar(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            return true;
        } else {
            return false;
        }
    } 
    
    public boolean repor(int quantidade) {
        if ((quantidade + this.quantidade) <= quantidadeMaxima ) {
            this.quantidade += quantidade;
            return true;
        } else {
            return false;
        }
    }
    
    public int saldo() {
        return this.quantidade;
    }
}
