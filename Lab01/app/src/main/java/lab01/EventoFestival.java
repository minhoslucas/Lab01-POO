package lab01;

import java.time.LocalDate;
import java.time.Duration;
import java.util.ArrayList;

/**
 * Contém a estrutura de implementação de um Evento do tipo Festival
 */
public class EventoFestival extends Evento {
    private ArrayList<String> lineup;
    /**
     * Construtor da classe EventoFestival
     * @param nome o nome do Evento
     * @param local o local do Evento
     * @param ingressos_vendidos a lista de ingressos vendidos do Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param date a data do Evento
     * @param lineup a lista de artistas que vão se apresentar no Evento
     * @param duration a duração do evento
     */

    public EventoFestival(String nome, Local local, LocalDate date,
                         double precoIngresso, Duration duration) {
        super(nome, local, precoIngresso, date, duration);
        this.lineup = new ArrayList<String>();
    }
    /**
     * Retorna a lineup do Evento
     * @return lineup
     */
    public ArrayList<String> getLineup() {
        return this.lineup;
    }
    /**
     * Imprime a Lineup do Evento
     */

    private void showLineup() {
        for (int i = 0; i < lineup.size(); i++) {
            System.out.println(lineup.get(i));
        }
        System.out.println();
    }

    public void addToLineup(String artist) {
        this.lineup.add(artist);
    }
    /**
     * Imprime as informações do Evento
     */
    @Override
    public void showInfo() {
        System.out.println("Dados do Evento:\n");
        System.out.println("Local: " + this.getLocal().getNome());
        System.out.print("Duração: " + formatDuration(this.getDuration()));
        System.out.println("Lineup: \n");
        this.showLineup();
        System.out.println("Capacidade: " + this.getLocal().getCapacidade());
        System.out.println("Data: " + this.getData());
        System.out.println();
    }

}
