package stateobserver;

public class EstadoEnviado extends EstadoPedido {

    private EstadoEnviado() {
    }

    private static EstadoEnviado instance = new EstadoEnviado();

    public static EstadoEnviado getInstance() {
        return instance;
    }

    public String getNome() {
        return "Enviado";
    }

    public boolean entregar(Pedido pedido) {
        pedido.setEstado(EstadoEntregue.getInstance());
        return true;
    }
}
