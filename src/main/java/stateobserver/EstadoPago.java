package stateobserver;

public class EstadoPago extends EstadoPedido {

    private EstadoPago() {
    }

    private static EstadoPago instance = new EstadoPago();

    public static EstadoPago getInstance() {
        return instance;
    }

    public String getNome() {
        return "Pago";
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(EstadoEnviado.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(EstadoCancelado.getInstance());
        return true;
    }
}
