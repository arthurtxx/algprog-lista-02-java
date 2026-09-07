import java.util.Scanner;

public class somas {
public static void main(String[] args)  {

    System.out.println("Escreva o primeiro numero: ");
    int numero1; 

    Scanner soma = new Scanner(System.in);
    numero1 = soma.nextInt();

    System.out.println("Digite o segundo numero: ");
    int numero2;

    numero2 = soma.nextInt();
    
    System.out.println("Os numeros informados foram: " + numero1 + "\n" + numero2);

    int resultado = numero1 + numero2;
    int sub = numero1 - numero2;
    int multi = numero1 * numero2;
    
    System.out.println("Soma: " + resultado);
    System.out.println("Subtração: " + sub);
    System.out.println("Multiplicação: " + multi);

    soma.close();
    
}    


}
