package br.edu.ifpb.padroes.service.observer;

import br.edu.ifpb.padroes.domain.Customer;
import br.edu.ifpb.padroes.service.mail.EmailNotification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Eventmanager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public Eventmanager(String... operations){
        for( String operation : operations){
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListener listener){
        List<EventListener> custom = listeners.get(event);
        custom.add(listener);
    }

    public void unsubscribe(String event, EventListener listener){
        List<EventListener> custom = listeners.get(event);
        custom.remove(listener);
    }

    public void notify(String event, Customer user){
        List<EventListener> custom = listeners.get(event);
        for (EventListener listener : custom){
            listener.update(event, user.getEmail());
        }
    }
}
