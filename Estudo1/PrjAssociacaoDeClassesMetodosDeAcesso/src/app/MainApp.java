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
        d1.setCodigo(1);
        d1.setLocal("Bloco central");
        d1.setNome("Vendas");
        
        Departamento d2 = new Departamento();
        d2.setCodigo(2);
        d2.setLocal("Bloco A");
        d2.setNome("Almoxarifado");
        
        Funcionario f1 = new Funcionario();
        f1.setMatricula(100);
        f1.setNome("Mauro");
        f1.setSalario(2000.0F);
        f1.setDepartamento(d2);        
        
        Funcionario f2 = new Funcionario();
        f2.setMatricula(101);
        f2.setNome("Maiara");
        f2.setSalario(-2500.0F);
        f2.setDepartamento(d1);          
        
        System.out.println("Dados do " + f1.getNome());
        System.out.println("Matricula...: " + f1.getMatricula());
        System.out.println("Salario.....: " + f1.getSalario());
        System.out.println("Departamento: " + f1.getDepartamento().getNome() + " - " + 
                f1.getDepartamento().getLocal());

        System.out.println("Dados do " + f2.getNome());
        System.out.println("Matricula...: " + f2.getMatricula());
        System.out.println("Salario.....: " + f2.getSalario());
        System.out.println("Departamento: " + f2.getDepartamento().getNome() + " - " + 
                f2.getDepartamento().getLocal());

    }
   
}
