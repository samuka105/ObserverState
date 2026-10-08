package stateobserver;

public class EstadoCancelado extends EstadoPedido {

    private EstadoCancelado() {
    }

    private static EstadoCancelado instance = new EstadoCancelado();

    public static EstadoCancelado getInstance() {
        return instance;
    }

    public String getNome() {
        return "Cancelado";
    }
}
