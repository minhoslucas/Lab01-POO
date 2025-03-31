package lab01;

import java.time.LocalDate;
import java.time.Duration;
import java.util.ArrayList;

/**
 * Representa um Evento do tipo Show. Este evento possui um artista, um gênero musical e uma lista de músicas 
 * (setlist) que serão tocadas durante o show.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Lucas Beserra - 281815
 */
public class EventoShow extends Evento {
    private String genre; // Gênero musical do show
    private ArrayList<String> setlist; // Lista de músicas que serão tocadas no show
    private String artist; // Artista que vai se apresentar

    /**
     * Construtor da classe EventoShow. Inicializa os atributos específicos do evento show.
     * 
     * @param nome o nome do Evento
     * @param local o local onde o Evento ocorrerá
     * @param precoIngresso o preço do ingresso do Evento
     * @param date a data do Evento
     * @param genre o gênero musical do show
     * @param artist o nome do artista que se apresentará
     * @param duration a duração do Evento
     */
    public EventoShow(String nome, Local local, double precoIngresso, LocalDate date, String genre,
                     String artist, Duration duration) {
        super(nome, local, precoIngresso, date, duration);
        this.genre = genre;
        this.artist = artist;
        this.setlist = new ArrayList<String>(); // Inicializa a lista de músicas (setlist)
    }

    /**
     * Exibe a lista de músicas (setlist) do evento.
     */
    private void showSetlist() {
        for (int i = 0; i < setlist.size(); i++) {
            System.out.println(setlist.get(i)); // Imprime cada música da setlist
        }
        System.out.println();
    }

    /**
     * Exibe as informações detalhadas do Evento Show, como o local, a capacidade, a duração, o gênero musical,
     * o nome do artista e a setlist de músicas.
     */
    @Override
    public void showInfo() {
        System.out.println("Dados do Evento:\n");
        System.out.println("Local: " + this.getLocal().getNome());
        System.out.print("Duração: " + formatDuration(this.getDuration()));
        System.out.println("Capacidade: " + this.getLocal().getCapacidade());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Gênero: " + this.genre);
        System.out.println("Artista: " + this.artist);
        System.out.println("Setlist: \n");
        this.showSetlist(); // Exibe a setlist das músicas
        System.out.println("Data: " + this.getData());
        System.out.println();
    }

    /**
     * Retorna a lista de músicas que serão tocadas no show (setlist).
     * 
     * @return a lista de músicas (setlist)
     */
    public ArrayList<String> getSetlist() {
        return this.setlist;
    }

    /**
     * Altera a lista de músicas (setlist) do show.
     * 
     * @param setlist a nova lista de músicas a ser definida para o show
     */
    public void setSetlist(ArrayList<String> setlist) {
        this.setlist = setlist;
    }

    /**
     * Retorna o nome do artista que vai se apresentar no show.
     * 
     * @return o nome do artista
     */
    public String getArtist() {
        return this.artist;
    }

    /**
     * Altera o nome do artista que vai se apresentar no show.
     * 
     * @param artist o novo nome do artista
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }
    /**
     * Retorna o gênero musical do show
     * @return o gênero musical do show
     */
    public String getGenre() {
        return this.genre;
    }
    /**
     * Muda o gênero musical do show para `genre`
     * @param genre o novo gênero musical
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Adiciona uma música à lista de músicas (setlist) que serão tocadas no show.
     * 
     * @param track o nome da música a ser adicionada à setlist
     */
    public void addToSetlist(String track) {
        this.setlist.add(track); // Adiciona a música à setlist
    }
}

