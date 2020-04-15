package methodTemplate;

public abstract class Spoletto {
    public final void preparar(){
        escolherMassa();
        escolherMolho();
        primeiroAdicional();
        segundoAdicional();
        terceiroAdicional();
        prepararMassa();
        servirParaCliente();
    }

    private void servirParaCliente(){
        System.out.println("Entregando ao cliente sua massa ja pronta ....");
    }

    public abstract void escolherMassa();

    public abstract void escolherMolho();

    public abstract void primeiroAdicional();

    public abstract void  segundoAdicional();

    public abstract void  terceiroAdicional();

    public abstract void  prepararMassa();
}