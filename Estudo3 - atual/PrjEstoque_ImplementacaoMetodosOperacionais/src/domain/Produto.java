/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Produto {
    private int codigo;
    private String descricao;
    private String classificacao;
    private String dataValidade;
    private double preco;
    private double margemLucro;
    private double precoVenda;
    
    
    private Estoque estoque;
    
    public Produto() {
        estoque = new Estoque();
    }
    

    public Estoque getEstoque() {
        return estoque;
    }

//    public void setEstoque(Estoque estoque) {
//        this.estoque = estoque;
//    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

//    public void setPrecoVenda(double precoVenda) {
//        this.precoVenda = precoVenda;
//    }
    
    public void calcularPrecoVenda() {
        this.precoVenda = preco + (preco * margemLucro / 100);
    }
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do produto").append("\n");
        sb.append("Código..........: ").append(codigo).append("\n");
        sb.append("Descricao.......: ").append(descricao).append("\n");
        sb.append("Preco...........: ").append(preco).append("\n");
        sb.append("Preco de venda..: ").append(precoVenda).append("\n");
        sb.append("Estoque.........: ").append(estoque.getQuantidade()).append("\n");
        return sb.toString();
    }
    
}
