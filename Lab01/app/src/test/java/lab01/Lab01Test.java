package lab01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;



public class Lab01Test {

    /**
     * Testa se o getCapacidadeEvento retorna a capacidade do local do Evento
     * Foi mudado apenas o artista
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
        LocalTime time = LocalTime.of(3, 30);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 199.90, date, "Kpop", setlist, "Yves", time);
        assertEquals(2000, testEvento.getLocal().getCapacidade());
    }


    /**
     * Testa o get e seter do EventoShow para o atributo artista
     * Espera-se a troca de "Yves" por "Anavitória"
     */

    @Test
    public void setAndGetArtistaEventoShow() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        ArrayList<String> setlist = new ArrayList<String>();
        setlist.add("DIM");
        setlist.add("Viola");
        setlist.add("See You In Hell");
        setlist.add("BIRD");
        LocalTime time = LocalTime.of(3, 30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 199.90, date, "Kpop", setlist, "Yves", time);
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
        LocalTime time = LocalTime.of(3, 30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 200, date, "Kpop", setlist, "Yves", time);
        IngressoMeia ingressoMeia = new IngressoMeia(testEvento);
        assertEquals(100, ingressoMeia.getPreco());
        assertEquals(200, testEvento.getPrecoIngresso());
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
        LocalTime time = LocalTime.of(3, 30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 250, date, "Kpop", setlist, "Yves", time);
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
        LocalTime time = LocalTime.of(3, 30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 199.90, date, "Kpop", setlist, "Yves", time);
        IngressoMeia ingressoMeia = new IngressoMeia(testEvento);
        Usuario usuarioTest = new Usuario("Gabriel", "gabriel@gmail.com");
        testEvento.adicionaIngresso(ingressoMeia, usuarioTest);
        assertEquals(1, testEvento.getIngressosVendidosQte());
        assertEquals(ingressoMeia, usuarioTest.getTicket());

    }
    
    /**
     * Testa o método adicionarEvento do HistoricoEventos
     * Verifica se os dois eventos foram adicionados à lista de eventos
     * do HistoricoEventos
     */
    @Test
    public void adicionaEventoemHistorico() {

        Local testLocal = new Local("Allianz Park", 40000);
        LocalTime time = LocalTime.of(3, 30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoEsporte testEvento1 = new EventoEsporte("Clássico Rei", testLocal, 149.99, date, time, "Santos", "Palmeiras", "Futebol");
        EventoEsporte testEvento2 = new EventoEsporte("Final de Vôlei", testLocal, 149.99, date, time, "Brasil", "Argentina", "Vôlei");
        HistoricoEventos historicoTeste = new HistoricoEventos();
        historicoTeste.addToList(testEvento1);;
        historicoTeste.addToList(testEvento2);
        assertEquals(2, historicoTeste.getEventList().size());

    }

    /**
     * Testa o método buscarEventosPorTipo do HistoricoEventos
     * Verifica se os dois eventos do tipo EventoShow foram encontrados
     * pela busca
     */
    @Test
    public void buscarEventosPorTipo() {

        Local testLocal = new Local("Allianz Park", 40000);
        LocalTime time = LocalTime.of(3, 30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        ArrayList<String> setlist1 = new ArrayList<String>();
        setlist1.add("DIM");
        setlist1.add("Viola");
        setlist1.add("See You In Hell");
        setlist1.add("BIRD");
        ArrayList<String> setlist2 = new ArrayList<String>();
        setlist2.add("What Is Love");
        setlist2.add("Fancy");
        setlist2.add("I Can't Stop Me");
        setlist2.add("Likey");
        EventoShow testEvento1 = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 200, date, "Kpop", setlist1, "Yves", time);
        EventoShow testEvento2 = new EventoShow("Ready To Be Tour", testLocal, 200, date, "Kpop", setlist2, "Twice", time);
        EventoEsporte testEvento3 = new EventoEsporte("Clássico Rei", testLocal, 149.99, date, time, "Santos", "Palmeiras", "Futebol");
        EventoEsporte testEvento4 = new EventoEsporte("Final de Vôlei", testLocal, 149.99, date, time, "Brasil", "Argentina", "Vôlei");
        HistoricoEventos historicoTeste = new HistoricoEventos();
        historicoTeste.addToList(testEvento4);
        historicoTeste.addToList(testEvento3);
        historicoTeste.addToList(testEvento2);
        historicoTeste.addToList(testEvento1);
        Filtro filter = new Filtro(historicoTeste);
        ArrayList<Evento> result = filter.filter(EventoShow.class);
        assertEquals(2, result.size());
    }
}
