package stateobserver;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testTransicaoNotificaObservador() {
        Pedido pedido = new Pedido(1);
        Cliente cliente = new Cliente("Ana");
        cliente.acompanhar(pedido);

        pedido.pagar();

        assertEquals("Pago", pedido.getNomeEstado());
        assertEquals("Ana: pedido 1 agora está Pago", cliente.getUltimaNotificacao());
    }

    @Test
    public void testTransicaoInvalidaNaoNotifica() {
        Pedido pedido = new Pedido(2);
        Cliente cliente = new Cliente("Bia");
        cliente.acompanhar(pedido);

        boolean resultado = pedido.enviar();

        assertFalse(resultado);
        assertEquals("Novo", pedido.getNomeEstado());
        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    public void testVariosObservadoresNoFluxo() {
        Pedido pedido = new Pedido(3);
        Cliente cliente = new Cliente("Ana");
        CentralLogistica central = new CentralLogistica();
        cliente.acompanhar(pedido);
        central.acompanhar(pedido);

        pedido.pagar();
        pedido.enviar();

        assertEquals("Ana: pedido 3 agora está Enviado", cliente.getUltimaNotificacao());
        assertEquals("Logística registrou status: Enviado", central.getUltimaAcao());
    }
}
