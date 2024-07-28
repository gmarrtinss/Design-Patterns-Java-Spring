package dio;

import dio.Facade.Facade;
import dio.Singleton.SingletonEager;
import dio.Singleton.SingletonLazy;
import dio.Singleton.SingletonLazyHolder;
import dio.Strategy.*;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento ataque = new ComportamentodeAtaque();
        Comportamento defesa = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setStrategy(ataque);
        robo.move();
        robo.setStrategy(defesa);
        robo.move();



        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Guilherme", "69049010");
           }
}
