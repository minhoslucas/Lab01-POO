package lab01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Foi alterado o nome do artista com todos os testes de show, pois eu não conhecia as músicas da anavitória
 * para gerar a setlist do show delas.
 * 
 * Foi alterado o tipo da data e da duração do show para coincidir com a implementação escolhida
 * 
 * Foram criados novos testes (Histórico, Filtro e Faturamento) para demonstrar as funcionalidades
 * do histórico, do filtro (que usa o histórico) e do método que calcula o faturamento total
 * 
 * comentários dos testes gerados por IA e corrigidos posteriormente
 */

public class Lab01Test {

    /**
     * Testa o método getCapacidade do Evento.
     * Verifica se o método getCapacidade retorna corretamente a capacidade do local do evento.
     * Neste caso, foi criado um evento do tipo EventoShow com o local "Teatro Castro Mendes".
     * 
     * Espera-se que o método retorne a capacidade do local (2000).
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
        Duration time = Duration.ofHours(3).plusMinutes(30);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 199.90, date, "Kpop", "Yves", time);
        testEvento.setSetlist(setlist);

        assertEquals(2000, testEvento.getLocal().getCapacidade());
    }

    /**
     * Testa os métodos get e set para o atributo 'artista' da classe Evento.
     * Neste teste, o nome do artista do evento é alterado de "Yves" para "Anavitória".
     * 
     * Espera-se que o nome do artista seja atualizado corretamente.
     */
    @Test
    public void setAndGetArtistaEventoShow() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        ArrayList<String> setlist = new ArrayList<String>();
        setlist.add("DIM");
        setlist.add("Viola");
        setlist.add("See You In Hell");
        setlist.add("BIRD");
        Duration time = Duration.ofHours(3).plusMinutes(30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 199.90, date, "Kpop", "Yves", time);
        testEvento.setArtist("Anavitória");
        testEvento.setSetlist(setlist);

        assertEquals("Anavitória", testEvento.getArtist());
    }

    /**
     * Testa o método getPreco da classe Ingresso.
     * Verifica se o preço do ingresso meia é calculado corretamente como metade do preço do ingresso completo.
     * Neste caso, o ingresso do EventoShow tem preço 200, então espera-se que o preço do ingresso meia seja 100.
     */
    @Test
    public void getPrecoIngressoMeia() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        ArrayList<String> setlist = new ArrayList<String>();
        setlist.add("DIM");
        setlist.add("Viola");
        setlist.add("See You In Hell");
        setlist.add("BIRD");
        Duration time = Duration.ofHours(3).plusMinutes(30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 200, date, "Kpop", "Yves", time);
        testEvento.setSetlist(setlist);
        IngressoMeia ingressoMeia = new IngressoMeia(testEvento);

        assertEquals(100, ingressoMeia.getPreco());
        assertEquals(200, testEvento.getPrecoIngresso());
    }

    /**
     * Testa o método getPreco da classe Ingresso.
     * Verifica se o preço do ingresso inteiro é calculado corretamente, retornando o valor completo.
     * Neste caso, o ingresso do EventoShow tem preço 250, e espera-se que o preço do ingresso inteiro seja 250.
     */
    @Test
    public void getPrecoIngressoInteira() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        ArrayList<String> setlist = new ArrayList<String>();
        setlist.add("DIM");
        setlist.add("Viola");
        setlist.add("See You In Hell");
        setlist.add("BIRD");
        Duration time = Duration.ofHours(3).plusMinutes(30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 250, date, "Kpop", "Yves", time);
        testEvento.setSetlist(setlist);
        IngressoInteira ingressoInteira = new IngressoInteira(testEvento);

        assertEquals(250, ingressoInteira.getPreco());
    }

    /**
     * Testa o método adicionaIngresso da classe Evento.
     * Verifica se o ingresso meia é corretamente adicionado à lista de ingressos vendidos do evento.
     * Além disso, verifica se o ingresso foi corretamente atribuído ao usuário.
     */
    @Test
    public void adicionarIngressoMeia() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        ArrayList<String> setlist = new ArrayList<String>();
        setlist.add("DIM");
        setlist.add("Viola");
        setlist.add("See You In Hell");
        setlist.add("BIRD");
        Duration time = Duration.ofHours(3).plusMinutes(30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoShow testEvento = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 199.90, date, "Kpop", "Yves", time);
        testEvento.setSetlist(setlist);
        IngressoMeia ingressoMeia = new IngressoMeia(testEvento);
        Usuario usuarioTest = new Usuario("Gabriel", "gabriel@gmail.com");
        testEvento.adicionaIngresso(ingressoMeia, usuarioTest);

        assertEquals(1, testEvento.getIngressosVendidosQte());
        assertEquals(ingressoMeia, usuarioTest.getTicket());
    }

    /**
     * Testa o método addToList da classe HistoricoEventos.
     * Verifica se os eventos foram corretamente adicionados ao histórico de eventos.
     * Espera-se que a quantidade de eventos no histórico seja igual a 2.
     */
    @Test
    public void adicionaEventoemHistorico() {

        Local testLocal = new Local("Allianz Park", 40000);
        Duration time = Duration.ofHours(3).plusMinutes(30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoEsporte testEvento1 = new EventoEsporte("Clássico Rei", testLocal, 149.99, date, time, "Santos", "Palmeiras", "Futebol");
        EventoEsporte testEvento2 = new EventoEsporte("Final de Vôlei", testLocal, 149.99, date, time, "Brasil", "Argentina", "Vôlei");
        HistoricoEventos historicoTeste = new HistoricoEventos();
        historicoTeste.addToList(testEvento1);
        historicoTeste.addToList(testEvento2);

        assertEquals(2, historicoTeste.getEventList().size());
    }

    /**
     * Testa o filtro de eventos
     * Verifica se o filtro retorna corretamente os eventos do tipo EventoShow.
     * Espera-se que dois eventos do tipo EventoShow sejam encontrados.
     */
    @Test
    public void buscarEventosPorTipo() {

        Local testLocal = new Local("Allianz Park", 40000);
        Duration time = Duration.ofHours(3).plusMinutes(30);
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
        EventoShow testEvento1 = new EventoShow("Apple Cider Cinnamon Crunch", testLocal, 200, date, "Kpop", "Yves", time);
        testEvento1.setSetlist(setlist1);
        EventoShow testEvento2 = new EventoShow("Ready To Be Tour", testLocal, 200, date, "Kpop", "Twice", time);
        testEvento1.setSetlist(setlist2);
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

    /**
     * Testa o cálculo do faturamento
     * Verifica se o cálculo é feito de forma correta e que não são vendidos mais ingressos que o disponível
     * Espera-se que do faturamento seja R$1199.92 com 7 ingressos vendidos
     */
    @Test
    public void testarFaturamento() {
        //usuários gerados por IA
        Usuario user1 = new Usuario("Lucas", "lucas@gmail.com");
        Usuario user2 = new Usuario("Gabriel", "gabriel@gmail.com");
        Usuario user3 = new Usuario("Ana", "ana@gmail.com");
        Usuario user4 = new Usuario("Carlos", "carlos@gmail.com");
        Usuario user5 = new Usuario("Beatriz", "beatriz@gmail.com");
        Usuario user6 = new Usuario("Marcos", "marcos@gmail.com");
        Usuario user7 = new Usuario("Fernanda", "fernanda@gmail.com");
        Usuario user8 = new Usuario("Juliana", "juliana@gmail.com");

        Local testLocal = new Local("Allianz Park", 7);
        Duration time = Duration.ofHours(3).plusMinutes(30);
        LocalDate date = LocalDate.of(2025, 10, 25);
        EventoEsporte testEvento = new EventoEsporte("Clássico Rei", testLocal, 149.99, date, time, "Santos", "Palmeiras", "Futebol");
        testEvento.adicionaIngresso(new IngressoVIP(testEvento), user1);
        testEvento.adicionaIngresso(new IngressoInteira(testEvento), user2);
        testEvento.adicionaIngresso(new IngressoInteira(testEvento), user3);
        testEvento.adicionaIngresso(new IngressoInteira(testEvento), user4);
        testEvento.adicionaIngresso(new IngressoMeia(testEvento), user5);
        testEvento.adicionaIngresso(new IngressoMeia(testEvento), user6);
        testEvento.adicionaIngresso(new IngressoVIP(testEvento), user7);
        testEvento.adicionaIngresso(new IngressoVIP(testEvento), user8);

        assertEquals(1199.92, testEvento.calculaFaturamento());
        assertEquals(7, testEvento.getIngressosVendidosQte());
    }
}
