package br.edu.ifpb.padroes.service.observer;

public class SendEmail {

    public Eventmanager event;

    public SendEmail(){
        this.event = new Eventmanager("send");
    }
}
