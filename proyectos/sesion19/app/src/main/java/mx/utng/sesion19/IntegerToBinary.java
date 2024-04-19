package mx.utng.sesion19;
public class IntegerToBinary {
    public static void main(String[] args) {
        int numero =40;
        
        String binario = Integer.toBinaryString(numero);
        System.out.printf("El numero %d es %s en binario", numero, binario);
    }
    
}
