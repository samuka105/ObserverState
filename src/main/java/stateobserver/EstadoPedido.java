package stateobserver;

public abstract class EstadoPedido {

    public abstract String getNome();

    public boolean pagar(Pedido pedido) {
        return false;
    }

    public boolean enviar(Pedido pedido) {
        return false;
    }

    public boolean entregar(Pedido pedido) {
        return false;
    }

    public boolean cancelar(Pedido pedido) {
        return false;
    }
}
