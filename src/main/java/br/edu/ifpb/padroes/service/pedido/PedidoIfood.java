package br.edu.ifpb.padroes.service.pedido;

import br.edu.ifpb.padroes.service.bridge.OrderChegada;

public class PedidoIfood extends Pedido{

    public PedidoIfood(OrderChegada chegadaPedido){
        super(chegadaPedido);
    }

    @Override
    public void pedidoApp(String meio) {
        super.pedidoApp(meio);
    }
}
