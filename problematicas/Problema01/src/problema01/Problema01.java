
package problema01;

import java.util.Scanner;
import java.util.Locale;

public class Problema01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String posicion;
        double edad;
        String listaEdad = "";
        double totalEdad = 0;
        double estatura;
        double totalEstatura = 0;
        double promedioEdad;
        double promedioEstatura;
        boolean bandera = true;
        int opcion;
        String mensaje = "";
        int contador = 0;
        int contarNombres = 1;
        
        mensaje = String.format("%sListado de jugadores:\n", mensaje);
        do{
            System.out.println("Ingrese el nombre del jugador:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo de juego:");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextDouble();
            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();
            
            listaEdad = String.format("%s%.0f\n", listaEdad, edad);
            totalEdad = totalEdad + edad;
            totalEstatura = totalEstatura + estatura;
            mensaje = String.format("%s%d. %s -%s-, edad %.0f, "
                    + "estatura %.2f\n", mensaje, contarNombres, 
                    nombre, posicion, edad, estatura);
            contador = contador + 1;
            contarNombres = contarNombres + 1;
            System.out.println("Si desea terminar el programa presione 1, "
                    + "de lo contrario 0.");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if(opcion == 1){
                bandera = false;
            }
        }while(bandera == true);
        promedioEdad = totalEdad/contador;
        promedioEstatura = totalEstatura/contador;
        System.out.printf("%sListado de edades:\n%sPromedio de edades: "
                + "%.1f\nPromedio de estaturas: %.2f\n", mensaje, 
                listaEdad, promedioEdad, promedioEstatura);
        
    }
    
}
