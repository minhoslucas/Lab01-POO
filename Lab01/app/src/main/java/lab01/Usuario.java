/*
 * Usuario.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */
package lab01;

/**
 * Contém a estrutura de implementação de um Usuario.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 */
public class Usuario {

    private String nome;
    private String email;
    private Ingresso ticket; 

    
    /**
     * Construtor da classe Usuário
     * @param nome o nome do Usuário
     * @param email o email do Usuário
     * @param ticket o Ingresso do Usuário
     */
    public Usuario(String nome, String email, Ingresso ticket){
        this.nome = nome;
        this.email = email;
        this.ticket = ticket;
    }

    /**
     * Retorna o nome do usuário
     * @return o nome do usupario
     */
    public String getNome(){
        return nome;
    }

    /**
     * Altera o nome do usuário para `nome` 
     * @param nome o novo nome do usuário
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Retorna o novo e-mail
     * @return o email
     */
    public String getEmail(){
        return email;
    }

    /**
     * Altera o e-mail do usuário para `email`
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Retorna o ingresso do usuário
     * @return
     */

    public Ingresso getTicket() {
        return this.ticket;
    }
    /**
     * Altera o ingresso do usuário para `ticket`
     * @param ticket
     */

    public void setTicket(Ingresso ticket) {
        this.ticket = ticket;
    }
}
