package org.pedroamorim.projetobootcamp.service;

import org.pedroamorim.projetobootcamp.modelo.Cliente;
import org.pedroamorim.projetobootcamp.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
