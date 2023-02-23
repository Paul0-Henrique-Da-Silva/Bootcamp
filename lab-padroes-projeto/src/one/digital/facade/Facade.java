package one.digital.facade;

import one.digital.facade.subsistema1.crm.CrmService;
import one.digital.facade.subsistema2.cep.CepApi;

public class Facade {
    public void MigrarCliente(String nome , String cep) {
        String recuperarCidade = CepApi.getInstancia().recuperarCidade(cep);
        String recuperarEstado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, recuperarCidade, recuperarEstado);

    }
}
