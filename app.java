public class app{
    public static void main(String[] args) {
        Cola<String> cola = new Cola<String>();
        cola.euqueue("Hola mundo desde un nodo");
        System.out.println(cola.dequeue());
        System.out.println(cola.front());
    }
}