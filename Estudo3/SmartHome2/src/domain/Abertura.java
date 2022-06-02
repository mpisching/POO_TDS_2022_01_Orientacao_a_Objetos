/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public abstract class Abertura implements IAbertura, IFechadura{

    protected boolean fechada;
    protected boolean travada;
    
    protected Localizacao local;   
    
    protected Fechadura fechadura;

    public Localizacao getLocal() {
        return local;
    }

//    public void setLocal(Localizacao local) {
//        this.local = local;
//    }
    
    
    public Abertura(Localizacao local) {
        this.fechada = true;
        this.travada = true;
        this.local = local;   
        this.fechadura = new Fechadura();
    }
}
