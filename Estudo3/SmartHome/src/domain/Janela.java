/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Janela implements IAbertura, IFechadura {

    private boolean fechada;
    private boolean travada;
    
    private Localizacao local;
    
    public Janela(Localizacao local) {
        fechada = true;//a janela está fechada
        travada = true;//a janela está travada
        this.local = local;//a janela estará posta em algum local
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
