package lab01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;



public class Lab01Test {

    /**
     * Testa se o getCapacidadeEvento retorna a capacidade do local do Evento
     */
    @Test
    public void getCapacidadeEventoShow() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        ArrayList<String> setlist = new ArrayList<String>();
        setlist.add("DIM");
        setlist.add("Viola");
        setlist.add("See You In Hell");
        setlist.add("BIRD");
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, new ArrayList<Ingresso>() , 199.90, date, "Kpop", setlist, "Yves", 3.5);
        assertEquals(2000, testEvento.getLocal().getCapacidade());
    }


    /**
     * Testa o get e seter do EventoShow para o atributo artista
     * Espera-se a troca de "01/05/2025" por "Anavitória"
     */

    @Test
    public void setAndGetArtistaEventoShow() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        ArrayList<String> setlist = new ArrayList<String>();
        setlist.add("DIM");
        setlist.add("Viola");
        setlist.add("See You In Hell");
        setlist.add("BIRD");
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, new ArrayList<Ingresso>() , 199.90, date, "Kpop", setlist, "Yves", 3.5);
        testEvento.setArtist("Anavitória");
        assertEquals("Anavitória", testEvento.getArtist());
    }

    /**
     * Testa o método getPreco para o IngressoMeia
     * Espera o retorno da metade do valor (100) do ingresso do EventoShow criado (200)
     */

    @Test
    public void getPrecoIngressoMeia() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        ArrayList<String> setlist = new ArrayList<String>();
        setlist.add("DIM");
        setlist.add("Viola");
        setlist.add("See You In Hell");
        setlist.add("BIRD");
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, new ArrayList<Ingresso>() , 200, date, "Kpop", setlist, "Yves", 3.5);
        IngressoMeia ingressoMeia = new IngressoMeia(testEvento);
        assertEquals(100, ingressoMeia.getPreco());
    }


    /**
     * Testa o método getPreco para o IngressoInteira
     * Espera o retorno do valor (250) do ingresso do EventoShow criado
     */
    @Test
    public void getPrecoIngressoInteira() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        ArrayList<String> setlist = new ArrayList<String>();
        setlist.add("DIM");
        setlist.add("Viola");
        setlist.add("See You In Hell");
        setlist.add("BIRD");
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, new ArrayList<Ingresso>() , 250, date, "Kpop", setlist, "Yves", 3.5);
        IngressoInteira ingressoInteira = new IngressoInteira(testEvento);
        assertEquals(250, ingressoInteira.getPreco());
    }

    /**
     * Testa o método adicionarIngressoMeia
     * Verifica se o ingresso foi adicionado à lista de ingressos vendidos
     * e se o usuario agora tem o ingresso
     */
    @Test
    public void adicionarIngressoMeia() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        ArrayList<String> setlist = new ArrayList<String>();
        setlist.add("DIM");
        setlist.add("Viola");
        setlist.add("See You In Hell");
        setlist.add("BIRD");
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, new ArrayList<Ingresso>() , 199.90, date, "Kpop", setlist, "Yves", 3.5);
        IngressoMeia ingressoMeia = new IngressoMeia(testEvento);
        Usuario usuarioTest = new Usuario("Gabriel", "gabriel@me.com");
        testEvento.sellTicket(ingressoMeia, usuarioTest);
        assertEquals(1, testEvento.getSOldTickets().size());
        assertEquals(ingressoMeia, usuarioTest.getTicket());

    }
    
    /**
     * Testa o método adicionarEvento do HistoricoEventos
     * Verifica se os dois eventos foram adicionados à lista de eventos
     * do HistoricoEventos
     */
    @Test
    public void adicionaEventoemHistorico() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        EventoShow testEvento1 = new EventoShow("MPB em Campinas", testLocal, 200, "Djavan", "01/05/2025");
        EventoShow testEvento2 = new EventoShow("MPB em Campinas", testLocal, 200, "Anavitória", "02/05/2025");
        HistoricoEventos historicoTeste = new HistoricoEventos();
        historicoTeste.adicionarEvento(testEvento1);
        historicoTeste.adicionarEvento(testEvento2);
        assertEquals(2, historicoTeste.getEventos().size());

    }

    /**
     * Testa o método buscarEventosPorTipo do HistoricoEventos
     * Verifica se os dois eventos do tipo EventoShow foram encontrados
     * pela busca
     */
    @Test
    public void buscarEventosPorTipo() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        EventoShow testEvento1 = new EventoShow("MPB em Campinas", testLocal, 200, "Djavan", "01/05/2025");
        EventoShow testEvento2 = new EventoShow("MPB em Campinas", testLocal, 200, "Anavitória", "02/05/2025");        
        HistoricoEventos historicoTeste = new HistoricoEventos();
        historicoTeste.adicionarEvento(testEvento1);
        historicoTeste.adicionarEvento(testEvento2);
        assertEquals(2, historicoTeste.buscarEventosPorTipo(EventoShow.class).size());
    }
}
