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
public class Gestor {
    
    private Arbol arbol;
    
    public Gestor(){
        arbol = new Arbol ();
    }
        
    public boolean agregarNodo(int info){
        if(arbol.estaElemRecursivo(arbol.getRaiz(),info)){
            return false;
        }else{
            return arbol.insertarElemRecursivo(arbol.getRaiz(),info);
        }
    }
    
    public void preOrden(){
        arbol.preOrden(arbol.getRaiz());
    }
    public void postOrden(){
        arbol.postOrden(arbol.getRaiz());
    }
    public void inOrden(){
        arbol.inOrden(arbol.getRaiz());
    }
    
    
}
