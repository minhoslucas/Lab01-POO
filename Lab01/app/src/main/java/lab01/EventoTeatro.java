package lab01;

import java.time.LocalDate;
import java.time.Duration;
import java.util.ArrayList;

/**
 * Representa um Evento do tipo Teatro. Este evento possui um gênero de peça e um elenco (cast) que irá se apresentar.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Lucas Beserra - 281815
 */
public class EventoTeatro extends Evento {
    private String genre; // Gênero da peça de teatro
    private ArrayList<String> cast; // Lista de atores que fazem parte do elenco do evento

    /**
     * Construtor da classe EventoTeatro. Inicializa os atributos específicos do evento teatro.
     * 
     * @param nome o nome do Evento
     * @param local o local onde o Evento ocorrerá
     * @param precoIngresso o preço do ingresso do Evento
     * @param date a data do Evento
     * @param genre o gênero da peça de teatro
     * @param duration a duração do Evento
     */
    public EventoTeatro(String nome, Local local, double precoIngresso, LocalDate date,
                        String genre, Duration duration) {
        super(nome, local, precoIngresso, date, duration);
        this.genre = genre;
        this.cast = new ArrayList<String>(); // Inicializa a lista de elenco (cast)
    }

    /**
     * Retorna o gênero da peça de teatro.
     * 
     * @return o gênero da peça
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Altera o gênero da peça de teatro para o valor fornecido.
     * 
     * @param genre o novo gênero da peça
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Retorna a lista de atores do elenco do evento.
     * 
     * @return a lista de atores (cast)
     */
    public ArrayList<String> getCast() {
        return this.cast;
    }

    /**
     * Altera o elenco (cast) do evento para a lista fornecida.
     * 
     * @param cast a nova lista de atores (cast)
     */
    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }

    /**
     * Exibe o elenco do evento (nomes dos atores que se apresentam).
     */
    private void mostrarElenco() {
        for (int i = 0; i < cast.size(); i++) {
            System.out.println(cast.get(i)); // Imprime o nome de cada ator do elenco
        }
        System.out.println();
    }

    /**
     * Adiciona um ator ao elenco (cast) do evento.
     * 
     * @param actor o nome do ator a ser adicionado ao elenco
     */
    public void addToCast(String actor) {
        this.cast.add(actor); // Adiciona o ator à lista de elenco
    }

    /**
     * Exibe as informações detalhadas do Evento Teatro, como o gênero, o local, a capacidade, a duração, o elenco e a data.
     */
    @Override
    public void showInfo() {
        System.out.println("Dados do Evento:\n");
        System.out.println("Gênero: " + this.genre); // Exibe o gênero da peça
        System.out.println("Local: " + this.getLocal().getNome()); // Exibe o nome do local
        System.out.print("Duração: " + formatDuration(this.getDuration())); // Exibe a duração do evento
        System.out.println("Capacidade: " + this.getLocal().getCapacidade()); // Exibe a capacidade do local
        System.out.println("Cast: \n");
        this.mostrarElenco(); // Exibe o elenco do evento
        System.out.println("Data: " + this.getData()); // Exibe a data do evento
        System.out.println();
    }
}

