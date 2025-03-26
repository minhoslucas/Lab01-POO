package lab01;

import java.time.LocalDate;
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

    public EventoTeatro(String nome, Local local, ArrayList<Ingresso> ingressos_vendidos, double precoIngresso, LocalDate date,
                        String genre, ArrayList<String> cast, double duration) {
        super(nome, local, ingressos_vendidos, precoIngresso, date, duration);
        this.genre = genre;
        this.cast = cast;
    }
    /**
     * Imprime o elenco do Evento
     */

    private void mostrarElenco() {
        for (int i = 0; i < cast.size(); i++) {
            System.out.println(cast.get(i));
        }
    }
    /**
     * Imprime as informações do Evento
     */

    @Override
    public void showInfo() {
        System.out.println("Gênero: " + this.genre);
        System.out.println("Cast: ");
        this.mostrarElenco();
        System.out.println("Duração: " + this.getDuration());
        System.out.println("Data: " + this.getData());
    }
}
