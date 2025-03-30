package lab01;

import java.time.LocalDate;
import java.time.Duration;
import java.util.ArrayList;
/**
 * Contém a estrutura de implementação de um Evento do tipo Teatro
 * @author Lucas Beserra - 281815
 */

public class EventoTeatro extends Evento {
    private String genre;
    private ArrayList<String> cast;
    /**
     * Construtor da classe EventoTeatro
     * @param nome o nome do Evento
     * @param local o local do Evento
     * @param ingressos_vendidos a lista de ingressos vendidos do Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param date a data do Evento
     * @param genre gênero de peça do Evento
     * @param cast elenco do Evento
     * @param duration duração do Evento
     */

    public EventoTeatro(String nome, Local local, double precoIngresso, LocalDate date,
                        String genre, Duration duration) {
        super(nome, local, precoIngresso, date, duration);
        this.genre = genre;
        this.cast = new ArrayList<String>();
    }
    /**
     * Imprime o elenco do Evento
     */

    private void mostrarElenco() {
        for (int i = 0; i < cast.size(); i++) {
            System.out.println(cast.get(i));
        }
        System.out.println();
    }

    public void addToCast(String actor) {
        this.cast.add(actor);
    }
    /**
     * Imprime as informações do Evento
     */

    @Override
    public void showInfo() {
        System.out.println("Dados do Evento:\n");
        System.out.println("Gênero: " + this.genre);
        System.out.println("Local: " + this.getLocal().getNome());
        System.out.print("Duração: " + formatDuration(this.getDuration()));
        System.out.println("Capacidade: " + this.getLocal().getCapacidade());
        System.out.println("Cast: \n");
        this.mostrarElenco();
        System.out.println("Data: " + this.getData());
        System.out.println();
    }
}
