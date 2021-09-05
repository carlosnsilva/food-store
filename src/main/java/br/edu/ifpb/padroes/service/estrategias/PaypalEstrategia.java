package br.edu.ifpb.padroes.service.estrategias;

public class PaypalEstrategia implements PagamentoEstrategia{
    @Override
    public String Pagar() {
        String paguei = "A compra foi paga com Cartão de PAYPAL";
        return paguei;
    }
}
