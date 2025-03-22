package lab01;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventoShow extends Evento {
    private String genre;
    private ArrayList<String> setlist;
    private String artist;
    private double duration;

    public EventoShow(String nome, Local local, ArrayList<Ingresso> ingressos_vendidos, double precoIngresso, LocalDate date, String genre,
                     ArrayList<String> setlist, String artist, double duration) {
        super(nome, local, ingressos_vendidos, precoIngresso, date);
        this.genre = genre;
        this.setlist = setlist;
        this.artist = artist;
        this.duration = duration;
    }

    private void showSetlist() {
        for (int i = 0; i < setlist.size(); i++) {
            System.out.println(setlist.get(i));
        }
    }

    public void showInfo() {
        System.out.println("Gênero: " + this.genre);
        System.out.println("Artista: " + this.artist);
        System.out.println("Setlist: ");
        this.showSetlist();
        System.out.println("Duração: " + this.duration);
        System.out.println("Data: " + this.getDate());
    }
}
