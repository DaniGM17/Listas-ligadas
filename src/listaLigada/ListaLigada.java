/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaLigada;

/**
 *
 * @author dania
 */
public class ListaLigada<T> {
    private Nodo head; //Apuntador a la cabecera de la lista(primer nodo)
    private Nodo tail;//Apuntador a la cola de la lista (último nodo)
    private Nodo actual;
    private  int size;//Tamaño de la lista(número de nodos en la lista)
    
    public ListaLigada(){
        this. head=null;
        this.actual=null;
        this.tail=null;
        this.size=0;
    }
    
   /* public void addFirst(int dato){
        Nodo nodo = new Nodo(dato);
        this.head=nodo;
        this.tail = nodo;
        this.actual = nodo;
        this.size++;
    }*/
    
    public void add(T dato){
        Nodo nuevoNodo = new Nodo(dato);
        this.size++;
        this.tail = nuevoNodo; //se mueve el apuntador al último nodo
        if(head==null){//La lista está vacía, creamos el nodo
            head = nuevoNodo;
            actual = head;
        }else{
            actual.setSiguiente(nuevoNodo); //actual.sig apunta al nuevoNodo (enlace entre nodos)
            actual = nuevoNodo;//Ahora actual es el nuevo nodo
        }
    }
    
    public void add(T dato, int posicion){
        Nodo nuevoNodo = new Nodo(dato);
        int i = 1;
        actual = head;
        while (i<posicion - 1){
            actual = actual.getSiguiente();
            i++;
        }
        Nodo auxiliar = actual.getSiguiente();
        actual.setSiguiente(nuevoNodo);
        actual = nuevoNodo;
        actual.setSiguiente(auxiliar);
    }
    
    public void printList(){
        int posicion = 1;
        actual = head;
        while (actual != null){
            T elemento =(T) actual.getDato();
            System.out.println("Dato= " + elemento + " almacenado en nodo: " + posicion);
            actual = actual.getSiguiente();//obtiene dirección del siguiente nodo para que se pueda mover
            posicion++;
        }
        
        
        
    }
}
