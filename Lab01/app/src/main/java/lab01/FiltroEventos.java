package lab01;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Contém a estrutura de implementação de um filtro de eventos
 */

public interface FiltroEventos {
    public ArrayList<Evento> filterDate(LocalDate date);
    public ArrayList<Evento> filterType(Evento event);
    public ArrayList<Evento> filterPrice(double price);
    public ArrayList<Evento> filterDuration(double duration);
    public void printResult();
}

class FiltrarData {
    private LocalDate date;
    private HistoricoEventos event_list;

    public FiltrarData(LocalDate date, HistoricoEventos event_list) {
        this.date = date;
        this.event_list = event_list;
    }

    public ArrayList<Evento> filterDate() {
        ArrayList<Evento> result = new ArrayList<Evento>();
        for (int i = 0; i < this.event_list.getEventList().size(); i++) {
            Evento test = this.event_list.getEventList().get(i);
            if (test.getData() == this.date) {
                result.add(test);
            }
        }
        return result;
    }
}

class FiltrarTipo {
    private Evento event;
    private HistoricoEventos event_list;

    public FiltrarTipo(Evento event, HistoricoEventos event_list) {
        this.event = event;
        this.event_list = event_list;
    }

    public ArrayList<Evento> filterType() {
        ArrayList<Evento> result = new ArrayList<Evento>();
        for (int i = 0; i < this.event_list.getEventList().size(); i++) {
            boolean test = this.event_list.getEventList().get(i).getClass().equals(this.event);
            if (test) {
                result.add(this.event_list.getEventList().get(i));
            }
        }
        return result;
    }

    public void printResult() {
        for (int i = 0; i < this.event_list.getEventList().size(); i++) {
            System.out.println(this.event_list.getEventList().get(i));
        }
    }
}