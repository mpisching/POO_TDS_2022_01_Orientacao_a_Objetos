/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;// inteiro Longo
import java.util.List;

/**
 *
 * @author mpisc
 */
public class Cliente {
    private String nome;
    private String cpf;
    private Date dataCadastro;
    
    private EStatus status;
    
    private List<CartaoCredito> cartoes;
    
    public void add(CartaoCredito cartao) {
        if (cartoes == null) {
            cartoes = new ArrayList<>();
        }
        cartoes.add(cartao);
        cartao.setCliente(this);
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
        return "Cliente{" + 
                "nome=" + nome + ", "
                + "cpf=" + cpf + ", "
                + "\nstatus=" + "[ " + status.getDescricao() + " ]" 
                + status.getDetalhamento()  + ", "
                //+ "\ndata de cadastro=" + dataCadastro.toString() + '}' ;
                + "\ndata de cadastro= " + sdf.format(dataCadastro)  
                + "\nHora do cadastro= " + sdfHora.format(dataCadastro) + '}' ;
    }
    
    public String getDados() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("D A D O S   D O   C L I E N T E").append("\n");
        sb.append("Nome.............: ").append(nome).append("\n");
        sb.append("CPF..............: ").append(cpf).append("\n");
        sb.append("Data Cadastro....: ").append(sdf.format(dataCadastro)).
                append("\n");
        return sb.toString();
    } 
    
    public String getDados(boolean comCartoes) {
        StringBuilder sb = new StringBuilder();
        sb.append(getDados());
        if (comCartoes) {
            if (cartoes != null && !cartoes.isEmpty()) {
                sb.append("C A R T O E S  D E  C R E D I T O").append("\n");
                for (CartaoCredito cc : cartoes) {
                    sb.append(cc.getNumero()).
                            append(" - ").append(" R$ ").
                            append(cc.getSaldo()).append("\n");
                }
            } else {
                sb.append("O cliente não possui cartões").append("\n");
            }
        }
        return sb.toString();
    }

    
}
