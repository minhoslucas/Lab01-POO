package lab01;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Contém a estrutura de implementação de um Evento do tipo Esporte
 * @author Lucas Beserra - 281815
 */

public class EventoEsporte extends Evento {
    private String timeDaCasa;
    private String timeVisitante;
    private String esporte;
    /**
     * Construtor da classe EventoEsporte
     * @param nome o nome do Evento
     * @param local o local do Evento
     * @param ingressos_vendidos a lista de ingressos vendidos do Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param date a data do Evento
     * @param timeDaCasa o time do local do Evento
     * @param timeVisitante o time visitante do Evento
     * @param esporte o tipo de esporte do Evento
     */

    public EventoEsporte(String nome, Local local, ArrayList<Ingresso> ingressos_vendidos, double precoIngresso,
                         LocalDate date, double duration, String timeDaCasa, String timeVisitante, String esporte) {
        super(nome, local, ingressos_vendidos, precoIngresso, date, duration);
        this.timeDaCasa = timeDaCasa;
        this.timeVisitante = timeVisitante;
        this.esporte = esporte;
    }
    /**
     * Retorna o time da casa
     * @return o time da casa
     */
    public String getTimeDaCasa() {
        return this.timeDaCasa;
    }
    /**
     * Altera o time da casa para `timeDaCasa`
     * @param timeDaCasa o time da casa
     */
    public void setTimeDaCasa(String timeDaCasa) {
        this.timeDaCasa = timeDaCasa;
    }
    /**
     * Retorna o time visitante
     * @return o time visitante
     */
    public String getTimeVisitante() {
        return this.timeVisitante;
    }
    /**
     * Altera o time da casa para `timeVisitante`
     * @param timeVisitante o time visitante
     */
    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }
    /**
     * Retorna o esporte que vai ser jogado no Evento
     * @return esporte
     */
    public String getEsporte() {
        return this.esporte;
    }
    /**
     * Altera o esporte que vai ser jogado para `esporte`
     * @param esporte
     */
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }
  
    /**
     * Imprime as informações do Evento
     */
    @Override
    public void showInfo() {
        System.out.println("Esporte:" + this.esporte);
        System.out.println("Jogo:" + this.timeDaCasa + "Vs" + this.timeVisitante);
        System.out.println("Capacidade: " + this.local.getCapacidade());
        System.out.println("Data: " + this.getData());
    }
}
