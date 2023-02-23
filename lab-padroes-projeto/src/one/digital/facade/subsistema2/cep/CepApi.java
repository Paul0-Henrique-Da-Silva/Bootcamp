package one.digital.facade.subsistema2.cep;

// abistraindo uma api  de CEP
public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {}

    public static CepApi getInstancia() {
        return  instancia;
    }

    public String recuperarCidade(String cep) {
        return "Cotia";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
