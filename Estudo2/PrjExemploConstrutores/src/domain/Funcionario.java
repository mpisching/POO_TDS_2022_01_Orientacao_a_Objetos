/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Funcionario {
    private int matricula;
    private String nome;
    private float salario;
    
    private Departamento departamento;
    private Endereco endereco;
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) throws Exception{
        if (salario >= 0.0f) {
            this.salario = salario;
        } else {
            throw new Exception("Salário inválido");
        }
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    
}
