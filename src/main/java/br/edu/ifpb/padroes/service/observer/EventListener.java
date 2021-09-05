package br.edu.ifpb.padroes.service.observer;

import br.edu.ifpb.padroes.domain.Customer;

public interface EventListener {
    void update(String event, String email);
}
