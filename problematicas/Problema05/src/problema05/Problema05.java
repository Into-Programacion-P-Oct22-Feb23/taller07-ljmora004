
package problema05;

public class Problema05 {
    public static void main(String[] args) {
        
        int contador = 1;
        int suma = 3;
        String mensaje = "";
        mensaje = mensaje + "1";
        
        do{
            if(contador % 2 == 0){
                mensaje = String.format("%s + 1/%d", 
                        mensaje, suma);
            }else{
                mensaje = String.format("%S - 1/%d", 
                        mensaje, suma);
            }
            contador = contador + 1;
            suma = suma + 2;
        }while(contador <= 7);
        System.out.println(mensaje);
    }
    
}
