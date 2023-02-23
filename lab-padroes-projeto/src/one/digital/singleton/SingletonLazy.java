package one.digital.singleton;

//        O padrão Singleton é usado em Java (e em outras linguagens de programação) quando precisamos
//        garantir que exista apenas uma instância de uma determinada classe em toda a aplicação.

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {}

    public static SingletonLazy getInstancia() {
        if(instancia == null) { instancia = new SingletonLazy();}
        return instancia;
    }
    public void showMessage() {
        System.out.println("Olá, eu sou uma instância única de Singleton!");
    }
}
