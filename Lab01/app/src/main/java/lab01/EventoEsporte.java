package lab01;

import java.time.LocalDate;
import java.time.Duration;

/**
 * Representa um Evento do tipo Esporte. Este evento está relacionado a uma competição esportiva entre dois times.
 * Contém informações como o time da casa, o time visitante e o tipo de esporte praticado.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Lucas Beserra - 281815
 */
public class EventoEsporte extends Evento {
    private String timeDaCasa;
    private String timeVisitante;
    private String esporte;

    /**
     * Construtor da classe EventoEsporte. Inicializa os atributos do Evento Esportivo.
     * 
     * @param nome o nome do Evento
     * @param local o local do Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param date a data do Evento
     * @param duration a duração do Evento
     * @param timeDaCasa o time da casa no Evento
     * @param timeVisitante o time visitante no Evento
     * @param esporte o tipo de esporte praticado no Evento
     */
    public EventoEsporte(String nome, Local local, double precoIngresso,
                         LocalDate date, Duration duration, String timeDaCasa, String timeVisitante, String esporte) {
        super(nome, local, precoIngresso, date, duration);
        this.timeDaCasa = timeDaCasa;
        this.timeVisitante = timeVisitante;
        this.esporte = esporte;
    }

    /**
     * Retorna o time da casa que participará do evento.
     * 
     * @return o nome do time da casa
     */
    public String getTimeDaCasa() {
        return this.timeDaCasa;
    }

    /**
     * Altera o time da casa para o valor especificado.
     * 
     * @param timeDaCasa o novo nome do time da casa
     */
    public void setTimeDaCasa(String timeDaCasa) {
        this.timeDaCasa = timeDaCasa;
    }

    /**
     * Retorna o time visitante que participará do evento.
     * 
     * @return o nome do time visitante
     */
    public String getTimeVisitante() {
        return this.timeVisitante;
    }

    /**
     * Altera o time visitante para o valor especificado.
     * 
     * @param timeVisitante o novo nome do time visitante
     */
    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    /**
     * Retorna o tipo de esporte que será praticado no evento.
     * 
     * @return o nome do esporte
     */
    public String getEsporte() {
        return this.esporte;
    }

    /**
     * Altera o tipo de esporte que será praticado no evento.
     * 
     * @param esporte o novo tipo de esporte
     */
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    /**
     * Exibe as informações detalhadas do Evento Esportivo, como o local, capacidade, duração,
     * tipo de esporte, times participantes e data do evento.
     */
    @Override
    public void showInfo() {
        System.out.println("Dados do Evento:\n");
        System.out.println("Local: " + this.getLocal().getNome());
        System.out.println("Capacidade: " + this.getLocal().getCapacidade());
        System.out.print("Duração: " + formatDuration(this.getDuration()));
        System.out.println("Esporte: " + this.esporte);
        System.out.println("Jogo: " + this.timeDaCasa + " Vs " + this.timeVisitante);
        System.out.println("Data: " + this.getData());
        System.out.println();
    }
}
