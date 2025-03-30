package lab01;

import java.time.LocalDate;
import java.time.Duration;
import java.util.ArrayList;
/**
 * Contém a estrutura de implementação de um Evento do tipo Show
 * @author Lucas Beserra - 281815
 */

public class EventoShow extends Evento {
    private String genre;
    private ArrayList<String> setlist;
    private String artist;
    /**
     * Construtor da classe EventoShow
     * @param nome o nome do Evento
     * @param local o local do Evento
     * @param ingressos_vendidos a lista de ingressos vendidos do Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param date a data do Evento
     * @param genre gênero de música do show 
     * @param setlist lista de músicas que vão ser tocadas
     * @param artist artista que vai se apresentar
     * @param duration duração do Evento
     */

    public EventoShow(String nome, Local local, double precoIngresso, LocalDate date, String genre,
                     String artist, Duration duration) {
        super(nome, local, precoIngresso, date, duration);
        this.genre = genre;
        this.artist = artist;
        this.setlist = new ArrayList<String>();
    }
    /**
     * Imprime a setlist do evento
     */

    private void showSetlist() {
        for (int i = 0; i < setlist.size(); i++) {
            System.out.println(setlist.get(i));
        }
        System.out.println();
    }
    /**
     * Imprime as informações do Evento
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
        this.showSetlist();
        System.out.println("Data: " + this.getData());
        System.out.println();
    }
    /**
     * Retorna o artista que vai se apresentar
     * @return
     */

    public String getArtist() {
        return this.artist;
    }
    /**
     * Altera o artista que vai se apresentar no Evento para `artist`
     * @param artist
     */

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addToSetlist(String track) {
        this.setlist.add(track);
    }
    
}
