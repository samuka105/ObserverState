package stateobserver;

public class EstadoEntregue extends EstadoPedido {

    private EstadoEntregue() {
    }

    private static EstadoEntregue instance = new EstadoEntregue();

    public static EstadoEntregue getInstance() {
        return instance;
    }

    public String getNome() {
        return "Entregue";
    }
}
