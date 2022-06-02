/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Giratoria extends Porta {

    public Giratoria(Localizacao local) {
        super(local);
    }
    
    @Override
    public void fechar() {
        System.out.println("Mecanismo da porta " + 
                getClass().getSimpleName() + " está sendo acionado");
        super.fechar();
    }
    
}
