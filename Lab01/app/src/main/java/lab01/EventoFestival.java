package lab01;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventoFestival extends Evento {
    private ArrayList<String> lineup;
    private double duration;

    public EventoFestival(String nome, Local local, ArrayList<Ingresso> ingressos_vendidos, LocalDate date,
                         double precoIngresso, ArrayList<String> lineup, double duration) {
        super(nome, local, ingressos_vendidos, precoIngresso, date);
        this.lineup = lineup;
        this.duration = duration;
    }

    private void showLineup() {
        for (int i = 0; i < lineup.size(); i++) {
            System.out.println(lineup.get(i));
        }
    }

    public void showInfo() {
        System.out.println("Lineup: ");
        this.showLineup();
        System.out.println("Duração: " + this.duration);
        System.out.println("Data: " + this.getDate());
    }

}
