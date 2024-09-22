package ClasseObserver;

import InterfaceObserver.Observer;

// Classe Aplicativo, um observador que recebe atualizações no aplicativo
public class Aplicativo implements Observer {
    @Override
    public void atualizar(float temperatura) {
        System.out.println("Aplicativo atualizado. Nova temperatura: " + temperatura + "°C");
    }
}
