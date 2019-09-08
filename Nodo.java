/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbusqueda;

/**
 *
 * @author nandi
 */
public class Nodo {
    private int info;
    private Nodo hijoDerecho;
    private Nodo hijoIzquierdo;

    public Nodo(int info, Nodo hijoDerecho, Nodo hijoIzquierdo) {
        this.info = info;
        this.hijoDerecho = hijoDerecho;
        this.hijoIzquierdo = hijoIzquierdo;
    }
    
    public Nodo(int info) {
        this.info = info;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }
    
    
    
}
