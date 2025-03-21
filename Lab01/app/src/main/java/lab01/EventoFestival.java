package lab01;

import java.util.ArrayList;

public class EventoFestival extends Evento {
    private ArrayList<String> lineup;
    private double duration;

    public EventoFestival(String nome, Local local, double precoIngresso, ArrayList<String> lineup, double duration) {
        super(nome, local, precoIngresso);
        this.lineup = lineup;
        this.duration = duration;
    }

}
