package lab01;

import java.util.ArrayList;

public class HistoricoEventos {
    private ArrayList<Evento> event_list;

    public HistoricoEventos(ArrayList<Evento> event_list) {
        this.event_list = event_list;
    }

    public ArrayList<Evento> getEventList() {
        return this.event_list;
    }

    public void setEventList(ArrayList<Evento> event_list) {
        this.event_list = event_list;
    }

    public void addToList(Evento event) {
        event_list.add(event);
    }

    public void showEventList() {
        for (int i = 0; i < event_list.size(); i++) {
            System.out.println(event_list.get(i).getNome());
        }
    }
}
