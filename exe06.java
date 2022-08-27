
import java.util.Scanner;


public class exe06 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor:");
        int num1 = entrada.nextInt();
        
        int metade = num1/2;
        
        entrada.close();
        
        System.out.print("A metade de "+ num1+ " é igual a: "+ metade);
        
        
        
        
    }
    
}
