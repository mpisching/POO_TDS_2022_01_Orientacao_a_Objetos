/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Janela extends Abertura {

    private int distanciaDoPiso;

    public int getDistanciaDoPiso() {
        return distanciaDoPiso;
    }

    public void setDistanciaDoPiso(int distanciaDoPiso) {
        this.distanciaDoPiso = distanciaDoPiso;
    }
    
    
    public Janela(Localizacao local) {
        super(local);
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
            System.out.println("abrindo janela ... " + local.toString());
            fechada = false;//janela está aberta
        } else {
            System.out.println("a janela já está aberta");
        }
    }

    @Override
    public void fechar() {
        if (!fechada) {
            System.out.println("fechando janela..."  + local.toString());
            fechada = true;
        } else {
            System.out.println("a janela já está fechada");
        }
        
    }

    @Override
    public boolean getStatus() {
        return this.travada && this.fechada;
    }

    @Override
    public void travar() {
        if (fechada && !travada) {
            System.out.println("travando janela..."  + local.toString());
            travada = true;
        } else {
            System.out.println("impossível travar a janela...");
        }
    }

    @Override
    public void destravar() {
        if (travada) {
            System.out.println("destravando janela..."  + local.toString());
            travada = false;
        }
    }
    
}
