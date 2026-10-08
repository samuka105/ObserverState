package stateobserver;

public class EstadoNovo extends EstadoPedido {

    private EstadoNovo() {
    }

    private static EstadoNovo instance = new EstadoNovo();

    public static EstadoNovo getInstance() {
        return instance;
    }

    public String getNome() {
        return "Novo";
    }

    public boolean pagar(Pedido pedido) {
        pedido.setEstado(EstadoPago.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(EstadoCancelado.getInstance());
        return true;
    }
}
