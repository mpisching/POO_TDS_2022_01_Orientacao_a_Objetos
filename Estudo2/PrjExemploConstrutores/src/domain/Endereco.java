/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    
    private Cidade cidade;
    private Bairro bairro;

    /**
     * Construtor para iniciar um objeto do tipo endereco com o logradouro e o número
     * @param logradouro nome da rua/avenida/servidão/travessa ....
     * @param numero quando existir, qualquer número inteiro positivo, caso contrario, deverá ser o valor zero.
     */
    public Endereco(String logradouro, int numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }

    /**
     * Construtor para iniciar um objeto do tipo endereco com o logradouro, número, Cidade e Bairro.
     * @param logradouro nome da rua/avenida/servidão/travessa ....
     * @param numero quando existir, qualquer número inteiro positivo, caso contrario, deverá ser o valor zero.
     * @param cidade Cidade do endereço
     * @param bairro Bairro do endereço
     */
    public Endereco(String logradouro, int numero, Cidade cidade, Bairro bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.bairro = bairro;
    }
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
    
}
