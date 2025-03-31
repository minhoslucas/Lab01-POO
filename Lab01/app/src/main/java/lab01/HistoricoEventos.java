package lab01;

import java.util.ArrayList;

/**
 * Classe que representa o histórico de eventos. Permite adicionar eventos à lista, 
 * acessar o histórico e exibir os detalhes dos eventos registrados.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Lucas Beserra - 281815
 */
public class HistoricoEventos {
    
    /** Lista que armazena todos os eventos registrados no histórico. */
    private ArrayList<Evento> event_list;

    /**
     * Construtor da classe HistoricoEventos. Inicializa a lista de eventos vazia.
     */
    public HistoricoEventos() {
        this.event_list = new ArrayList<Evento>();
    }

    /**
     * Retorna a lista de eventos do histórico.
     * 
     * @return A lista de eventos do histórico.
     */
    public ArrayList<Evento> getEventList() {
        return this.event_list;
    }

    /**
     * Define uma nova lista de eventos no histórico.
     * 
     * @param event_list A nova lista de eventos a ser definida.
     */
    public void setEventList(ArrayList<Evento> event_list) {
        this.event_list = event_list;
    }

    /**
     * Adiciona um evento ao histórico.
     * 
     * @param event O evento a ser adicionado ao histórico.
     */
    public void addToList(Evento event) {
        event_list.add(event);
    }

    /**
     * Exibe o histórico de eventos, incluindo o nome do evento e o preço do ingresso formatado.
     * A lista é exibida com o nome do evento e seu índice seguido do preço do ingresso.
     */
    public void showEventList() {
        for (int i = 0; i < event_list.size(); i++) {
            // Exibe o nome do evento e o índice com o preço do ingresso formatado
            System.out.print(event_list.get(i).getNome() + " (" + (i + 1) + ") ");
            System.out.printf("%,.2f\n", event_list.get(i).getPrecoIngresso()); // Exibe o preço com 2 casas decimais
        }
    }
}

