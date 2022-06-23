/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Poupanca extends Conta {
    private int diaAniversario;

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
    
    @Override
    public void sacar(double quantia) throws Exception{
        super.sacar(quantia);
        calcularTarifacao(quantia, 0.0002);
    }
    
    @Override
    public void depositar(double quantia) {
        super.depositar(quantia);
        calcularTarifacao(quantia, 0.0002);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPoupanca{" + "diaAniversario=" + diaAniversario + '}';
    }
    

    
}
