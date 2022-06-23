/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public interface IOperacao {
    public void sacar(double quantia) throws Exception;
    public void depositar(double quantia);
    public double getSaldo();
}
