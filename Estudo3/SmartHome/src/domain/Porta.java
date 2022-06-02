/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public abstract class Porta implements IAbertura, IFechadura{
    protected boolean fechada;
    protected boolean travada;
    
    private Localizacao local;
    
    public Porta(Localizacao local) {
        this.fechada = true;
        this.travada = true;
        this.local = local;
    }
    
    public boolean isFechada() {
        return fechada;
    }

    public boolean isTravada() {
        return travada;
    }
    
    @Override
    public void abrir() {
        if (fechada) {
            System.out.println("Abrindo porta " + getClass().getSimpleName()+ " " + local.toString());
            fechada = false;//porta está aberta
        } else {
            System.out.println("a porta já está aberta");
        }
    }

    @Override
    public void fechar() {
        if (!fechada) {
            System.out.println("fechando porta " + getClass().getSimpleName()+ " "  + local.toString());
            fechada = true;
        } else {
            System.out.println("a porta já está fechada");
        }
        
    }

    @Override
    public boolean getStatus() {
        return this.travada && this.fechada;
    }

    @Override
    public void travar() {
        if (fechada && !travada) {
            System.out.println("travando porta " + getClass().getSimpleName()+ " "  + local.toString());
            travada = true;
        } else {
            System.out.println("impossível travar a porta...");
        }
    }

    @Override
    public void destravar() {
        if (travada) {
            System.out.println("destravando porta " + getClass().getSimpleName()+ " " + local.toString());
            travada = false;
        }
    }    
}
