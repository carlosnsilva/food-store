package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.service.estrategias.PagamentoEstrategia;

public class PaymentService {

    public enum PaymentType {
        CREDIT_CARD, DEBIT, BILLET, PAYPAL
    }

    //TODO: Strategy
    /*public void doPayment(PaymentType type) throws Exception {
        switch (type) {
            case CREDIT_CARD:
                System.out.println("Do credit card payment!");
                break;
            case DEBIT:
                System.out.println("Do debit payment!");
                break;
            case BILLET:
                System.out.println("Do billet payment!");
                break;
            case PAYPAL:
                System.out.println("Do paypal payment!");
                break;
            default:
                throw new Exception("unknown payment method");
        }



    }

     */
    public void doPayment(PagamentoEstrategia pagamento) throws Exception {
        pagamento.Pagar();
    }

}
