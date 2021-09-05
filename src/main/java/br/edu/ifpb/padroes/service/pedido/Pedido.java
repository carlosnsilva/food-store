package br.edu.ifpb.padroes.service.pedido;

import br.edu.ifpb.padroes.service.bridge.OrderChegada;

public class Pedido {
    protected OrderChegada chegadaPedido;

    public void pedidoApp(String meio){
        chegadaPedido.chegadaPedido(meio);
    }


}
