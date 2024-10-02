package miPrincipal;

// ColaArreglo.java
// Implementación del TDACola usando arreglos

public class ColaArreglo<T> implements TDACola<T> {
    // Atributos
    private T[] cola;                           // Arreglo donde se almacenan los elementos de la Cola
    private int ultimo;                         // Ubicación de la posición donde se guarda el siguiente elemento
                                                // Total de elementos guardados en la Cola
    private static final int CAPACIDAD_INICIAL = 100;  // Tamaño inicial de la Cola

    // Constructores
    @SuppressWarnings("unchecked")
    public ColaArreglo( int capacidadInicial )
    {
        // Validar el argumento
        if ( capacidadInicial < 1 )
            throw new IllegalArgumentException("Error. El tamaño de la Cola debe ser positivo");

        // Cola = new T[capacidadInicial];
        cola = (T[]) new Object[ capacidadInicial ];
        ultimo = 0;
    }

    public ColaArreglo()
    {
        this( CAPACIDAD_INICIAL );
    }

    public void enqueue( T elemento )
    {
        // Validar si la Cola esta llena
        // De ser así, duplicar su tamaño
        if ( size() == cola.length )
            extenderCapacidad();

        // Hay espacio disponible en la Cola
        // Guardar elemento
        cola[ ultimo ] = elemento;
        ultimo ++;        // Apuntar a la siguiente posición
    }

    public T dequeue() throws ColaVaciaException
    {
        // Validar que la Cola no esté vacía
        if ( isEmpty() )
            throw new ColaVaciaException("Error. No hay datos en la Cola");

        // Hay datos. Regresar el primer dato
        T resultado = cola[ 0 ];

        // Desplazar los elementos restantes hacía el inicio
        ultimo --;
        for ( int i = 0; i < ultimo; i++ )
            cola[ i ] = cola[ i + 1 ];

        cola[ ultimo ] = null;
        
        return resultado;
    }

    public T first() throws ColaVaciaException
    {
        // Validar que la Cola no esté vacía
        if ( isEmpty() )
            throw new ColaVaciaException("Error. No hay datos en la Cola");

        // Hay datos. Regresar el primer dato
        T resultado = cola[ 0 ];

        return resultado;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int size()
    {
        return ultimo;
    }

    public String toString()
    {
        String resultado = "";

        // Recorrer la Cola desde el inicio hasta el ultimo
        for ( int i = 0; i < ultimo; i ++ )
            resultado = resultado + cola[ i ] + "\n";

        return resultado;
    }

    // Método auxiliar expanderCapacidad()
    private void extenderCapacidad()
    {
        // Crear un nuevo arreglo del doble del tamaño de la Cola
        @SuppressWarnings("unchecked")
        T[] aux = (T[]) new Object[ cola.length * 2 ];

        // Copiar contenido de la Cola original al arreglo auxiiar
        for ( int i = 0; i < cola.length; i++ )
            aux[ i ] = cola[ i ];

        // Hacer Cola igual al arreglo aux
        cola = aux;
    }
}