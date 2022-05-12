/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Cidade {
    private String nome;
    private String uf;

    /**
     * Método para construir um objeto do tipo cidade
     */
    public Cidade() {
        
    }
    
    /**
     * Método para construir um objeto do tipo cidade
     * @param nome - é nome da cidade
     */
    public Cidade(String nome) {
        this.nome = nome;
    }
    
    /**
     * Método para construir um objeto do tipo cidade
     * @param nome - nome da cidade
     * @param uf - Unidade da Federação da Cidade
     */
    public Cidade(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
