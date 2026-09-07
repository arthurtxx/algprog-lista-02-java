import java.util.Scanner;

public class gasolina {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double preço;
        double litros;

        System.out.println("Digite o valor do litro da gasolina: ");
        preço = valor.nextDouble();

        System.out.println("Digite quantos litros você abasteceu: ");
        litros = valor.nextDouble();

        double resultado = (preço * litros);

        System.out.println("Você deverá pagar: R$" + resultado);



        valor.close();
    }
    
}
