package stateobserver;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void acompanhar(Pedido pedido) {
        pedido.addObserver(this);
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void update(Observable o, Object arg) {
        Pedido pedido = (Pedido) o;
        this.ultimaNotificacao = nome + ": pedido " + pedido.getNumero() + " agora está " + arg;
    }
}
