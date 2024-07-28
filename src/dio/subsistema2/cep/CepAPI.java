package dio.subsistema2.cep;

import dio.Singleton.SingletonEager;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI(){
        super();
    }
    public static CepAPI getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Manaus";
    }
    public String recuperarEstado(String cep) {
        return "Amazonas";
    }
}
