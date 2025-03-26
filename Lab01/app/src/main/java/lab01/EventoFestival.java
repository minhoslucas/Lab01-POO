package lab01;

import java.time.LocalDate;
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

    public EventoFestival(String nome, Local local, ArrayList<Ingresso> ingressos_vendidos, LocalDate date,
                         double precoIngresso, ArrayList<String> lineup, double duration) {
        super(nome, local, ingressos_vendidos, precoIngresso, date, duration);
        this.lineup = lineup;
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
    }
    /**
     * Imprime as informações do Evento
     */
    @Override
    public void showInfo() {
        System.out.println("Lineup: ");
        this.showLineup();
        System.out.println("Duração: " + this.getDuration());
        System.out.println("Data: " + this.getData());
    }

}
