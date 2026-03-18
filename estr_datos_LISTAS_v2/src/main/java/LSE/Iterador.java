package LSE;

public class Iterador<T> implements Iterador_func<T> {
    private Elemento<T> actual;

    public Iterador(Elemento<T> comienzo) {
        this.actual = comienzo;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public T next() {
        if (!hasNext()) return null;
        T dato = actual.dato;
        actual = actual.siguiente;
        return dato;
    }
}
