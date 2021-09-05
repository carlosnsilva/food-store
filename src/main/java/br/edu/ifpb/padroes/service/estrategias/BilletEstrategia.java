package br.edu.ifpb.padroes.service.estrategias;

public class BilletEstrategia implements PagamentoEstrategia{
    @Override
    public String Pagar() {
        String paguei = "A compra foi paga com Billet";
        return paguei;
    }
}
