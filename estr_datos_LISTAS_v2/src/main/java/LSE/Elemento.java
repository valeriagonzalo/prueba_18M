package LSE;

// Nodo para listas simples
class Elemento<T> { //Puedo meter cualquier elementos de cualquier tipo
    T dato;
    Elemento<T> siguiente;

    Elemento(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}