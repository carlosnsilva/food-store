package br.edu.ifpb.padroes.service.mail;

import br.edu.ifpb.padroes.domain.Customer;
import br.edu.ifpb.padroes.service.observer.EventListener;
import br.edu.ifpb.padroes.service.observer.Eventmanager;
// TODO: Observer

public class EmailNotification {

    //private String emailAdministration = "contact@food-store.com";
    private Eventmanager emailAdministration = new Eventmanager();
    public String email = "contact@food-store.com";

    /*public void sendMailNotification(String message, Customer customer) {
        System.out.println("send mail notification to "+ customer.getEmail());
    }

    public void sendMailNotification(String message) {
        System.out.println("send mail notification to ="+emailAdministration);
    }

     */
    public void sendMailNotification(String message, Customer customer) {
        System.out.println("send mail notification to "+ customer.getEmail());

    }


}
