package LSE;

public class ListaSE<T extends Comparable<T>> implements ListaSE<T> {
    protected Elemento<T> primero;
    protected int tamaño = 0;

    @Override
    public void add(T dato) {
        Elemento<T> nuevo = new Elemento<>(dato);
        if (primero == null) {
            primero = nuevo;
        } else {
            Elemento<T> aux = primero;
            while (aux.siguiente != null) aux = aux.siguiente;
            aux.siguiente = nuevo;
        }
        tamaño++;
    }

    @Override
    public T get(T dato) {
        Elemento<T> aux = primero;
        while (aux != null) {
            if (aux.dato.compareTo(dato) == 0) return aux.dato;
            aux = aux.siguiente;
        }
        return null;
    }

    @Override
    public T del(T dato) {
        Elemento<T> act = primero, ant = null;
        while (act != null) {
            if (act.dato.compareTo(dato) == 0) {
                if (ant == null) primero = act.siguiente;
                else ant.siguiente = act.siguiente;
                tamaño--;
                return act.dato;
            }
            ant = act;
            act = act.siguiente;
        }
        return null;
    }

    @Override public boolean isEmtpy() { return primero == null; }
    @Override public int getSize() { return tamaño; }

    @Override
    public Iterador_func<T> getIterador() {
        return new Iterador<>(this.primero);
    }
}