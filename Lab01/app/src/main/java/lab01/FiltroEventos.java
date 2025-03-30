package lab01;

import java.time.LocalDate;
import java.time.Duration;
import java.util.ArrayList;

/**
 * Interface que define os métodos para filtrar eventos de acordo com diferentes critérios, como data, tipo de evento,
 * preço do ingresso e duração do evento.
 * 
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
    public ArrayList<Evento> filter(Class<?> event);

    /**
     * Filtra os eventos pelo preço do ingresso.
     * 
     * @param price O preço do ingresso para filtrar os eventos.
     * @return Uma lista de eventos que possuem o preço de ingresso fornecido.
     */
    public ArrayList<Evento> filter(double price);

    /**
     * Filtra os eventos pela duração especificada.
     * 
     * @param duration A duração para filtrar os eventos.
     * @return Uma lista de eventos que correspondem à duração fornecida.
     */
    public ArrayList<Evento> filter(Duration duration);
}

/**
 * Classe que representa um filtro de eventos, com base em diferentes critérios de filtragem.
 * Os critérios incluem data, tipo de evento, preço do ingresso e duração do evento.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Lucas Beserra - 281815
 */
class Filtro implements FiltroEventos{

    /** Lista de eventos históricos para aplicar os filtros. */
    private HistoricoEventos event_list;

    /** Lista para armazenar os resultados do filtro aplicado. */
    private ArrayList<Evento> result;

    /**
     * Construtor para inicializar o filtro com uma lista de eventos.
     * 
     * @param event_list O histórico de eventos que será usado para filtragem.
     */
    public Filtro(HistoricoEventos event_list) {
        this.event_list = event_list;
        this.result = new ArrayList<Evento>(); // Inicializa a lista de resultados do filtro
    }

    /**
     * Filtra os eventos pela data fornecida.
     * 
     * @param date A data a ser usada como critério de filtragem.
     * @return Uma lista de eventos que ocorrem na data fornecida.
     */
    public ArrayList<Evento> filter(LocalDate date) {
        ArrayList<Evento> events = this.event_list.getEventList();
        this.result.clear();
        
        // Itera sobre todos os eventos e verifica se a data do evento corresponde à data fornecida
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getData().equals(date)) {
                this.result.add(events.get(i));
            }
        }
        return this.result;
    }

    /**
     * Filtra os eventos pelo tipo de evento fornecido.
     * 
     * @param event A classe do tipo de evento a ser usada para filtrar.
     * @return Uma lista de eventos que correspondem ao tipo de evento fornecido.
     */
    public ArrayList<Evento> filter(Class<?> event) {
        ArrayList<Evento> events = this.event_list.getEventList();
        this.result.clear();
        
        // Itera sobre todos os eventos e verifica se o evento é uma instância da classe fornecida
        for (int i = 0; i < events.size(); i++) {
            if (event.isInstance(events.get(i))) {
                this.result.add(events.get(i));
            }
        }
        return this.result;
    }

    /**
     * Filtra os eventos pelo preço do ingresso fornecido.
     * 
     * @param price O preço do ingresso para filtrar os eventos.
     * @return Uma lista de eventos que possuem o preço de ingresso especificado.
     */
    public ArrayList<Evento> filter(double price) {
        ArrayList<Evento> events = this.event_list.getEventList();
        this.result.clear();
        
        // Itera sobre todos os eventos e verifica se o preço do ingresso é menor ou igual ao preço fornecido
        for (int i = 0; i < events.size(); i++) {
            if (price <= events.get(i).getPrecoIngresso()) {  // Verifica se o preço do ingresso é menor ou igual ao fornecido
                this.result.add(events.get(i));
            }
        }
        return this.result;
    }

    /**
     * Filtra os eventos pela duração fornecida.
     * 
     * @param duration A duração do evento para filtrar.
     * @return Uma lista de eventos que possuem uma duração menor ou igual à duração fornecida.
     */
    public ArrayList<Evento> filter(Duration duration) {
        ArrayList<Evento> events = this.event_list.getEventList();
        this.result.clear();
        
        // Itera sobre todos os eventos e verifica se a duração do evento é menor ou igual à duração fornecida
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getDuration().compareTo(duration) < 0 || 
                events.get(i).getDuration().equals(duration)) {
                this.result.add(events.get(i));
            }
        }
        return this.result;
    }

    /**
     * Exibe os resultados dos filtros aplicados.
     */
    public void showResult() {
        for (int i = 0; i < this.result.size(); i++) {
            System.out.println(this.result.get(i)); // Exibe cada evento na lista de resultados
        }
    }
}

