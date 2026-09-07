import java.util.Scanner;

public class medianotas {
    public static void main(String[] args) {

        System.out.println("DIGITE ABAIXO A NOTA DOS ALUNOS ");

        double nota1;
        double nota2;
        double nota3;
        double nota4;

        Scanner boletim = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = boletim.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = boletim.nextInt();

        System.out.println("Digite a terceira nota: ");
        nota3 = boletim.nextInt();

        System.out.println("Digite a quarta nota: ");
        nota4 = boletim.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.println("A média dos alunos é: " + media);



        boletim.close();
    }
}
