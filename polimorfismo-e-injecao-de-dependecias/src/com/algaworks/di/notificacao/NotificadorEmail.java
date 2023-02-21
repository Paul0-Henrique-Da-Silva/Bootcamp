package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {
    @Override
    public void  notificar (Cliente cliente, String mensagem) {
        System.out.printf("Notificando: %s atraves do email %s: %s\n",
                            cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
