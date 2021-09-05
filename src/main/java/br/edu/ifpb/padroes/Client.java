package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.estrategias.DebitoEstrategia;
import br.edu.ifpb.padroes.service.estrategias.PagamentoEstrategia;
import br.edu.ifpb.padroes.service.order.OrderManager;
import br.edu.ifpb.padroes.service.payment.PaymentService;

public class Client {
    public static void main(String[] args) {

        Order order = new Order();
        OrderManager orderManager = new OrderManager(order);
        //orderManager.payOrder(PaymentService.PaymentType.CREDIT_CARD);
        orderManager.cancelOrder();

        PagamentoEstrategia pagamento = orderManager.payOrder(new DebitoEstrategia());
        pagamento.Pagar();


    }
}
