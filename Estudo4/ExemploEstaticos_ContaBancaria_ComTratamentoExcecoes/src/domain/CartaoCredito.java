/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class CartaoCredito implements IOperacao {
    private int numero;
    private double limite;
    private String dataValidade;
    private double saldo;
    private static double taxaTransacaoATM = 2.0;

    public static double getTaxaTransacaoATM() {
        return taxaTransacaoATM;
    }

    public static void setTaxaTransacaoATM(double taxaTransacaoATM) {
        CartaoCredito.taxaTransacaoATM = taxaTransacaoATM;
    }
    
    private Cliente cliente;
    
    private EStatusCartao status;

    public EStatusCartao getStatus() {
        return status;
    }

    public void setStatus(EStatusCartao status) {
        this.status = status;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public void sacar(double quantia) throws Exception {
        if (status == EStatusCartao.DESBLOQUEADO) {
            if (quantia <= (limite + saldo)) {
                this.saldo -= quantia;
                this.saldo -= taxaTransacaoATM;
            } else {
                throw new Exception("Saldo insuficiente");
            }
        }
    }

    @Override
    public void depositar(double quantia) {
        this.saldo += quantia;
        this.saldo -= taxaTransacaoATM;
    }

    @Override
    public double getSaldo() {
        return saldo + limite;
    }
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNumero()).append(" Validade ").
                        append(this.getDataValidade()).append("  R$ ").
                        append(this.getSaldo()).append(" Status ---> ").
                        append(this.getStatus().getDescricao()).append("   Taxa Trans. ATM: ").
                        append(this.getTaxaTransacaoATM()).
                        append("\n");        
        return sb.toString();
    }
    
}
