/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import entity.Aluno;

/**
 *
 * @author mpisc
 */
public class MainApp {
    public static void main(String[] args) {
        Aluno a = new Aluno(111, "Joao", "999.888.777-99");
        System.out.println("Aluno: " + a.matricula + " - " + a.nome + " - " + a.cpf);
    }
}
