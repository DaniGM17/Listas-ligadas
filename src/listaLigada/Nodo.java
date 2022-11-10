/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaLigada;

/**
 *
 * @author dania
 */
public class Nodo {
    private int dato;//dato almacendo
    private Nodo siguiente;// apuntador al siguiente nodo, referencia a la misma clase
    
    public Nodo(int d){
        this.dato = d;
        this. siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() { // obtiene el enlace, actual a donde se debe ir
        return siguiente;
    }

public void setSiguiente(Nodo otroNodo) { //enlaza el siguiente nodo
        this.siguiente = otroNodo;
    }
    
    
   
}
