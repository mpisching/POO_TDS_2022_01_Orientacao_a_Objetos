/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Conta extends Object {
    private int numero;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

//    public void setSaldo(double saldo) {
//        this.saldo = saldo;
//    }
    
    public boolean sacar(double quantia) {
        if (quantia <= saldo) {
            this.saldo -= quantia;
            return true;
        } else {
            return false;
        }
    }
    
    public void depositar(double quantia) {
        this.saldo += quantia;
    }
    
    public void calcularTarifacao(double quantia, double tx) {
        double valor = quantia * tx;
        this.saldo -= valor;
    }    

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + '}';
    }
    

    
    
}
