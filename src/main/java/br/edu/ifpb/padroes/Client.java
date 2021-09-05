package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.bridge.OrderChegada;
import br.edu.ifpb.padroes.service.bridge.OrderChegadaIfood;
import br.edu.ifpb.padroes.service.estrategias.DebitoEstrategia;
import br.edu.ifpb.padroes.service.estrategias.PagamentoEstrategia;
import br.edu.ifpb.padroes.service.order.OrderManager;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.pedido.Pedido;
import br.edu.ifpb.padroes.service.pedido.PedidoIfood;

public class Client {
    private static OrderChegada pedidoChegada = new OrderChegadaIfood();

    public static void main(String[] args) {

        Pedido pedido = new PedidoIfood(pedidoChegada);
        pedido.pedidoApp("Ifood");
        Order order = new Order();
        OrderManager orderManager = new OrderManager(order);
        //orderManager.payOrder(PaymentService.PaymentType.CREDIT_CARD);


        PagamentoEstrategia pagamento = orderManager.payOrder(new DebitoEstrategia());
        pagamento.Pagar();

        orderManager.cancelOrder();

    }
}
