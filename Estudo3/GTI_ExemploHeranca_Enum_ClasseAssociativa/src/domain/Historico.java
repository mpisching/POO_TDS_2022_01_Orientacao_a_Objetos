/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mpisc
 */
public class Historico {
    private List<Movimentacao> movimentacoes = new ArrayList<>();
    
    public void add(Movimentacao movimento) {
        movimentacoes.add(movimento);
    }
    
    public List<Movimentacao> getMovimentos(CartaoCredito cc) {
        List<Movimentacao> movimentosCliente = new ArrayList<>();
        for (Movimentacao m: movimentacoes) {
            if (m.getCartaoCredito().equals(cc)) {
                movimentosCliente.add(m);
            }
        }
        return movimentosCliente;
    }
}
