package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;

public class EmissaoNotaFiscal {
    private Notificador notificador;

    public EmissaoNotaFiscal (Notificador notificador_) {
        this.notificador = notificador_;
    }

    public void emitir(Cliente cliente, Produto produto) {
        // exemplo generalista de umnota fiscal ...

        this.notificador.notificar(cliente, "Nota fiscal do produto"
                + produto.getNome() + "foi emitida!");

    }
}
