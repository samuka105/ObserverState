package stateobserver;

import java.util.Observable;

public class Pedido extends Observable {

    private int numero;
    private EstadoPedido estado;

    public Pedido(int numero) {
        this.numero = numero;
        this.estado = EstadoNovo.getInstance();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
        setChanged();
        notifyObservers(estado.getNome());
    }

    public boolean pagar() {
        return estado.pagar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeEstado() {
        return estado.getNome();
    }
}
