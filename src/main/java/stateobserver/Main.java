package stateobserver;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(3001);

        Cliente cliente = new Cliente("Ana");
        cliente.acompanhar(pedido);

        CentralLogistica central = new CentralLogistica();
        central.acompanhar(pedido);

        pedido.pagar();
        System.out.println(cliente.getUltimaNotificacao());
        System.out.println(central.getUltimaAcao());

        pedido.enviar();
        System.out.println(cliente.getUltimaNotificacao());

        pedido.entregar();
        System.out.println(cliente.getUltimaNotificacao());
    }
}
