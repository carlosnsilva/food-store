package br.edu.ifpb.padroes.service.estrategias;

public interface PagamentoEstrategia {
    default String Pagar(){
        return "";
    }
}
