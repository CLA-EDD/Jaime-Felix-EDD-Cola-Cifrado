package miPrincipal;

// Cifrado.java
// Clase para cifrar/descifrar una cadena con el método "César"

public class Cifrado {
    // Atributos
    int[] claves;
    
    // Constructor
    public Cifrado( int[] claves )
    {
        // El constructor debe recibir un arreglo de enteros con las claves a utilizar
        this.claves = claves;
    }

    // Método cifrar
    // Cifra un mensaje usando las claves proporcionadas en el constructor
    // devuelve el mesaje cifrado
    public String cifrar( String mensaje )
    {
        String codificado = "";

        // Crear cola de claves

        // Llenar la cola con las claves

        // Codificar el mensaje sumando a cada caracter el valor de la clave que le corresponda

        return codificado;
    }


    // Método descifrar
    // Descifra un mensaje usando las claves proporcionadas en el constructor
    // devuelve el mesaje descifrado

    // Identico al método cifrar, excepto que las claves se restan en lugar de sumarse
    public String descifrar( String mensaje )
    {
        String decodificado = "";

        return decodificado;
    }

}
