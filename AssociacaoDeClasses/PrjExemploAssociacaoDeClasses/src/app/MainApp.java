/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Departamento;
import domain.Funcionario;

/**
 *
 * @author mpisc
 */
public class MainApp {
    public static void main(String[] args) {
        Departamento d1 = new Departamento();
        d1.codigo = 1;
        d1.local = "Bloco central";
        d1.nome = "Vendas";
        
        Departamento d2 = new Departamento();
        d2.codigo = 2;
        d2.local = "Bloco A";
        d2.nome = "Almoxarifado";
        
        Funcionario f1 = new Funcionario();
        f1.matricula = 100;
        f1.nome = "Mauro";
        f1.salario = 2000.0F;
        f1.departamento = d2;        
        
        Funcionario f2 = new Funcionario();
        f2.matricula = 101;
        f2.nome = "Maiara";
        f2.salario = -2500.0F;
        f2.departamento = d1;          
        
        System.out.println("Dados do " + f1.nome);
        System.out.println("Matricula...: " + f1.matricula);
        System.out.println("Salario.....: " + f1.salario);
        System.out.println("Departamento: " + f1.departamento.nome + " - " + 
                f1.departamento.local);

        System.out.println("Dados do " + f2.nome);
        System.out.println("Matricula...: " + f2.matricula);
        System.out.println("Salario.....: " + f2.salario);
        System.out.println("Departamento: " + f2.departamento.nome + " - " + 
                f2.departamento.local);        
    }
   
}
