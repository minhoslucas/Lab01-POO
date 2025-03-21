package lab01;

public class EventoEsporte extends Evento {
    private String timeDaCasa;
    private String timeVisitante;
    private int ingressos_vendidos;
    private String esporte;

    public EventoEsporte(String nome, Local local, double precoIngresso, String timeDaCasa, String timeVisitante, 
                        int ingressos_vendidos, String esporte) {
        super(nome, local, precoIngresso);
        this.timeDaCasa = timeDaCasa;
        this.timeVisitante = timeVisitante;
        this.ingressos_vendidos = 0;
        this.esporte = esporte;
    }

    public void exibirInformações() {
        System.out.println("Esporte:" + this.esporte);
        System.out.println("Jogo:" + this.timeDaCasa + "Vs" + this.timeVisitante);
        System.out.println("Capacidade: " + this.local.getCapacidade());
    }

    public void isFull() {
        if (this.local.getCapacidade() == this.ingressos_vendidos) {
            System.out.println("SOLD OUT");
        } else {
            System.out.println("TICKETS AVAILABLE");
        }
    }

    public void sellTicket(int num_tickets) {
        this.ingressos_vendidos += num_tickets;
    }

    public int getSoldTickets() {
        return this.ingressos_vendidos;
    }
}
