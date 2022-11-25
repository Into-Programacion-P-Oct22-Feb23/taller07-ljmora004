
package problema02;

public class Problema02 {
    public static void main(String[] args) {
        
        int contador = 1;
        int secuencia = 2;
        int suma = 4;
        
        while(contador <= 10){
            System.out.println(secuencia);
            secuencia = secuencia + suma;
            suma = suma + 2;
            contador = contador + 1;
        }
    }
    
}
