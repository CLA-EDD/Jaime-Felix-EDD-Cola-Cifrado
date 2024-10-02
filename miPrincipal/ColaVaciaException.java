package miPrincipal;

// ColaVaciaException.java
// Excepción personalizada para indicar que
// la Cola está vacía

public class ColaVaciaException extends Exception{
    public ColaVaciaException(String mensaje)
    {
        super( mensaje );
    }
}