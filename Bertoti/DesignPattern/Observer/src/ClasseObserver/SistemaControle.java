package ClasseObserver;

import InterfaceObserver.Observer;

public class SistemaControle implements Observer {
    @Override
    public void atualizar(float temperatura) {
        System.out.println("Sistema de Controle atualizado. Nova temperatura: " + temperatura + "°C");
    }
}
