package lab01;

import java.util.ArrayList;
/**
 * Contém a estrutura de implementação do histórico de eventos
 * @author Lucas Beserra - 281815
 */

public class HistoricoEventos {
    private ArrayList<Evento> event_list;

    /**
     * Construtor da classe HistoricoEventos
     * @param event_list a lista que guarda o histórico
     */
    public HistoricoEventos(ArrayList<Evento> event_list) {
        this.event_list = event_list;
    }
    /**
     * Retorna a o histórico de eventos
     * @return event_list
     */

    public ArrayList<Evento> getEventList() {
        return this.event_list;
    }
    /**
     * muda o a lista do histórico de eventos para `event_list`
     * @param event_list a nova lista
     */

    public void setEventList(ArrayList<Evento> event_list) {
        this.event_list = event_list;
    }
    /**
     * adiciona um evento no histórico
     * @param event um evento
     */

    public void addToList(Evento event) {
        event_list.add(event);
    }
    /**
     * Imprime o Histórico de eventos
     */

    public void showEventList() {
        for (int i = 0; i < event_list.size(); i++) {
            System.out.println(event_list.get(i).getNome());
        }
    }
}
