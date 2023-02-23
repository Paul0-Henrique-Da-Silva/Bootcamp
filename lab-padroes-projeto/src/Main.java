import one.digital.singleton.SingletonEager;
import one.digital.singleton.SingletonLazy;
import one.digital.singleton.SingletonLazyHolder;
import one.digital.strategy.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        lazy.showMessage();

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        System.out.println("\t");

        System.out.println("Strategy");
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        System.out.println("\t");


    }
}