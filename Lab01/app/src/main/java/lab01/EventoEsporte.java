package lab01;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventoEsporte extends Evento {
    private String timeDaCasa;
    private String timeVisitante;
    private String esporte;

    public EventoEsporte(String nome, Local local, ArrayList<Ingresso> ingressos_vendidos, double precoIngresso,
                         LocalDate date, String timeDaCasa, String timeVisitante, String esporte) {
        super(nome, local, ingressos_vendidos, precoIngresso, date);
        this.timeDaCasa = timeDaCasa;
        this.timeVisitante = timeVisitante;
        this.esporte = esporte;
    }

    public void showInfo() {
        System.out.println("Esporte:" + this.esporte);
        System.out.println("Jogo:" + this.timeDaCasa + "Vs" + this.timeVisitante);
        System.out.println("Capacidade: " + this.local.getCapacidade());
        System.out.println("Data: " + this.getDate());
    }
}
