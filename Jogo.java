public class Jogo {

    public String timeDaCasa, timeVistante;
    public int placarCasaPimeiroTempo, placarCasaSegundoTempo, placarVisitantePimeiroTempo,placarVisitanteSegundoTempo;

    public String placarfinal(){

        return "Placar final "+timeDaCasa+" "+(placarCasaPimeiroTempo+placarCasaSegundoTempo)+" X "+timeVistante+" "+(placarVisitantePimeiroTempo+placarVisitanteSegundoTempo);
    }

}
//Crie uma classe Jogo com os atributos, time da casa, time visitante, placar do primeiro tempo,
// placar do segundo tempo, Crie o metodo placar final,
// recebendo o valor do primeiro tempo e do segundo tempo,  método ToString;