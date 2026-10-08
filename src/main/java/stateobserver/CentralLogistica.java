package stateobserver;

import java.util.Observable;
import java.util.Observer;

public class CentralLogistica implements Observer {

    private String ultimaAcao;

    public void acompanhar(Pedido pedido) {
        pedido.addObserver(this);
    }

    public String getUltimaAcao() {
        return ultimaAcao;
    }

    public void update(Observable o, Object arg) {
        this.ultimaAcao = "Logística registrou status: " + arg;
    }
}
