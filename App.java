import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jogador jogador = new Jogador();

        System.out.println("digite o nome ");
        jogador.nome= scan.next();

        System.out.println("digite o peso ");
        jogador.peso = scan.nextFloat();

        System.out.println("digite a idade ");
        jogador.idade = scan.nextInt();

        System.out.println("digite a quantidade de cartoes ");
        jogador.qtdCartoes= scan.nextInt();

        System.out.println("digite a quantidade de gols na temporada ");
        jogador.qtdGolsTemp = scan.nextInt();

        System.out.println("digite o salário");
        jogador.salario = scan.nextDouble();

        System.out.println(jogador);
    }
}
