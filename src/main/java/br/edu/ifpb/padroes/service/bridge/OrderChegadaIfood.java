package br.edu.ifpb.padroes.service.bridge;

public class OrderChegadaIfood implements OrderChegada{
    @Override
    public void chegadaPedido(String meio) {
        System.out.println("O pedido chegou pelo: "+meio+"");
    }
}
