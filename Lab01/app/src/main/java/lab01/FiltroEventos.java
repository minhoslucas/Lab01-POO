package lab01;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Interface que define os métodos para filtrar eventos de acordo com diferentes critérios.
 * @author Lucas Beserra - 281815
 */
public interface FiltroEventos {

    /**
     * Filtra os eventos pela data especificada.
     * 
     * @param date A data para filtrar os eventos.
     * @return Uma lista de eventos que correspondem à data fornecida.
     */
    public ArrayList<Evento> filter(LocalDate date);

    /**
     * Filtra os eventos pelo tipo de evento fornecido.
     * 
     * @param event O tipo de evento para filtrar.
     * @return Uma lista de eventos que correspondem ao tipo de evento fornecido.
     */
    public ArrayList<Evento> filter(Evento event);

    /**
     * Filtra os eventos pelo preço do ingresso.
     * 
     * @param price O preço do ingresso para filtrar os eventos.
     * @return Uma lista de eventos que possuem o preço de ingresso fornecido.
     */
    public ArrayList<Evento> filter(double price);
}

/**
 * Classe que representa um filtro de eventos, com base em diferentes critérios de filtragem.
 */
class Filtro {
    
    /** Lista de eventos históricos para aplicar os filtros. */
    private HistoricoEventos event_list;

    /**
     * Construtor para inicializar o filtro com uma lista de eventos.
     * 
     * @param event_list O histórico de eventos que será usado para filtragem.
     */
    public Filtro(HistoricoEventos event_list) {
        this.event_list = event_list;
    }

    /**
     * Filtra os eventos pela data fornecida.
     * 
     * @param date A data a ser usada como critério de filtragem.
     * @return Uma lista de eventos que ocorrem na data fornecida.
     */
    public ArrayList<Evento> filter(LocalDate date) {
        ArrayList<Evento> result = new ArrayList<Evento>();
        ArrayList<Evento> events = this.event_list.getEventList();
        
        // Itera sobre todos os eventos e verifica se a data corresponde
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getData().equals(date)) {  // Verifica se a data do evento é igual à fornecida
                result.add(events.get(i));
            }
        }
        return result;
    }

    /**
     * Filtra os eventos pelo tipo de evento fornecido.
     * 
     * @param event A classe do tipo de evento a ser usada para filtrar.
     * @return Uma lista de eventos que correspondem ao tipo de evento fornecido.
     */
    public ArrayList<Evento> filter(Class<?> event) {
        ArrayList<Evento> result = new ArrayList<Evento>();
        ArrayList<Evento> events = this.event_list.getEventList();
        
        // Itera sobre todos os eventos e verifica se o evento é da classe fornecida
        for (int i = 0; i < events.size(); i++) {
            if (event.isInstance(events.get(i))) {  // Verifica se o evento é uma instância da classe fornecida
                result.add(events.get(i));
            }
        }
        return result;
    }

    /**
     * Filtra os eventos pelo preço do ingresso.
     * 
     * @param price O preço do ingresso para filtrar os eventos.
     * @return Uma lista de eventos que possuem o preço de ingresso especificado.
     */
    public ArrayList<Evento> filter(double price) {
        ArrayList<Evento> result = new ArrayList<Evento>();
        ArrayList<Evento> events = this.event_list.getEventList();
        
        // Itera sobre todos os eventos e verifica se o preço do ingresso é igual ao fornecido
        for (int i = 0; i < events.size(); i++) {
            if (price == events.get(i).getPrecoIngresso()) {  // Verifica se o preço do ingresso é igual ao fornecido
                result.add(events.get(i));
            }
        }
        return result;
    }
}
