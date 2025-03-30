/*
 * App.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;
import java.time.LocalDate;
import java.time.Duration;
import java.util.Scanner;

/**
 * Contém a estrutura de implementação da aplicação.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 * @author Lucas Beserra - 281815
 */
public class App {

    /**
     * Aplicação principal
     * @param args
     */
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("Digite um Nome de Usuário: ");
        String user_name = s.nextLine();
        System.out.print("Digite seu e-mail: ");
        String user_email = s.nextLine();
        Usuario usuario = new Usuario(user_name, user_email);
        String answ;
        System.out.println("Testar Venda de ingressos ou filtro? (v/f)");
        answ = s.nextLine();
       
        Local local1 = new Local("Allianz Parque", 40000);
        Local local2 = new Local("Autódromo", 10000);
        Local local3 = new Local("Teatro Dragão do Mar", 150);
        HistoricoEventos historico = new HistoricoEventos();
        System.out.println(usuario);

        EventoShow show = new EventoShow("Apple Cider Cinnamon Crunch", local1, 199.90, LocalDate.of(2025, 7, 24), "Kpop", "Yves", Duration.ofHours(3).plusMinutes(30));
        show.addToSetlist("DIM");
        show.addToSetlist("Viola");
        show.addToSetlist("See You In Hell");
        show.addToSetlist("BIRD");
        historico.addToList(show);

        EventoFestival festival = new EventoFestival("Loolla Pallooza", local2, LocalDate.of(2025, 3, 29), 399.99, Duration.ofHours(5));
        festival.addToLineup("Tate McRae");
        festival.addToLineup("Olivia Rodrigo");
        festival.addToLineup("Terno Rei");
        festival.addToLineup("Bush");
        festival.addToLineup("Sepultura");
        historico.addToList(festival);

        EventoEsporte jogo = new EventoEsporte("Clássico Rei", local1, 50, LocalDate.of(2025, 6, 12), Duration.ofHours(1).plusMinutes(30), "Fortaleza", "Ceará", "Futebol");
        historico.addToList(jogo);

        EventoTeatro peca = new EventoTeatro("Wicked", local3, 119.90, LocalDate.of(2025, 4, 8), "Musical", Duration.ofHours(3).plusMinutes(30));
        peca.addToCast("Fabi Bang");
        peca.addToCast("Myra Ruiz");
        historico.addToList(peca);

        //Eventos extras criados por IA para ilustrar a ferramenta de busca (FiltroEventos)
        EventoShow show2 = new EventoShow("The Weekend Vibes", local1, 149.90, LocalDate.of(2025, 5, 10), "Pop", "Zara", Duration.ofHours(2).plusMinutes(30));
        show2.addToSetlist("Weekend Blues");
        show2.addToSetlist("Sunset Serenade");
        show2.addToSetlist("Dreaming");
        show2.addToSetlist("Electric Heart");
        historico.addToList(show2);

        EventoFestival festival2 = new EventoFestival("Festival da Música Brasileira", local2, LocalDate.of(2025, 6, 20), 299.99, Duration.ofHours(6));
        festival2.addToLineup("Gilberto Gil");
        festival2.addToLineup("Caetano Veloso");
        festival2.addToLineup("Elis Regina");
        festival2.addToLineup("Ney Matogrosso");
        festival2.addToLineup("Djavan");
        historico.addToList(festival2);

        EventoEsporte jogo2 = new EventoEsporte("Final Copa do Mundo", local1, 150, LocalDate.of(2025, 7, 12), Duration.ofHours(1).plusMinutes(30), "Brasil", "Argentina", "Futebol");
        historico.addToList(jogo2);

        EventoShow show3 = new EventoShow("Night of Dreams", local3, 199.00, LocalDate.of(2025, 9, 5), "Rock", "James", Duration.ofHours(4));
        show3.addToSetlist("Heart of Steel");
        show3.addToSetlist("Midnight Road");
        show3.addToSetlist("Echoes");
        show3.addToSetlist("Firestorm");
        historico.addToList(show3);

        EventoFestival festival3 = new EventoFestival("Indie Music Festival", local2, LocalDate.of(2025, 8, 3), 249.50, Duration.ofHours(7).plusMinutes(30));
        festival3.addToLineup("Tame Impala");
        festival3.addToLineup("Arctic Monkeys");
        festival3.addToLineup("The Strokes");
        festival3.addToLineup("Vampire Weekend");
        festival3.addToLineup("Foals");
        historico.addToList(festival3);

        EventoTeatro peca2 = new EventoTeatro("The Phantom of the Opera", local3, 169.90, LocalDate.of(2025, 6, 18), "Musical", Duration.ofHours(2).plusMinutes(30));
        peca2.addToCast("Sierra Boggess");
        peca2.addToCast("Ramin Karimloo");
        historico.addToList(peca2);

        EventoEsporte jogo3 = new EventoEsporte("Super Bowl 2025", local1, 350, LocalDate.of(2025, 2, 1), Duration.ofHours(3).plusMinutes(30), "Kansas City Chiefs", "Philadelphia Eagles", "Futebol Americano");
        historico.addToList(jogo3);

        if (answ.equals("v")) {
            System.out.println("\nEscolha um evento para comprar um ingresso (digite o número)");
            historico.showEventList();
            int index = Integer.parseInt(s.nextLine());
            Evento result = historico.getEventList().get(index - 1);
            
            System.out.println("É estudante (MEIA ENTRADA)? (s/n)");
    
            answ = s.nextLine();
            if (answ.equals("s")) {
                result.adicionaIngresso(new IngressoMeia(result), usuario);
            } else {
                System.out.println("Quer a área VIP (DOBRO DO PREÇO)? (s/n)");
                answ = s.nextLine();
                if (answ.equals("s")) {
                    result.adicionaIngresso(new IngressoVIP(result), usuario);
                } else {
                    result.adicionaIngresso(new IngressoInteira(result), usuario);
                }
            }
            System.out.println("Ingresso Cadastrado!\n");
            System.out.println(usuario.getTicket());
            usuario.getTicket().getEvento().showInfo();
        } else if (answ.equals("f")) {
            System.out.print("Que tipo de filtragem?: ");
            answ = s.nextLine();
            Filtro filter = new Filtro(historico);
            switch (answ) {
                case "Tipo":
                    System.out.println("Que tipo de Evento?");
                    String type = s.nextLine();
                    switch (type) {
                        case "Show":
                            filter.filter(EventoShow.class);
                            break;
                        case "Esporte":
                            filter.filter(EventoEsporte.class);
                            break;
                        case "Festival":
                            filter.filter(EventoFestival.class);
                            break;
                        case "Teatro":
                            filter.filter(EventoTeatro.class);
                            break;
                        default:
                            System.err.println("ERRO");
                            break;
                    }
                    break;
                case "Preco":
                    System.out.println("Até que preço?");
                    double price = Double.parseDouble(s.nextLine());
                    filter.filter(price);
                    break;

                case "Data":
                    System.out.println("Em que data?");
                    String date_nonsplit = s.nextLine(), regex1 = "[/]";
                    String date_split[] = date_nonsplit.split(regex1);
                    LocalDate date = LocalDate.of(Integer.parseInt(date_split[0]), Integer.parseInt(date_split[1]), Integer.parseInt(date_split[2]));
                    filter.filter(date);
                    break;

                case "Duracao":
                    System.out.println("Qual Duração máxima?");
                    String dur_nonsplit = s.nextLine(), regex2 = "[:]";
                    String dur_split[] = dur_nonsplit.split(regex2);
                    Duration dur = Duration.parse("PT" + dur_split[0] + "H" + dur_split[1] + "M");
                    filter.filter(dur);
                    break;
            
                default:
                    System.err.println("ERRO");
                    break;
            }
            filter.showResult();
        } else {
            System.err.println("ERRO");
        }
        s.close();
    }
}
