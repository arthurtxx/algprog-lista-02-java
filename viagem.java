import java.util.Scanner;


// PASSO 10: Calcular o custo de CADA destino separadamente
// -> custo Alemanha = preço Alemanha * pessoas Alemanha
// -> custo Portugal = preço Portugal * pessoas Portugal
// -> custo Itália = preço Itália * pessoas Itália

// PASSO 11: Somar os 3 custos para achar o VALOR TOTAL da viagem

// PASSO 12: Somar as 3 quantidades de pessoas para achar o TOTAL DE PESSOAS

// PASSO 13: Imprimir o valor total da viagem (pensa se quer usar aquele
// String.format que a gente aprendeu, pra ficar com 2 casas decimais)

// PASSO 14: Imprimir o total de pessoas


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
