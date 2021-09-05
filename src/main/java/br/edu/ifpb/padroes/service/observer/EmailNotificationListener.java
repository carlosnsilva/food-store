package br.edu.ifpb.padroes.service.observer;

public class EmailNotificationListener implements EventListener{
    private String email;

    public EmailNotificationListener(String email){
        this.email = email;
    }

    @Override
    public void update(String event, String email) {
        System.out.println("Email to "+ email+ " : Someone has performed "+event+" operation with the following" );
    }
}
