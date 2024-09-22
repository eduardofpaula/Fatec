package ClasseObserver;

import InterfaceObserver.Observer;

// Classe Display, um observador que exibe a temperatura
public class Display implements Observer {
    @Override
    public void atualizar(float temperatura) {
        System.out.println("Display atualizado. Nova temperatura: " + temperatura + "°C");
    }
}
