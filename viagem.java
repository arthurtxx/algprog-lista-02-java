import java.util.Scanner;


public class viagem {
    public static void main(String[] args) {

        double alemanha;
        double italia;
        double portugal;
        int    pessoasA; 
        int    pessoasP; 
        int    pessoasI; 

        Scanner usuario = new Scanner(System.in);

        System.out.println("Digite o valor da viagem para Alemanha: ");
        alemanha = usuario.nextDouble();
        System.out.println("Digite a quantidade de pessoas que vão para Alemanha: ");
        pessoasA = usuario.nextInt();

        System.out.println("Digite o valor da viagem para Portugal: ");
        portugal = usuario.nextDouble();
        System.out.println("Digite a quantidade de pessoas que vão para Portugal: ");
        pessoasP = usuario.nextInt();

        System.out.println("Digite o valor da viagem para Italia: ");
        italia = usuario.nextDouble();
        System.out.println("Digite a quantidade de pessoas que vão para Italia: ");
        pessoasI = usuario.nextInt();

        double vAlemanha = alemanha * pessoasA;
        double vPortugal = portugal * pessoasP;
        double vItalia = italia * pessoasI;

        double valortotal = vAlemanha + vPortugal + vItalia;
        int totalpessoas = pessoasA + pessoasP + pessoasI;

        System.out.println("O custo da viagem foi: R$" + valortotal);
        System.out.println("A quantidade de pessoas foi: " + totalpessoas);

    usuario.close();
    }
}
