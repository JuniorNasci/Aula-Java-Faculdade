
import java.util.Scanner;


public class exe07 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        double n1, n2, m;
        
        System.out.print("digite um valor:");
        n1 = entrada.nextInt();
        System.out.print("digite outro valor:");
        n2 = entrada.nextInt();
         m = (n1+n2)/ 2;
         entrada.close();
         
         
         System.out.println("a media dos valores digitados é: "+ m);
         
    }
    
}
