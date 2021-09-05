package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.estrategias.PagamentoEstrategia;
import br.edu.ifpb.padroes.service.log.LogHandler;
import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.observer.EmailNotificationListener;
import br.edu.ifpb.padroes.service.observer.SendEmail;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;

public class OrderManager {
    //TODO: Usar State
    public OrderManager(Order order) {
        this.order = order;
    }

    private Order order;

    private EmailNotification emailNotification = new EmailNotification();

    private PaymentService paymentService = new PaymentService();

    private LogService logService = new LogService(new LogHandler(LogHandler.LogHandlerType.FILE));

    /*public void payOrder(PaymentService.PaymentType paymentType) {
        order.setStatus(Order.OrderStatus.IN_PROGRESS);
        try {
            paymentService.doPayment(paymentType);
            order.setStatus(Order.OrderStatus.PAYMENT_SUCCESS);
            emailNotification.sendMailNotification(String.format("Order %d completed successfully", order.getId()));
            logService.info("payment finished");
        } catch (Exception e) {
            logService.error("payment refused");
            order.setStatus(Order.OrderStatus.PAYMENT_REFUSED);
            emailNotification.sendMailNotification(String.format("Order %d refused", order.getId()));
        }
    }

     */
    public PagamentoEstrategia payOrder(PagamentoEstrategia pagamento) {
        try {
            paymentService.doPayment(pagamento);
            SendEmail send = new SendEmail();
            send.event.subscribe("add", new EmailNotificationListener(emailNotification.email));

        } catch (Exception e){

        }
        return pagamento;
    }

    /*public void cancelOrder() {
        order.setStatus(Order.OrderStatus.CANCELED);
        emailNotification.sendMailNotification(String.format("Order %d canceled", order.getId()));
        logService.debug(String.format("order %d canceled", order.getId()));
    }

     */
    public void cancelOrder() {

    }

}
