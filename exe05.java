
import java.util.Scanner;


public class exe05 {
    
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Digite um valor: ");
       int num1 = entrada.nextInt();
       System.out.print("Digite outro Valor: ");
       int num2 = entrada.nextInt();
       
       int soma = num1 + num2 ;
       
       
       entrada.close();
      System.out.println("a soma de "+ num1+" e de "+num2+" é igual a: "+soma);
    }
    
}
