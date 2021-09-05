package br.edu.ifpb.padroes.service.estrategias;

public class DebitoEstrategia implements PagamentoEstrategia{
    @Override
    public String Pagar() {
        String paguei = "A compra foi paga com Cartão de Debito";
        return paguei;
    }
}
