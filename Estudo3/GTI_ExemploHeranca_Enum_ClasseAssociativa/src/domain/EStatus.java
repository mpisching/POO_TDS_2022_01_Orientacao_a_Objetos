/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public enum EStatus {
    ATIVO(1, "Ativo", "O cliente está ativo"), 
    INATIVO (2, "Inativo", "O cliente está inátivo"), 
    EM_ANALISE (3, "Em análise", "O cadastro do cliente está em análise");
    
    private int codigo;
    private String descricao;
    private String detalhamento;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDetalhamento() {
        return detalhamento;
    }
    
    private EStatus(int codigo, String descricao, String detalhamento) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.detalhamento = detalhamento;
    }
}
