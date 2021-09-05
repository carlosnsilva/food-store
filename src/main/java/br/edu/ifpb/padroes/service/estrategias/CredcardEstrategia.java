package br.edu.ifpb.padroes.service.estrategias;

public class CredcardEstrategia implements PagamentoEstrategia{
    @Override
    public String Pagar() {
        String paguei = "A compra foi paga com Cartão de Credito";
        return paguei;
    }
}
