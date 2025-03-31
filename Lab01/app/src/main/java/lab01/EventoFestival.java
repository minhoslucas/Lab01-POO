package lab01;

import java.time.LocalDate;
import java.time.Duration;
import java.util.ArrayList;

/**
 * Representa um Evento do tipo Festival. Este evento possui uma lista de artistas que irão se apresentar.
 * Contém informações sobre o lineup, o local e a duração do festival.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Lucas Beserra - 281815
 */
public class EventoFestival extends Evento {
    private ArrayList<String> lineup; // Lista de artistas que irão se apresentar no evento

    /**
     * Construtor da classe EventoFestival. Inicializa os atributos específicos do evento festival.
     * 
     * @param nome o nome do Evento
     * @param local o local onde o Evento ocorrerá
     * @param date a data do Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param duration a duração do Evento
     */
    public EventoFestival(String nome, Local local, LocalDate date,
                         double precoIngresso, Duration duration) {
        super(nome, local, precoIngresso, date, duration);
        this.lineup = new ArrayList<String>(); // Inicializa a lista de artistas
    }

    /**
     * Retorna a lista de artistas (lineup) que irão se apresentar no evento.
     * 
     * @return a lista de artistas do evento
     */
    public ArrayList<String> getLineup() {
        return this.lineup;
    }

    /**
     * Altera a lista de artistas (lineup) do evento.
     * 
     * @param lineup a nova lista de artistas
     */
    public void setLineup(ArrayList<String> lineup) {
        this.lineup = lineup;
    }

    /**
     * Exibe o lineup completo dos artistas que irão se apresentar no evento.
     */
    private void showLineup() {
        for (int i = 0; i < lineup.size(); i++) {
            System.out.println(lineup.get(i)); // Imprime cada artista no lineup
        }
        System.out.println();
    }

    /**
     * Adiciona um novo artista à lista de artistas (lineup) do evento.
     * 
     * @param artist o nome do artista a ser adicionado ao lineup
     */
    public void addToLineup(String artist) {
        this.lineup.add(artist); // Adiciona o artista à lista
    }

    /**
     * Exibe as informações detalhadas do Evento Festival, como o local, a capacidade, 
     * a duração, o lineup dos artistas e a data do evento.
     */
    @Override
    public void showInfo() {
        System.out.println("Dados do Evento:\n");
        System.out.println("Local: " + this.getLocal().getNome());
        System.out.print("Duração: " + formatDuration(this.getDuration()));
        System.out.println("Lineup: \n");
        this.showLineup(); // Exibe o lineup dos artistas
        System.out.println("Capacidade: " + this.getLocal().getCapacidade());
        System.out.println("Data: " + this.getData());
        System.out.println();
    }
}

