package dio.subsistema1.crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade) {
        System.out.println("Cliente Cadastrado no Sistema CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);

    }
}
