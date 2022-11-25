
package problema03;

public class Problema03 {
    public static void main(String[] args) {
        
        int contador = 1;
        int secuencia = 2;
        int suma = 3;
        
        do{
            System.out.println(secuencia); 
            secuencia = secuencia + suma; 
            suma = suma + 2;   
            contador = contador + 1;
        }while(contador <= 6);
    }
    
}
