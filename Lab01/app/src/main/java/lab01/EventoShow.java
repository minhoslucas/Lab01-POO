package lab01;

import java.time.LocalDate;
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

    public EventoShow(String nome, Local local, ArrayList<Ingresso> ingressos_vendidos, double precoIngresso, LocalDate date, String genre,
                     ArrayList<String> setlist, String artist, double duration) {
        super(nome, local, ingressos_vendidos, precoIngresso, date, duration);
        this.genre = genre;
        this.setlist = setlist;
        this.artist = artist;
    }
    /**
     * Imprime a setlist do evento
     */

    private void showSetlist() {
        for (int i = 0; i < setlist.size(); i++) {
            System.out.println(setlist.get(i));
        }
    }
    /**
     * Imprime as informações do Evento
     */

    @Override
    public void showInfo() {
        System.out.println("Gênero: " + this.genre);
        System.out.println("Artista: " + this.artist);
        System.out.println("Capacidade: " + this.getLocal().getCapacidade());
        System.out.println("Setlist: ");
        this.showSetlist();
        System.out.println("Duração: " + this.getDuration());
        System.out.println("Data: " + this.getData());
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
    
}
