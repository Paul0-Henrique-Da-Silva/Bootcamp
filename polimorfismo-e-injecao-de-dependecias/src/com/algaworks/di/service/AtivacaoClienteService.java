package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;

public class AtivacaoClienteService {
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador_) {
        this.notificador = notificador_;
    }

    public void ativarCliente (Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro esta ativo!");
    }
}
