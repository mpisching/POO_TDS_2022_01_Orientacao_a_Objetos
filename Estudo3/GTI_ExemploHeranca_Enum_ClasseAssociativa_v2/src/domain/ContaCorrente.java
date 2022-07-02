/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class ContaCorrente extends Conta {
    protected double limite;
    private static double taxaJuro;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public static double getTaxaJuro() {
        return taxaJuro;
    }

    public static void setTaxaJuro(double taxaJuro) {
        ContaCorrente.taxaJuro = taxaJuro;
    }
    
    @Override
    public boolean sacar(double quantia) {
        if (quantia <= (saldo + limite)) {
            saldo -= quantia;
            return true;
        }
        return false;
    }    
    
    @Override
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDados());
        sb.append("Limite............: ").append(limite).append("\n");
        sb.append("Taxa de Juros.....: ").append(taxaJuro).append("\n");
        return sb.toString();
    }
}
