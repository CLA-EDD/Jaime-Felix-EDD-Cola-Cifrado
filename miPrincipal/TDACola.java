package miPrincipal;

// TDACola.java
// Interfaz pública del Tipo de Dato Abstracto Cola

public interface TDACola<T> {
    public void enqueue( T elemento );              // Agregar un dato a la Cola
    public T dequeue() throws ColaVaciaException;   // Sacar un dato de la Cola
    public T first() throws ColaVaciaException;     // Consulta el primer valor de la Cola
    public boolean isEmpty();                       // ¿La Cola está vacía?
    public int size();                              // El total de elementos dentro de la Cola
    public String toString();                       // Convertir el TDACola a una representación de cadena
}