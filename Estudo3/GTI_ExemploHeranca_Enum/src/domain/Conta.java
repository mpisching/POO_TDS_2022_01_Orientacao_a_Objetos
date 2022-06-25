/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public abstract class Conta implements IOperacao {
    private int numero;
    protected double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean sacar(double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
            return true;
        }
        return false;
    }
    
    public void depositar(double quantia) {
        saldo += quantia;
    }
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de conta.....: ").append(this.getClass().getSimpleName()).append("\n");
        sb.append("Numero da Conta...: ").append(numero).append("\n");
        sb.append("Saldo.............: ").append(saldo).append("\n");
        
        /* melhorando o código e implementando overriding do método getDados,
           para implementar na classe Poupanca o que pertence a ela.
        */
        //sb.append("Dia Aniversário...: ").
        //        append(((Poupanca)this).getDiaAniversario()).append("\n");
        return sb.toString();
    }
}
