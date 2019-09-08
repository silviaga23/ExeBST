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
public class Arbol {
    
    private Nodo raiz;
    
    public Arbol(){
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public boolean insertarElemRecursivo(Nodo raiz, int info){
        if(raiz == null){
            Nodo newNodo = new Nodo(info);
            this.setRaiz(newNodo);
            return true;
        }else if(info> raiz.getInfo()){
            return this.insertarElemRecursivo(raiz.getHijoDerecho(), info);
        }else{
            return this.insertarElemRecursivo(raiz.getHijoIzquierdo(), info);
        }
    }
    
    public boolean estaElemRecursivo(Nodo raiz, int num){
        if(raiz == null){
            return false;
        }else if(raiz.getInfo() == num){
            return true;
        }else if(num > raiz.getInfo()){
            return this.estaElemRecursivo(raiz.getHijoDerecho(), num);
        }else{
            return this.estaElemRecursivo(raiz.getHijoIzquierdo(), num);
        }
    }
    
    public boolean esHoja(){
        if(this.getRaiz() == null || this.getRaiz().getHijoDerecho().getInfo() != 0 || this.getRaiz().getHijoIzquierdo().getInfo() != 0){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean estaVacio(){
        return raiz == null;
    }
    
    public void preOrden(Nodo raiz){
        if(raiz != null){
            System.out.print(raiz.getInfo() + " - ");
            this.preOrden(raiz.getHijoIzquierdo());
            this.preOrden(raiz.getHijoDerecho());
        }
    }
    public void postOrden(Nodo raiz){
        if(raiz != null){
            this.postOrden(raiz.getHijoIzquierdo());
            this.postOrden(raiz.getHijoDerecho());
            System.out.print(raiz.getInfo()+ " - ");
        }
    }
    public void inOrden(Nodo raiz){
        if(raiz != null){
            this.inOrden(raiz.getHijoDerecho());
            System.out.print(raiz.getInfo()+ " - ");
            this.inOrden(raiz.getHijoIzquierdo());
        }
    }
}
