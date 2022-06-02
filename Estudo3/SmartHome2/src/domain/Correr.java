/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Correr extends Porta {
    public Correr(Localizacao local) {
        super(local);
    }
    
    @Override
    public void fechar() {
        System.out.println("Mecanismo da porta " + 
                getClass().getSimpleName() + " está sendo acionado");
        super.fechar();
    }
    
    @Override
    public void abrir() {
        System.out.println("A porta " + 
                getClass().getSimpleName() + " está abrindo.");
        super.abrir();
    }
    
    @Override
    public void travar() {
        System.out.println("A porta " + 
                getClass().getSimpleName() + " está sendo travada.");
        super.travar();        
    }
    
    @Override
    public void destravar() {
        System.out.println("A porta " + 
                getClass().getSimpleName() + " está sendo destravada.");
        super.destravar();        
    }    
}
