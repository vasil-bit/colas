public class Cola<T>{
    private Nodo<T> front;
    private int tamanio;
    private Nodo<T> back;

    //dequeue, euqueue, size, isEmpty, front 
    public void euqueue(T dato){
        Nodo<T> nuevoNodo = new Nodo<T>(dato);
        if(isEmpty()){
            front=nuevoNodo;
        }else{
            back.setSiguiente(nuevoNodo);
        }
        back=nuevoNodo;
        tamanio++;
    }

    public T dequeue(){
        if(isEmpty()){
            throw new IllegalArgumentException("La cola esta vacia No puedes eliminar a nadie");      
        }
        T a = front.getDato();
        this.front=this.front.getSiguiente();
        if(front==null)
            back=null;
        tamanio--;
        return a;
    }

    public int size(){
        return tamanio;
    }

    public boolean isEmpty(){
        return tamanio==0;
    }
    public T front(){
        if(isEmpty()){
            throw new IllegalStateException("La cola está vacía");
        }
        return front.getDato();
    }
}