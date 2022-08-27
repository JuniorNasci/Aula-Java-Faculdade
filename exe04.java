
import java.util.Scanner;


public class exe04 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor e veja seu dobro: ");
        int num1 = entrada.nextInt();
        int dobro = num1*2;
        
        entrada.close();
        
        System.out.println("o Dobro de "+num1+" é: "+ dobro);
       
        
        
        
    }
    
}
