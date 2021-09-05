package br.edu.ifpb.padroes.service.mail;

import br.edu.ifpb.padroes.domain.Customer;
// TODO: Observer

public class EmailNotification {

    private String emailAdministration = "contact@food-store.com";

    public void sendMailNotification(String message, Customer customer) {
        System.out.println("send mail notification to "+ customer.getEmail());
    }

    public void sendMailNotification(String message) {
        System.out.println("send mail notification to ="+emailAdministration);
    }


}
