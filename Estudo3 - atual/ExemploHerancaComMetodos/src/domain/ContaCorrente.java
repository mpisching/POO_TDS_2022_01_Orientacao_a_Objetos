/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class ContaCorrente extends Conta{
    private double limite;
    private double taxaJuro;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }
    
    
}
