import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente ada = new Cliente("Ada Lovelance", "ada@cardano.com", "121212121212");
        Cliente peter = new Cliente("Pete Targreen", "peter@ancapsu.com", "34543846");

        Notificador notificador = new NotificadorEmail();
        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativarCliente(ada);
        ativacaoCliente.ativarCliente(peter);
    }
}