package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner( System.in );

        System.out.println( "CIFRADO CESAR" );
        System.out.println( "=============" );
        System.out.println();
        System.out.print( "Proporcione el total de claves:" );
        int totalClaves = 0;

        // Crear arreglo de claves
        int[] claves = new int[ totalClaves ];

        // Solicitar las claves y guardarlas en el arreglo

        // Crear objeto Cifrado
        // y pasar arreglo de claves al constructor
        Cifrado c = new Cifrado( claves );

        // Eliminar el <Enter> pendiente
        entrada.nextLine();
        
        System.out.println();
        System.out.print( "Proporcione el mensaje original:" );

        // Mostrar mensaje cifrado

        // Mostrar mensaje descifrado

        entrada.close();
    }
}
