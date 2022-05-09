import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jogo jogo = new Jogo();
        System.out.println("entre com time da casa");
        jogo.timeDaCasa = scan.nextLine();
        System.out.println("entre com o time vistante");
        jogo.timeVistante = scan.nextLine();
        System.out.println("placar casa primeiro tempo");
        jogo.placarCasaPimeiroTempo = scan.nextInt();

        System.out.println("placar visitante primeiro tempo");
        jogo.placarVisitantePimeiroTempo = scan.nextInt();

        System.out.println("placar casa segundo tempo");
        jogo.placarCasaSegundoTempo = scan.nextInt();

        System.out.println("placar visitante segundo tempo");
        jogo.placarVisitanteSegundoTempo = scan.nextInt();

        System.out.println(jogo.placarfinal());


    }
}
//Crie uma classe Jogo com os atributos, time da casa, time visitante, placar do primeiro tempo,
// placar do segundo tempo, Crie o metodo placar final,
// recebendo o valor do primeiro tempo e do segundo tempo,  método ToString;