package one.digital.singleton;

public class SingletonLazyHolder {

    private  static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {}

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
