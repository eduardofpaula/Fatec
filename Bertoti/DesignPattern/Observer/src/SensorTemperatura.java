import InterfaceObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura {
    private List<Observer> observers;  // Lista de observadores
    private float temperatura;

    public SensorTemperatura() {
        this.observers = new ArrayList<>();
    }

    // Adiciona um observador
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove um observador
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifica todos os observadores sobre a mudança de temperatura
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(temperatura);
        }
    }

    // Altera a temperatura e notifica os observadores
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notificarObservers();  // Notifica todos os observadores
    }
}
