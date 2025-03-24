package lab01;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventoTeatro extends Evento {
    private String genre;
    private ArrayList<String> cast;
    private double duration;

    public EventoTeatro(String nome, Local local, ArrayList<Ingresso> ingressos_vendidos, double precoIngresso, LocalDate date,
                        String genre, ArrayList<String> cast, double duration) {
        super(nome, local, ingressos_vendidos, precoIngresso, date);
        this.genre = genre;
        this.cast = cast;
        this.duration = duration;
    }

    private void showCast() {
        for (int i = 0; i < cast.size(); i++) {
            System.out.println(cast.get(i));
        }
    }

    public void showInfo() {
        System.out.println("Gênero: " + this.genre);
        System.out.println("Cast: ");
        this.showCast();
        System.out.println("Duração: " + this.duration);
        System.out.println("Data: " + this.getDate());
    }
}
