package br.edu.ifpb.padroes.service.state;

public enum OrderStateEnum implements OrderState{
    IN_PROGRESS{
        public OrderState InProgressStatus(){
            System.out.println("Pedido em progresso");
            return null;
        }
    },

    CANCELED{
        public OrderState CanceledStatus(){
            System.out.println("Pedido em cancelado");
            return null;
        }
    }
}
