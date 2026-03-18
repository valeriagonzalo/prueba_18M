package LSE;

// Interfaz para el iterador personalizado
public interface Iterador_func<T> {
    boolean hasNext();
    T next();
}